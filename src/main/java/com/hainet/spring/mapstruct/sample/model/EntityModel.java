package com.hainet.spring.mapstruct.sample.model;

import lombok.Data;

import java.util.List;

@Data
public class EntityModel {

    private String value;

    public String publicValue;

    private List<String> list;

    private List<String> stream;

    private NestedEntityModel nestedEntityModel;

    private String constant;

    private String defaultValue;
}
