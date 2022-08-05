package com.xworkz.atmapp;

public class AtmException extends Exception {
	@Override
	public String toString() {
		return "Sorry.... the limit is exceeded" + " or  " 
	         + "plz enter the amount in multiple of 100";
	}

}
