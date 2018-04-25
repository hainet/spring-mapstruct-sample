package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.annotation.Decoration;
import com.hainet.spring.mapstruct.sample.annotation.Emphasize;
import com.hainet.spring.mapstruct.sample.annotation.Strike;
import org.mapstruct.Mapper;

@Mapper
@Decoration
public interface AnnotatedDecorationMapper {

    @Emphasize
    default String emphasize(String value) {
        return "**" + value + "**";
    }

    @Strike
    default String Strike(String value) {
        return "~~" + value + "~~";
    }
}
