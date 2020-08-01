package com.edufool.RegBeansByProfile.Repository;

import com.edufool.RegBeansByProfile.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @Autowired
    private MyDataSource myDataSource;

    public Employee getEmployeeByName(String name) {
        return myDataSource.getEmployeeDetails(name);
    }
}
