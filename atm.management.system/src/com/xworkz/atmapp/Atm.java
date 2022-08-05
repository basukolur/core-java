package com.xworkz.atmapp;

public class Atm {
	public void withdraw(int limit) throws AtmException {
		System.out.println("Check method started");
		if (limit <= 25000 && limit % 100 == 0) {
			System.out.println("Please collect the cash and take your card");
		} else {
			throw new AtmException();
		}
		System.out.println("check method ended");
	}
}
