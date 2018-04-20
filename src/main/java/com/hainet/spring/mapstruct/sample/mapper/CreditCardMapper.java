package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.CreditCardBrand;
import com.hainet.spring.mapstruct.sample.entity.CreditCardNumber;
import com.hainet.spring.mapstruct.sample.model.CreditCardModel;
import org.mapstruct.Mapper;

@Mapper
public interface CreditCardMapper {

    CreditCardModel entityToModel(CreditCardNumber number, CreditCardBrand brand);
}
