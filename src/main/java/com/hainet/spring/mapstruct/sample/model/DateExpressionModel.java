package com.hainet.spring.mapstruct.sample.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DateExpressionModel {

    private LocalDate date;

    private String toString;

    private String format;

    private LocalDate expressed;
}
