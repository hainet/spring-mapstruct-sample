package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.model.ExpressionModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ExpressionMapper {

    @Mapping(target = "value", expression = "java(value * value)")
    ExpressionModel power(Integer value);
}
