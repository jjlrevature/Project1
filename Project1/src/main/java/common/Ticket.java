package common;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tickets")
public class Ticket implements Serializable {
	
	// Form data for reimbursement
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "empusername")
	String empUsername;
	@Column(name = "isapproved")
	boolean isApproved;
	@Column(name = "amount")
	double ticketAmount;
	@Column(name = "dateoftrans")
	Date dateOfTransaction;
	@Column(name = "dateofsub")
	Timestamp timeOfSubmission;
	@ManyToOne
		@JoinColumn(name="empid", nullable=false)
	private Employee employee;
	
	public Ticket() {
		
	}
	
	public Ticket(String empUsername, double amount, Date date) {
		this.empUsername = empUsername;
		this.ticketAmount = amount;
		this.dateOfTransaction = date;
	}
	
	public Ticket(String username, int ticketOwner, Object object, Object date, Object desc2) {
		// TODO Auto-generated constructor stub
	}
	
	


	
	// java.sql.date

	public String getEmpUsername() {
		return empUsername;
	}
	public void setEmpUsername(String empUsername) {
		this.empUsername = empUsername;
	}
	
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	public double getTicketAmount() {
		return ticketAmount;
	}
	public void setTicketAmount(double ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public Timestamp getTimeOfSubmission() {
		return timeOfSubmission;
	}
	public void setTimeOfSubmission(Timestamp timeOfSubmission) {
		this.timeOfSubmission = timeOfSubmission;
	}
	
	
	
}
