package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "employeeid")
	int employeeID;
	
	@Column(name = "username")
	String username;
	
	@Column(name = "password")
	String password;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	Set<Ticket> empTickets = new HashSet<Ticket>();
	
	public Employee() {
		
	}
	
	public Employee(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Employee(String username, String password, int empID, HashSet<Ticket> empTickets ) {
		this.username = username;
		this.password = password;
		this.employeeID = empID;
		this.empTickets = empTickets;
	}
	
	public Set<Ticket> getEmpTickets() {
		return empTickets;
	}
	public void setEmpTickets(Set<Ticket> set) {
		this.empTickets = set;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int empID) {
		this.employeeID = empID;
	}
}
