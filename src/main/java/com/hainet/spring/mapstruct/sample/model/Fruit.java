package com.hainet.spring.mapstruct.sample.model;

public interface Fruit {

    default String introduce() {
        return "I am " + this.getClass().getSimpleName() + "!";
    }
}
