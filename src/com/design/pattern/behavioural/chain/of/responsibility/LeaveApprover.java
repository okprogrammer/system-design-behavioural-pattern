package com.design.pattern.behavioural.chain.of.responsibility;

public interface LeaveApprover {

	void porcessLeaveApplication(LeaveApplication application);

	String getApproverRole();

}
