package az.edu.ada.wm2.spring_boot_data_jpa_demo.controller;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.service.EmployeeService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService employeeService;
    final EmployeeRepository employeeRepository;

    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeSaveRequest) {
        return employeeService.save(employeeSaveRequest);
    }

    //    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping
    public Page<@NonNull EmployeeEntity> listAll(
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "5") int limit,
            @RequestParam(defaultValue = "firstName") String sortBy
    ) {
        Pageable pageable = PageRequest.of(pageNo, limit,
                Sort.by(sortBy).ascending());

        return employeeService.getAllEmps(pageable);
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployee(@PathVariable("id") Long empId) {
        return employeeService.getById(empId);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@RequestBody EmployeeEntity employeeEntity,
                               @PathVariable Long id) throws Exception {
        employeeService.updateById(id, employeeEntity);
    }

    @GetMapping("/byCity")
    public Page<@NonNull EmployeeEntity> findEmployeesByCity(
            @RequestParam String city,
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "5") int limit,
            @RequestParam(defaultValue = "firstName") String sortBy
    ) {
        Pageable pageable = PageRequest.of(pageNo, limit,
                Sort.by(sortBy).ascending());
        return employeeRepository.findEmployeesByCity(city, pageable);
    }
}
