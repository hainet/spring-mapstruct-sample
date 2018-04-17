package com.hainet.spring.mapstruct.sample.model;

import lombok.Data;

@Data
public class CreditCardModel {

    private int id;

    private String number;

    private String goodThru;
}
