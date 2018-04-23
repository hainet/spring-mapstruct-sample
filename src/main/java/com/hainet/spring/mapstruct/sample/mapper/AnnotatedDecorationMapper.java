package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.annotation.Decoration;
import com.hainet.spring.mapstruct.sample.annotation.Emphasize;
import com.hainet.spring.mapstruct.sample.annotation.Strike;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper
@Decoration
@Named("Decoration")
public interface AnnotatedDecorationMapper {

    @Emphasize
    @Named("Emphasize")
    default String emphasize(String value) {
        return "**" + value + "**";
    }

    @Strike
    @Named("Strike")
    default String Strike(String value) {
        return "~~" + value + "~~";
    }
}
