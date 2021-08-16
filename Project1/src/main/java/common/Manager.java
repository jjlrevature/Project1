package common;

public class Manager extends Employee {
	
	//   Manager Functionality
	// login
	// view Ticket request
	// view past Tickets for all employees
	// can approve or deny pending Tickets
	
	public Manager(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	boolean canApprove;

	public boolean isCanApprove() {
		return canApprove;
	}

	public void setCanApprove(boolean canApprove) {
		this.canApprove = canApprove;
	}
	
}
