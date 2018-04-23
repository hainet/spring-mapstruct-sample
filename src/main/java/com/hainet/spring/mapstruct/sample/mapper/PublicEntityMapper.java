package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.PublicEntity;
import com.hainet.spring.mapstruct.sample.model.PublicEntityModel;
import org.mapstruct.Mapper;

@Mapper
public interface PublicEntityMapper {

    PublicEntityModel entityToModel(PublicEntity entity);
}
