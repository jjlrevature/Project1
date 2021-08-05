package common;

import java.sql.Date;
import java.sql.Timestamp;

public class Ticket {
	
	// Form data for reimbursement
	
	String empUsername;
	int empID;
	boolean isApproved;
	double ticketAmount;
	Date dateOfTransaction;
	Timestamp timeOfSubmission;
	String[] desc;
	
	public Ticket(String empUsername, int empID, double amount, Date date, Timestamp ts, String[] desc) {
		this.empUsername = empUsername;
		this.empID = empID;
		this.ticketAmount = amount;
		this.dateOfTransaction = date;
		this.timeOfSubmission = ts;
		this.desc = desc;
	}
	
	public String getEmpUsername() {
		return empUsername;
	}
	public void setEmpUsername(String empUsername) {
		this.empUsername = empUsername;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
	public String[] getDesc() {
		return desc;
	}
	public void setDesc(String[] desc) {
		this.desc = desc;
	}
	
}
