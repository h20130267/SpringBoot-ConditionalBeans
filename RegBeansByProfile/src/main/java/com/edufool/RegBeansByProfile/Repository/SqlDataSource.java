package com.edufool.RegBeansByProfile.Repository;

import com.edufool.RegBeansByProfile.Model.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public class SqlDataSource implements MyDataSource {
    @Override
    public Employee getEmployeeDetails(String name) {
        return new Employee("1",name,1000, "Got from Dev-SqlDataSource");
    }
}
