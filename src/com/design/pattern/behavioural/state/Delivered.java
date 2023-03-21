package com.design.pattern.behavioural.state;

public class Delivered implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("Contacting courier service for item pickup");
		System.out.println("Payment roll back will be intitiated upon receiving returned item");
		return 30;
	}

}
