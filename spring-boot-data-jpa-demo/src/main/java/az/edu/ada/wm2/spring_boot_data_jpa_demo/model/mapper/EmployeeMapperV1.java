package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;

import java.util.List;

public class EmployeeMapperV1 {

    public static EmployeeResponseDto employeeEntityToEmployeeResponseDto(EmployeeEntity employeeEntity) {
        if (employeeEntity == null) return null;

//        return new EmployeeResponseDto(
//                employeeEntity.getId(),
//                employeeEntity.getFirstName(),
//                employeeEntity.getLastName(),
//                employeeEntity.getEmail(),
//                employeeEntity.getHireDate(),
//                employeeEntity.getDepartment() == null
//                        ? null
//                        : employeeEntity.getDepartment().getName()
//        );
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

    public static List<EmployeeResponseDto> employeeEntitiesToEmployeeResponseDtos(List<EmployeeEntity> employeeEntities) {
        if (employeeEntities == null) return null;
        return employeeEntities.stream().map(
                EmployeeMapperV1::employeeEntityToEmployeeResponseDto
        ).toList();
    }
}
