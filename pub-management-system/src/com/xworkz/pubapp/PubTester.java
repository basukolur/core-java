package com.xworkz.pubapp;

import java.util.Scanner;

public class PubTester {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		Bouncer bouncer = new Bouncer();
		try {
			bouncer.check(age);
		} catch (PubException e) {
			e.printStackTrace();
		}
		System.out.println("Main Ended");
	}
}
