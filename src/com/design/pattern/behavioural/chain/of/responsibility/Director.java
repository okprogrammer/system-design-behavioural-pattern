package com.design.pattern.behavioural.chain.of.responsibility;

import com.design.pattern.behavioural.chain.of.responsibility.LeaveApplication.Type;

public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if (application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}

}
