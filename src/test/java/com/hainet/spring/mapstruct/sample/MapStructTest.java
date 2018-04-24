package com.hainet.spring.mapstruct.sample;

import com.hainet.spring.mapstruct.sample.entity.*;
import com.hainet.spring.mapstruct.sample.mapper.*;
import com.hainet.spring.mapstruct.sample.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Collections;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapStructTest {

    @Autowired
    private EntityMapper entityMapper;

    @Autowired
    private FullNameMapper fullNameMapper;

    @Autowired
    private CreditCardMapper creditCardMapper;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private AnnotatedMarkdownMapper annotatedMarkdownMapper;

    @Autowired
    private NamedMarkdownMapper namedMarkdownMapper;

    @Test
    public void basicMappingsTest() {
        // Entity
        final Entity entity = new Entity();
        entity.setValue("Value");
        entity.setPublicValue("Public value");
        entity.setDate(LocalDate.of(1970, 1, 1));
        entity.setList(Collections.emptyList());
        entity.setStream(Stream.empty());
        final NestedEntity nestedEntity = new NestedEntity();
        nestedEntity.setValue("Nested value");
        entity.setNestedEntity(nestedEntity);

        // Model
        final EntityModel model = new EntityModel();
        model.setValue("Value");
        model.setPublicValue("Public value");
        model.setDate(LocalDate.of(1970, 1, 1));
        model.setList(Collections.emptyList());
        model.setStream(Collections.emptyList());
        model.setToString("1970-01-01");
        model.setFormat("1970-01");
        final NestedEntityModel nestedEntityModel = new NestedEntityModel();
        nestedEntityModel.setValue("Nested value");
        model.setNestedEntityModel(nestedEntityModel);
        model.setConstant("CONSTANT");

        assertThat(entityMapper.entityToModel(entity), is(model));
    }

    @Test
    public void updatingExistingBeanInstancesTest() {
        // Entity
        final Entity entity = new Entity();
        entity.setValue("hainet");

        // Model
        final EntityModel model = new EntityModel();
        model.setValue("hainet");
        model.setConstant("CONSTANT");

        final EntityModel actual = new EntityModel();
        entityMapper.entityToModel(actual, entity);

        assertThat(actual, is(model));
    }

    @Test
    public void customMethodsToMappersTest() {
        // Entity
        final FullName fullName = new FullName();
        fullName.setFirstName("Haine");
        fullName.setLastName("Takano");

        // Model
        final FullNameModel fullNameModel = new FullNameModel();
        fullNameModel.setFullName("Haine Takano");

        assertThat(fullNameMapper.entityToModel(fullName), is(fullNameModel));
    }

    @Test
    public void severalSourceParametersTest() {
        // Entity
        final CreditCardNumber number = new CreditCardNumber();
        number.setNumber("1234567890123456");
        final CreditCardBrand brand = new CreditCardBrand();
        brand.setBrand("VISA");

        // Model
        final CreditCardModel model = new CreditCardModel();
        model.setNumber("1234567890123456");
        model.setBrand("VISA");

        assertThat(creditCardMapper.entityToModel(number, brand), is(model));
    }

    @Test
    public void directlyReferringToSourceParametersTest() {
        // Entity
        final Person entity = new Person();
        entity.setName("hainet");

        // Model
        final PersonModel model = new PersonModel();
        model.setName("hainet");
        model.setAge(25);

        assertThat(personMapper.entityToModel(entity, 25), is(model));
    }

    @Test
    public void mappingMethodSelectionBasedOnQualifiersTest() {
        // Raw
        final Text raw = new Text();
        raw.setValue("Text");

        // Decorated
        final Text emphasize = new Text();
        emphasize.setValue("**Text**");
        final Text strike = new Text();
        strike.setValue("~~Text~~");

        assertThat(annotatedMarkdownMapper.emphasize(raw), is(emphasize));
        assertThat(annotatedMarkdownMapper.strike(raw), is(strike));
        assertThat(namedMarkdownMapper.emphasize(raw), is(emphasize));
        assertThat(namedMarkdownMapper.strike(raw), is(strike));
    }
}
