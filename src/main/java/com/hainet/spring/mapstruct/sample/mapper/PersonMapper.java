package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Person;
import com.hainet.spring.mapstruct.sample.model.PersonModel;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    PersonModel entityToModel(Person entity, int age);
}
