package com.design.pattern.behavioural.mediator;

public class Flight implements Command {

	private IATCMediator atcMediator;

	public Flight(IATCMediator atcMediator) {
		this.atcMediator = atcMediator;
	}

	@Override
	public void land() {
		if (atcMediator.isLandingOk()) {
			System.out.println("Successfully Landed.");
		} else {
			System.out.println("Waiting for landing.");
		}

	}

	public void getReady() {
		System.out.println("Ready for landing.");
	}

}
