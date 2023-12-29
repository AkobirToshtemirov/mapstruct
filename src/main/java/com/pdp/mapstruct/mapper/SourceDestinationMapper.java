package com.pdp.mapstruct.mapper;

import com.pdp.mapstruct.entity.Destination;
import com.pdp.mapstruct.entity.Source;
import org.mapstruct.Mapper;

@Mapper
public interface SourceDestinationMapper {
    Destination sourceToDestination(Source source);
    Source destinationToSource(Destination destination);
}

