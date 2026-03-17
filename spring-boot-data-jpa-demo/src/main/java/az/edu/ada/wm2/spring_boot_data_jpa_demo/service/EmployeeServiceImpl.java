package az.edu.ada.wm2.spring_boot_data_jpa_demo.service;

import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto.EmployeeRequestDto;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto.EmployeeResponseDto;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.DepartmentEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.EmployeeEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.entity.SkillEntity;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper.AddressMapper;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper.DepartmentMapper;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperV1;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.model.mapper.EmployeeMapperV2;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.AddressRepository;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.DepartmentRepository;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.EmployeeRepository;
import az.edu.ada.wm2.spring_boot_data_jpa_demo.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final SkillRepository skillRepository;
    private final AddressRepository addressRepository;

    @Override
    public List<EmployeeResponseDto> getAllEmps() {
        return EmployeeMapperV2.INSTANCE.employeeEntitiesToEmployeeResponseDtos(employeeRepository.findAll());
    }

    @Override
    public EmployeeResponseDto save(EmployeeRequestDto employeeRequestDto) {
        //map address of the employee and save
        var addressToSave = employeeRequestDto.getAddressRequestDto();
        var savedAddress = addressRepository.save(
                AddressMapper.INSTANCE.addressDtoToAddressEntity(
                        addressToSave));

        var deptReqDto = employeeRequestDto.getDepartmentRequestDto();
        DepartmentEntity savedDepartment = null;
        if (deptReqDto.getId() == null) {
            //incoming dept has no id, create it
            savedDepartment = departmentRepository.save(
                    DepartmentMapper.INSTANCE
                            .employeeDepartmentRequestDtoToDepartmentEntity(deptReqDto));
        }else{
            var deptEnt = departmentRepository.findById(deptReqDto.getId());
            savedDepartment = deptEnt.orElseGet(() -> departmentRepository.save(
                    DepartmentMapper.INSTANCE
                            .employeeDepartmentRequestDtoToDepartmentEntity(deptReqDto)));
        }
        // TODO: Handle Skills - Save skills FIRST, then set on employee

        //TODO: map employeeEntityRequestDto to employeeEntity
        //TODO: set savedAddress and savedDepartment
        //TODO: save the employee


        return null;

    }

    @Override
    public EmployeeEntity getById(Long empId) {

        // Force initialization of lazy-loaded proxy
        // Hibernate.initialize(employee.getAddress());

        return employeeRepository.findById(empId).orElseThrow(
                () -> new IllegalArgumentException("Employee with id " + empId + " does not exist"));
    }

    public void deleteById(Long id) {
        if (!employeeRepository.existsById(id))
            throw new IllegalArgumentException("Employee with id " + id + " does not exist");

        employeeRepository.deleteById(id);
    }

    @Override
    @SneakyThrows
    public EmployeeEntity updateById(Long id, EmployeeEntity employeeUpdateRequestDto) throws Exception {
        var employee = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee with id " + id + " does not exist"));

        return employeeRepository.save(employee);
    }
}
