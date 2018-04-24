package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(uses = NestedEntityMapper.class)
public interface EntityMapper {

    @Mappings({
            @Mapping(source = "nestedEntity", target = "nestedEntityModel"),
            @Mapping(constant = "CONSTANT", target = "constant"),
    })
    EntityModel entityToModel(Entity entity);

    @Mappings({
            @Mapping(source = "nestedEntity", target = "nestedEntityModel"),
            @Mapping(constant = "CONSTANT", target = "constant"),
    })
    void entityToModel(@MappingTarget EntityModel model, Entity entity);
}
