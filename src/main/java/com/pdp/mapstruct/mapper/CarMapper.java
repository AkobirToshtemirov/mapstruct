package com.pdp.mapstruct.mapper;

import com.pdp.mapstruct.dto.CarDTO;
import com.pdp.mapstruct.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {
    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID().toString())")
    Car toEntity(CarDTO carDTO);
}
