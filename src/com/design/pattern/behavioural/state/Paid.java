package com.design.pattern.behavioural.state;

public class Paid implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("Contacting payment gateway to rollback transaction.");
		return 10;
	}

}
