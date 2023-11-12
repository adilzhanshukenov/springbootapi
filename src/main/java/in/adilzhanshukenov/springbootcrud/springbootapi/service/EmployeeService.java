package in.adilzhanshukenov.springbootcrud.springbootapi.service;

import java.util.List;

import in.adilzhanshukenov.springbootcrud.springbootapi.model.Employee;

public interface EmployeeService {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
