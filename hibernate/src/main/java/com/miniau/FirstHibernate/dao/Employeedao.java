package com.miniau.FirstHibernate.dao;



import java.util.List;

import com.miniau.FirstHibernate.model.Employee;

public interface Employeedao {
	public void save(Employee e);
	public List<Employee> getAllEmployees();
	public boolean delete(int empid);
	public boolean update(int EmployeeId); 
	public Employee getbyid(int empid);
}
