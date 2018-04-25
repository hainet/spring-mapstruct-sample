package com.hainet.spring.mapstruct.sample.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DateModel {

    private LocalDate date;

    private String toString;

    private String format;
}
