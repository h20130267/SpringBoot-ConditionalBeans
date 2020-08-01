package com.edufool.RegBeansByProfile.Controller;

import com.edufool.RegBeansByProfile.Model.Employee;
import com.edufool.RegBeansByProfile.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Value("${spring.message}")
    private String message;

    @GetMapping("/getEmployee/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return employeeService.getemployeeByName(name);
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        return message;
    }
}
