package com.hainet.spring.mapstruct.sample;

import com.hainet.spring.mapstruct.sample.entity.CreditCard;
import com.hainet.spring.mapstruct.sample.mapper.CreditCardMapper;
import com.hainet.spring.mapstruct.sample.model.CreditCardModel;
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
    private CreditCardMapper mapper;

    @Test
    public void contextLoads() {
        // Setup
        final CreditCard entity = new CreditCard();
        entity.setId(1);
        entity.setNumber("1234567890123456");
        entity.setGoodThru(LocalDate.of(2018, 4, 30));

        final CreditCardModel model = new CreditCardModel();
        model.setId(1);
        model.setNumber("1234567890123456");
        model.setGoodThru("2018-04");

        assertThat(mapper.entityToModel(entity), is(model));
    }
}
