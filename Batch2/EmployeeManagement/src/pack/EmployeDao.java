package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeDao {
	@Autowired
	private JdbcTemplate template;
	public void insert(Employee e){
		template.update("insert into Employee values(?,?,?,?)",new Object[]{e.getEmpid(),
			e.getName(),e.getSalary(),e.getDesg()});
	}
		public List<Employee> getAllEmployees()
		{
	List<Employee> list=template.query("select * from Employee", new EmployeeRowMapper());
		return list;
		}
		public void delete(Employee e){
			template.update("delete from employee where id=?",new Object[]{e.getEmpid()});
		}
		public void update(Employee e){
			template.update("update employee set name=? where id=?",new Object[] {e.getName(),e.getEmpid()});
			template.update("update  employee set salary=? where id=?",new Object[] {e.getSalary(),e.getEmpid()});
		
		template.update("update employee set desg=? where id=?",new Object[] {e.getDesg(),e.getEmpid()});

		}
	}
