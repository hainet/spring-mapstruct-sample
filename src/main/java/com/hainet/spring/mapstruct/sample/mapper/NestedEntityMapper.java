package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.NestedEntity;
import com.hainet.spring.mapstruct.sample.model.NestedEntityModel;
import org.mapstruct.Mapper;

@Mapper
public interface NestedEntityMapper {

    NestedEntityModel entityToModel(NestedEntity entity);
}
