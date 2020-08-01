package com.edufool.RegBeansByProfile.Repository;

import com.edufool.RegBeansByProfile.Model.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class OracleDataSource implements MyDataSource {
    @Override
    public Employee getEmployeeDetails(String name) {
        return new Employee("2", name, 2000, "Got from NonDev-OracleDataSource");
    }
}
