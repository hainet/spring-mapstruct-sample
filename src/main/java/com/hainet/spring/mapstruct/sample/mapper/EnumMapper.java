package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Height;
import com.hainet.spring.mapstruct.sample.model.Size;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;

@Mapper
public interface EnumMapper {

    @ValueMappings({
            @ValueMapping(source = MappingConstants.NULL, target = "M"),
            @ValueMapping(source = "SHORT", target = "S"),
            @ValueMapping(source = "TALL", target = "L"),
            @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "ORDER")
    })
    Size heightToSize(Height height);
}
