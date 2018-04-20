package com.hainet.spring.mapstruct.sample.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EntityModel {

    private String value;

    private LocalDate date;

    private String toString;

    private String format;

    private NestedEntityModel nestedEntityModel;

    private String constant;

    private FullNameModel fullNameModel;
}
