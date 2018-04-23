package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.annotation.Decoration;
import com.hainet.spring.mapstruct.sample.annotation.Emphasize;
import com.hainet.spring.mapstruct.sample.annotation.Strike;
import com.hainet.spring.mapstruct.sample.entity.Text;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = AnnotatedDecorationMapper.class)
public interface AnnotatedMarkdownMapper {

    @Mapping(target = "value", qualifiedBy = {Decoration.class, Emphasize.class})
    Text emphasize(Text text);

    @Mapping(target = "value", qualifiedBy = {Decoration.class, Strike.class})
    Text strike(Text text);
}
