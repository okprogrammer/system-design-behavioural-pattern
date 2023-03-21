package com.design.pattern.behavioural.interpreter;

public class Client {

	public static void main(String[] args) {
		Report report1  = new Report("Cashflow repot", "FINANCE_ADMIN OR ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();

		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);
		User user1 = new User("Dave", "ADMIN");

		System.out.println("User access reprot: " + exp.interpret(user1));
	}

}
