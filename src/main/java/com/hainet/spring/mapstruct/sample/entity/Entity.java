package com.hainet.spring.mapstruct.sample.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Entity {

    private String value;

    public String publicValue;

    private LocalDate date;

    private List<String> list;

    private NestedEntity nestedEntity;
}
