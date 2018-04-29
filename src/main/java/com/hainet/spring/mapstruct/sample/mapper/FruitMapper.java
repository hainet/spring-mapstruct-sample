package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.factory.FruitFactory;
import com.hainet.spring.mapstruct.sample.model.Apple;
import com.hainet.spring.mapstruct.sample.model.Fruit;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;

@Mapper(uses = FruitFactory.class)
public interface FruitMapper {

    @BeanMapping(resultType = Apple.class)
    Fruit entityToModel(Entity entity);
}
