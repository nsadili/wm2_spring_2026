package az.edu.ada.wm2.spring_boot_data_jpa_demo.service;


import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<@NonNull EmployeeEntity> getAllEmps(Pageable pageable);

    EmployeeEntity save(EmployeeEntity employeeEntity);

    EmployeeEntity getById(Long empId);

    void deleteById(Long id);

    EmployeeEntity updateById(Long id, EmployeeEntity employeeEntity) throws Exception;

}
