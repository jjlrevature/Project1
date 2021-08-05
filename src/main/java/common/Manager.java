package common;

public class Manager extends Employee {
	
	//   Manager Functionality
	// login
	// view Ticket request
	// view past Tickets for all employees
	// can approve or deny pending Tickets
	
	boolean canApprove;

	public boolean isCanApprove() {
		return canApprove;
	}

	public void setCanApprove(boolean canApprove) {
		this.canApprove = canApprove;
	}
	
}
