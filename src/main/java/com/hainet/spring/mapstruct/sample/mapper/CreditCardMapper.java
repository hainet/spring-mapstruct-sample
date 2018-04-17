package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.CreditCard;
import com.hainet.spring.mapstruct.sample.model.CreditCardModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CreditCardMapper {

    @Mapping(source = "goodThru", target = "goodThru", dateFormat = "YYYY-MM")
    CreditCardModel entityToModel(CreditCard entity);
}
