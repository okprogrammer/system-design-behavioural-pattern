package com.design.pattern.behavioural.mediator;

public class Client {
	public static void main(String[] args) {

		IATCMediator atcMediator = new ATCMediator();
		Flight flight1 = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);
		atcMediator.registerFlight(flight1);
		atcMediator.registerRunway(mainRunway);
		flight1.getReady();
		mainRunway.land();
		flight1.land();

	}
}
