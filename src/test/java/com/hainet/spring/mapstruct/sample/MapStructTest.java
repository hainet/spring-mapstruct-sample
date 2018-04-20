package com.hainet.spring.mapstruct.sample;

import com.hainet.spring.mapstruct.sample.entity.*;
import com.hainet.spring.mapstruct.sample.mapper.CreditCardMapper;
import com.hainet.spring.mapstruct.sample.mapper.EntityMapper;
import com.hainet.spring.mapstruct.sample.mapper.FullNameMapper;
import com.hainet.spring.mapstruct.sample.model.CreditCardModel;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
import com.hainet.spring.mapstruct.sample.model.FullNameModel;
import com.hainet.spring.mapstruct.sample.model.NestedEntityModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

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

    @Test
    public void basicMappingsTest() {
        // Entity
        final Entity entity = new Entity();
        entity.setValue("hainet");
        entity.setDate(LocalDate.of(1970, 1, 1));
        final NestedEntity nestedEntity = new NestedEntity();
        nestedEntity.setValue("hainet");
        entity.setNestedEntity(nestedEntity);

        // Model
        final EntityModel model = new EntityModel();
        model.setValue("hainet");
        model.setDate(LocalDate.of(1970, 1, 1));
        model.setToString("1970-01-01");
        model.setFormat("1970-01");
        final NestedEntityModel nestedEntityModel = new NestedEntityModel();
        nestedEntityModel.setValue("hainet");
        model.setNestedEntityModel(nestedEntityModel);
        model.setConstant("CONSTANT");

        assertThat(entityMapper.entityToModel(entity), is(model));
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
}
