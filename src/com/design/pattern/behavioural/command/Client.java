package com.design.pattern.behavioural.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();

		Command c1 = new AddMemberCommand("Hello@gmail.com", "spam", service);
		MailTaskRunner.getInstance().addCommand(c1);

		Command c2 = new AddMemberCommand("b@gmail.com", "spam", service);
		MailTaskRunner.getInstance().addCommand(c2);

		Thread.sleep(3000);
		MailTaskRunner.getInstance().shutdown();
	}

}
