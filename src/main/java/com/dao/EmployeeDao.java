package com.dao;

import com.po.Employee;
import com.po.Job;

import java.util.List;

public interface EmployeeDao {
    boolean addEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    boolean deleteEmployee(Employee employee);
    Employee queryEmployeeByName(Employee employee);
    Employee queryEmployeeByEmployee(Employee employee);
    Employee queryAdminByName(Employee employee);
    Employee queryEmployeeById(Employee employee);
    List<Employee> queryAllEmployeeByDetail();
    List<Employee> queryAllEmployee();
    List<Employee> queryAllAdmin();
    List<Employee> queryEmployeeByJid(Job job);
}
