package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(uses = NestedEntityMapper.class)
public interface EntityMapper {

    @Mappings({
            @Mapping(source = "date", target = "toString"),
            @Mapping(source = "date", target = "format", dateFormat = "yyyy-MM"),
            @Mapping(source = "nestedEntity", target = "nestedEntityModel")
    })
    EntityModel entityToModel(Entity entity);
}
