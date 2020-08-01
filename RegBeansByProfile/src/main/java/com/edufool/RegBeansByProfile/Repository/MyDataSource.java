package com.edufool.RegBeansByProfile.Repository;

import com.edufool.RegBeansByProfile.Model.Employee;

public interface MyDataSource {
    Employee getEmployeeDetails(String name);
}
