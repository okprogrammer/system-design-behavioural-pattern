package com.design.pattern.behavioural.state;

public class InTransit implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("Contacting courier service for cancellation");
		System.out.println("Contacting payment gateway for tranaction roll back");
		return 20;
	}

}
