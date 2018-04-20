package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Name;
import com.hainet.spring.mapstruct.sample.model.NameModel;
import org.mapstruct.Mapper;

@Mapper
public interface NameMapper {

    default NameModel entityToModel(Name entity) {
        if (entity == null) {
            return null;
        }

        final NameModel model = new NameModel();
        model.setFullName(entity.getFirstName() + " " + entity.getLastName());

        return model;
    }
}
