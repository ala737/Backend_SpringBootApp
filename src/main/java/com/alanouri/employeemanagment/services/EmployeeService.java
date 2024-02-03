package com.alanouri.employeemanagment.services;

import com.alanouri.employeemanagment.exceptions.UserNotFoundException;
import com.alanouri.employeemanagment.model.Employee;
import com.alanouri.employeemanagment.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;


@Service
public class EmployeeService {

    private final  EmployeeRepo employeeRepo;



    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
      employee.setEmployeeCode(UUID.randomUUID().toString());
      return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee UpdateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }

    public Employee findEmployeeBuId(Long id) throws Throwable {
        return (Employee) employeeRepo.findEmployeeById(id).orElseThrow(
                () -> new UserNotFoundException("User by id "+id+" was not found"));
    }
}
