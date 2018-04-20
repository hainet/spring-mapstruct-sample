package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.NestedEntity;
import com.hainet.spring.mapstruct.sample.model.NestedEntityModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface NestedEntityMapper {

    @Mapping(source = "value", target = "value")
    NestedEntityModel entityToModel(NestedEntity entity);
}
