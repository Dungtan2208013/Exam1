package com.sun.service;

import com.sun.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> findAllEmployees();
}
