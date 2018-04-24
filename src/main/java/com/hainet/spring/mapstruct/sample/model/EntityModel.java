package com.hainet.spring.mapstruct.sample.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EntityModel {

    private String value;

    public String publicValue;

    private LocalDate date;

    private List<String> list;

    private String toString;

    private String format;

    private NestedEntityModel nestedEntityModel;

    private String constant;
}
