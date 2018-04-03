package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService{
	@Autowired
	private EmployeDao dao;
	public void insert(Employee e){
		dao.insert(e);
	}
	public void delete(Employee e){
		dao.delete(e);
	}
	public void update(Employee e){
		dao.update(e);
	}
	public List<Employee>getAllEmployees(){
		return dao.getAllEmployees();
	}
	
}