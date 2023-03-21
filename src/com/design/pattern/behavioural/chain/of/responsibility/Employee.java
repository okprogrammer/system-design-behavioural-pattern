package com.design.pattern.behavioural.chain.of.responsibility;

public abstract class Employee implements LeaveApprover {

	private String role;

	private LeaveApprover successor;

	public Employee(String role, LeaveApprover successor) {
		super();
		this.role = role;
		this.successor = successor;
	}

	@Override
	public void porcessLeaveApplication(LeaveApplication application) {
		if (!processRequest(application) && successor != null) {
			successor.porcessLeaveApplication(application);
		}

	}

	protected abstract boolean processRequest(LeaveApplication application);

	@Override
	public String getApproverRole() {
		return role;
	}

}
