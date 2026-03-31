package az.edu.ada.wm2.spring_boot_data_jpa_demo.config;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.AddressEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.DepartmentEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataBootstraper {

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            System.out.println("Hello from the CommandLineRunner");

            var savedEmp1 = EmployeeEntity.builder()
                    .firstName("John")
                    .lastName("Doe")
                    .email("jdoe@gmail.com")
                    .salary(1335.0)
                    .hireDate(LocalDate.of(2021, 4, 23))
                    .address(AddressEntity.builder()
                            .street("123 Main St")
                            .city("Munich")
                            .country("Germany")
                            .build())
                    .department(DepartmentEntity.builder()
                            .name("HR")
                            .build())
                    .build();
            savedEmp1 = employeeRepository.save(savedEmp1);

            System.out.println("savedEmp1: " + savedEmp1);
        };
    }

}
