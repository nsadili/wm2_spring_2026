package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private Double salary;
    private LocalDate hireDate;
    private AddressRequestDto addressRequestDto;
    private EmployeeDepartmentRequestDto departmentRequestDto;
}
