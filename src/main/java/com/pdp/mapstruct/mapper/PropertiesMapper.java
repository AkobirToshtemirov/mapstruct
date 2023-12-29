package com.pdp.mapstruct.mapper;

import com.pdp.mapstruct.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Properties;

@Mapper
public interface PropertiesMapper {
    @Mapping(target = "url", source = "database.")
    @Mapping(target = "username", source = "database.username")
    @Mapping(target = "password", source = "database.password")
    @Mapping(target = "secret", source = "secret")
    Person propertiesToPerson(Properties properties);
}