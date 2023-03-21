package com.design.pattern.behavioural.state;

public class Client {
	public static void main(String[] args) {
		Order order = new Order();
		order.paymentSuccessful();
		order.dispatched();
		double cancel = order.cancel();
		System.out.println("Cancellation charges afer dispatch " + cancel);
	}
}
