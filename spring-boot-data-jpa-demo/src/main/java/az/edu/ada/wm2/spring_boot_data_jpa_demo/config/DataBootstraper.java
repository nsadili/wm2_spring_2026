package az.edu.ada.wm2.spring_boot_data_jpa_demo.config;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.AddressEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.DepartmentEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.DepartmentRepository;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@RequiredArgsConstructor
public class DataBootstraper {

    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository,
                                               DepartmentRepository departmentRepository) {
        return args -> {
            System.out.println("Hello from CommandLineRunner");

            //TODO: solve detached entity issue
            //save the department here
//            var sb = departmentRepository.save(DepartmentEntity.builder().name("SB").build());
//            var spia = departmentRepository.save(DepartmentEntity.builder().name("SPIA").build());

            var site = departmentRepository.findById(1L).orElseThrow();

            //save a new employee
            EmployeeEntity employeeEntity = EmployeeEntity.builder()
                    .firstName("Heydar")
                    .lastName("Alizada")
                    .email("halizada@gmail.com")
                    .salary(2345.0)
                    .hireDate(LocalDate.of(2022, 1, 2))
                    .address(AddressEntity.builder()
                            .street("Kh.Shushinskiy 43")
                            .city("Baku")
                            .country("Azerbaijan")
                            .build())
                    .department(DepartmentEntity.builder().name("SITE").build())
                    .build();
            System.out.println(employeeRepository.save(employeeEntity));

            EmployeeEntity employeeEntity2 = EmployeeEntity.builder()
                    .firstName("Nurlana")
                    .lastName("Ismayilova")
                    .email("nismayilova@gmail.com")
                    .salary(3214.0)
                    .hireDate(LocalDate.of(2023, 1, 2))
                    .address(AddressEntity.builder()
                            .street("A.Aghaoglu 61")
                            .city("Baku")
                            .country("Azerbaijan")
                            .build())
                    .department(DepartmentEntity.builder().name("SB").build())
                    .build();
            System.out.println(employeeRepository.save(employeeEntity2));

            EmployeeEntity employeeEntity3 = EmployeeEntity.builder()
                    .firstName("Ismayil")
                    .lastName("Rustamov")
                    .email("irustamov@gmail.com")
                    .salary(4325.0)
                    .hireDate(LocalDate.of(2022, 5, 19))
                    .address(AddressEntity.builder()
                            .street("M.Sh.Vazeh 38")
                            .city("Sumgayit")
                            .country("Azerbaijan")
                            .build())
                    .department(DepartmentEntity.builder().name("SPIA").build())
                    .build();
            System.out.println(employeeRepository.save(employeeEntity3));

        };
    }

}
