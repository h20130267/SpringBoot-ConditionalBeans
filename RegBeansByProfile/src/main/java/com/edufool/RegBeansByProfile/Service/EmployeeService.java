package com.edufool.RegBeansByProfile.Service;

import com.edufool.RegBeansByProfile.Model.Employee;
import com.edufool.RegBeansByProfile.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getemployeeByName(String name) {
        return employeeRepository.getEmployeeByName(name);
    }
}
