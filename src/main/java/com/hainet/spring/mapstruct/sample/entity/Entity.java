package com.hainet.spring.mapstruct.sample.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Entity {

    private String value;

    private LocalDate date;
}
