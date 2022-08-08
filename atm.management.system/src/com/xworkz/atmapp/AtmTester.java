package com.xworkz.atmapp;

import java.util.Scanner;

public class AtmTester {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int limit = sc.nextInt();
		Atm machine = new Atm();
		try {
			machine.withdraw(limit);
		} catch (AtmException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing all the costly resources");
			sc.close();
		}
		System.out.println("main method ended");
	}

}
