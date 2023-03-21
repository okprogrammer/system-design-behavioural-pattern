package com.design.pattern.behavioural.state;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("It's a new Order. No Processing done");
		return 0;
	}

}
