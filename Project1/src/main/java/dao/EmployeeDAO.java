package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

import common.Employee;
import common.Ticket;

public interface EmployeeDAO {
	
	public Employee login() throws SQLException;
	public void submitTicket();
	Employee login(Employee employee) throws SQLException;
	public Set<Ticket> getTickets(Employee emp);
}
