package com.xworkz.pubapp;

public class Bouncer {
	public void check(int age) throws PubException {
		System.out.println("Check Method Started");
		if (age >= 18) {
			System.out.println("Please Enter....Enjoy");
		} else {
			//PubException exception = new PubException();
			throw new PubException();
		}
		System.out.println("Check Method Ended");
	}
}
