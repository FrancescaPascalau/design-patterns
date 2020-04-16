package com.francesca.pascalau.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new RegularEmployee("Francesca Pascalau");

        employeeList.add(employee);

        RemoteEmployee remoteEmployee = new RemoteEmployee("abc1");

        employeeList.add(new RemoteEmployeeAdapter(remoteEmployee));

        return employeeList;
    }
}
