package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Text;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = NamedDecorationMapper.class)
public interface NamedMarkdownMapper {

    @Mapping(target = "value", qualifiedByName = {"Decoration", "Emphasize"})
    Text emphasize(Text text);

    @Mapping(target = "value", qualifiedByName = {"Decoration", "Strike"})
    Text strike(Text text);
}
