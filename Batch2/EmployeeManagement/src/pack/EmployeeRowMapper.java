package pack;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public EmployeeRowMapper() {
		// TODO Auto-generated constructor stub
	}

	public Employee mapRow(ResultSet arg0, int arg1) throws SQLException {
		Employee employee=new Employee(arg0.getInt(1),arg0.getString(2),arg0.getDouble(3),arg0.getString(4));
		return employee ;
	}

}
