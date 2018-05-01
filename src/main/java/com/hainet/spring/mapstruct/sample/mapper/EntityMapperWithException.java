package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EntityMapperWithException {

    @Mappings({
            @Mapping(source = "nestedEntity", target = "nestedEntityModel"),
            @Mapping(target = "defaultValue", defaultValue = "undefined"),
            @Mapping(target = "constant", constant = "CONSTANT")
    })
    EntityModel entityToModelWithException(Entity entity) throws Exception;
}
