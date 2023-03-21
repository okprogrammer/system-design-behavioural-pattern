package com.design.pattern.behavioural.state;

//context class
public class Order {

	// current state of order
	private OrderState currState;

	public Order() {
		currState = new New();
	}

	public double cancel() {
		double charges = currState.handleCancellation();
		currState = new Cancelled();
		return charges;
	}

	public void paymentSuccessful() {
		currState = new Paid();
	}

	public void dispatched() {
		currState = new InTransit();
	}

	public void delievered() {
		currState = new Delivered();
	}
}
