package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
import org.mapstruct.*;

@Mapper(uses = NestedEntityMapper.class)
public interface EntityMapper {

    @Mappings({
            @Mapping(source = "nestedEntity", target = "nestedEntityModel"),
            @Mapping(target = "defaultValue", defaultValue = "undefined"),
            @Mapping(target = "constant", constant = "CONSTANT")
    })
    EntityModel entityToModel(Entity entity);

    @InheritConfiguration
    void entityToModel(@MappingTarget EntityModel model, Entity entity);
}
