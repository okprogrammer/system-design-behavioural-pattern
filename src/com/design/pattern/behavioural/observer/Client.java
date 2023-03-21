package com.design.pattern.behavioural.observer;

public class Client {

	public static void main(String[] args) {

		Order order = new Order("101");
		PriceObserver priceObserver = new PriceObserver();

		order.attach(priceObserver);

		QuantityObserver quant = new QuantityObserver();
		order.attach(quant);

		order.addItem(50);
		order.addItem(179);

		System.out.println(order);

	}

}
