package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.config.EntityMapperConfig;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
import org.mapstruct.Mapper;

@Mapper(config = EntityMapperConfig.class)
public interface EntityMapperWithMapperConfig {

    EntityModel stringToEntityModel(String ignored);
}
