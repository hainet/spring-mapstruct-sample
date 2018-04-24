package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.DateExpression;
import com.hainet.spring.mapstruct.sample.model.DateExpressionModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface DateExpressionMapper {

    @Mappings({
            @Mapping(source = "entity.date", target = "toString"),
            @Mapping(source = "entity.date", target = "format", dateFormat = "yyyy-MM"),
            @Mapping(target = "expressed", expression = "java(java.time.LocalDate.of(year, month, day))")
    })
    DateExpressionModel entityToModel(DateExpression entity, int year, int month, int day);
}
