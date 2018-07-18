package org.RESTORM.Dao;

import java.util.List;

import org.RESTORM.model.Employee;


public interface IEmployeeDao {

	public int saveEmployee(Employee emp);
	public void deleteEmpById(int empId);
	public void updateEmployee(Employee emp);
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmployess();
}
