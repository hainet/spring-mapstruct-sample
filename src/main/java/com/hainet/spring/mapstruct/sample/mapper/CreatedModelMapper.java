package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.factory.CreatedModelFactory;
import com.hainet.spring.mapstruct.sample.model.CreatedModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = CreatedModelFactory.class)
public interface CreatedModelMapper {

    @Mapping(target = "name", ignore = true)
    CreatedModel entityToModel(Entity entity);
}
