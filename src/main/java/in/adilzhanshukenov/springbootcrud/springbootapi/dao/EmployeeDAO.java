package in.adilzhanshukenov.springbootcrud.springbootapi.dao;

import java.util.List;

import in.adilzhanshukenov.springbootcrud.springbootapi.model.Employee;

public interface EmployeeDAO {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

}