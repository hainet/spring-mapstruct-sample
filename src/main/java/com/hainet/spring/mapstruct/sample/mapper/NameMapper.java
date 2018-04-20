package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.FullName;
import com.hainet.spring.mapstruct.sample.model.FullNameModel;
import org.mapstruct.Mapper;

@Mapper
public interface NameMapper {

    default FullNameModel entityToModel(FullName entity) {
        if (entity == null) {
            return null;
        }

        final FullNameModel model = new FullNameModel();
        model.setFullName(entity.getFirstName() + " " + entity.getLastName());

        return model;
    }
}
