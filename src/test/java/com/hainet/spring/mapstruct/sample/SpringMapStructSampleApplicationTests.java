package com.hainet.spring.mapstruct.sample;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.mapper.EntityMapper;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
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
public class SpringMapStructSampleApplicationTests {

    @Autowired
    private EntityMapper mapper;

    @Test
    public void contextLoads() {
        // Setup
        final Entity entity = new Entity();
        entity.setValue("hainet");
        entity.setDate(LocalDate.of(1970, 1, 1));

        final EntityModel model = new EntityModel();
        model.setValue("hainet");
        model.setDate(LocalDate.of(1970, 1, 1));
        model.setToString("1970-01-01");
        model.setFormat("1970-01");

        assertThat(mapper.entityToModel(entity), is(model));
    }
}
