package com.hainet.spring.mapstruct.sample.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreditCard {

    private int id;

    private String number;

    private LocalDate goodThru;
}
