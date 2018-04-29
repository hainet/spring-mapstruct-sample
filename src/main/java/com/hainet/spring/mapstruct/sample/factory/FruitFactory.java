package com.hainet.spring.mapstruct.sample.factory;

import com.hainet.spring.mapstruct.sample.model.Apple;
import org.springframework.stereotype.Component;

@Component
public class FruitFactory {

    public Apple createApple() {
        final Apple apple = new Apple();
        apple.setColor("Red");

        return apple;
    }
}
