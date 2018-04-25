package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.model.DateModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.LocalDate;

@Mapper
public interface DateExpressionMapper {

    @Mappings({
            @Mapping(source = "date", target = "date"),
            @Mapping(source = "date", target = "toString"),
            @Mapping(source = "date", target = "format", dateFormat = "yyyy-MM"),
    })
    DateModel entityToModel(LocalDate date);
}
