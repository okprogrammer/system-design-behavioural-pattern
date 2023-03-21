package com.design.pattern.behavioural.chain.of.responsibility;

import java.time.LocalDate;

import com.design.pattern.behavioural.chain.of.responsibility.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {

		LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick).from(LocalDate.now())
				.to(LocalDate.of(2022, 3, 2)).build();
		System.out.println(application);
		System.out.println("********************************************");
		LeaveApprover approver = createChain();
		approver.porcessLeaveApplication(application);
		System.out.println(application);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}

}
