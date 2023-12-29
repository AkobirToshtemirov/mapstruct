package com.pdp.mapstruct.mapper;

import com.pdp.mapstruct.dto.EmployeeDTO;
import com.pdp.mapstruct.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {
    @Mapping(source = "employeeId", target = "id")
    @Mapping(source = "employeeName", target = "name")
    Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);

    @Mapping(source = "id", target = "employeeId")
    @Mapping(source = "name", target = "employeeName")
    EmployeeDTO employeeToEmployeeDTO(Employee employee);
}
