package com.hainet.spring.mapstruct.sample.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper
@Named("Decoration")
public interface NamedDecorationMapper {

    @Named("Emphasize")
    default String emphasize(String value) {
        return "**" + value + "**";
    }

    @Named("Strike")
    default String Strike(String value) {
        return "~~" + value + "~~";
    }
}
