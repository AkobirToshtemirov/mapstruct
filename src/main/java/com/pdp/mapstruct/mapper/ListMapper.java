package com.pdp.mapstruct.mapper;

import com.pdp.mapstruct.entity.Destination;
import com.pdp.mapstruct.entity.Source;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ListMapper {
    List<Destination> sourceListToDestinationList(List<Source> sourceList);

    List<Source> destinationListToSourceList(List<Destination> destinationList);
}

