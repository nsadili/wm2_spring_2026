package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto.EmployeeDepartmentRequestDto;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.DepartmentEntity;

public enum DepartmentMapper {
    INSTANCE;

    public DepartmentEntity employeeDepartmentRequestDtoToDepartmentEntity(EmployeeDepartmentRequestDto departmentRequestDto) {
        return DepartmentEntity.builder()
                .name(departmentRequestDto.getName())
                .build();
    }
}
