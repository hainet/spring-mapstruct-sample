package com.hainet.spring.mapstruct.sample.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Entity {

    private String value;

    private LocalDate date;

    private NestedEntity nestedEntity;

    private FullName fullName;
}
