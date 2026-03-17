package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;

import java.util.List;

public enum EmployeeMapperV2 {
    INSTANCE;

    public EmployeeResponseDto employeeEntityToEmployeeResponseDto(EmployeeEntity employeeEntity) {
        if (employeeEntity == null) return null;

        return EmployeeResponseDto.builder()
                .id(employeeEntity.getId())
                .firstName(employeeEntity.getFirstName())
                .hireDate(employeeEntity.getHireDate())
                .lastName(employeeEntity.getLastName())
                .email(employeeEntity.getEmail())
                .departmentName(employeeEntity.getDepartment() == null
                        ? null
                        : employeeEntity.getDepartment().getName())
                .build();
    }

    public List<EmployeeResponseDto> employeeEntitiesToEmployeeResponseDtos(List<EmployeeEntity> employeeEntities) {
        if (employeeEntities == null) return null;
        return employeeEntities.stream().map(
                EmployeeMapperV2.INSTANCE::employeeEntityToEmployeeResponseDto
        ).toList();
    }
}
