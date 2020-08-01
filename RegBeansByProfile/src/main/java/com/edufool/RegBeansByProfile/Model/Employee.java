package com.edufool.RegBeansByProfile.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private String empId;
    private String empName;
    private Integer empSalary;
    private String empDetails;
}
