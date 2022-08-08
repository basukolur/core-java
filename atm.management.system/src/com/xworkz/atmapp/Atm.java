package com.xworkz.atmapp;

public class Atm {
	public void withdraw(int limit) throws AtmException {
		System.out.println("Check method started");
		if (limit <= 25000) {
			System.out.println("Please collect the cash and take your card");
		} else {
			throw new AtmException("Exceed the Limit");
		}
		if (limit % 100 == 0) {
		} else {
			throw new AtmException("Plz provide the amount as 100 200 500");
		}
		System.out.println("check method ended");
	}
}
