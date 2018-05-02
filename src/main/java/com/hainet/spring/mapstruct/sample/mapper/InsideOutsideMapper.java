package com.hainet.spring.mapstruct.sample.mapper;

import com.hainet.spring.mapstruct.sample.entity.Inside;
import com.hainet.spring.mapstruct.sample.model.Outside;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface InsideOutsideMapper {

    @Mapping(source = "inside", target = "outside")
    Outside insideToOutside(Inside inside);

    @InheritInverseConfiguration
    Inside outsideToInside(Outside outside);
}
