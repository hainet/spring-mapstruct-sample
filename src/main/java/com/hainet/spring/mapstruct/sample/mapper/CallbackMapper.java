package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Entity;
import com.hainet.spring.mapstruct.sample.model.EntityModel;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CallbackMapper {

    @BeforeMapping
    default void before(Entity entity) {
        System.out.println("=== Before ===");
        System.out.println("Entity: " + entity);
    }

    @AfterMapping
    default void after(Entity entity, @MappingTarget EntityModel model) {
        System.out.println("=== After ===");
        System.out.println("Entity: " + entity);
        System.out.println("Model: " + model);
    }

    EntityModel toModel(Entity entity);
}
