package com.design.pattern.behavioural.observer;

public class QuantityObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
		int count = order.getCount();
		if (count <= 5) {
			order.setShippingCost(10);
		} else {
			order.setDiscount(10 + (count - 5) * 1.5);
		}
	}

	@Override
	public String toString() {
		return "QuantityObserver []";
	}

}
