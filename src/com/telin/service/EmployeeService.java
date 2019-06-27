package com.telin.service;

import java.util.List;

import com.telin.bean.Employee;

public interface EmployeeService {
	public void save(Employee employee);
	public void update(Employee employee);
	public Employee find(Integer id);
	public void delete(Employee employee);
	public List<Employee> list();
	public Employee getEmployeeById(Integer id);
	public void deletes(Employee employee);
	public Employee getEmployeeByUsername(String username);
}