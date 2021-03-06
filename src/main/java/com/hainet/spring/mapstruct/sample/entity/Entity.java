package com.hainet.spring.mapstruct.sample.entity;

import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

@Data
public class Entity {

    private String value;

    public String publicValue;

    private List<String> list;

    private Stream<String> stream;

    private NestedEntity nestedEntity;

    private String defaultValue;
}
