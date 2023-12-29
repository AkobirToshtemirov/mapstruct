package com.pdp.mapstruct.mapper;

import com.pdp.mapstruct.dto.CarDTO;
import com.pdp.mapstruct.dto.EmployeeDTO;
import com.pdp.mapstruct.dto.MultipleDTO;
import org.mapstruct.Mapper;

@Mapper
public interface MultipleDTOMapper {
    MultipleDTO mapToMultipleDTO(EmployeeDTO employeeDTO, CarDTO carDTO);
}
