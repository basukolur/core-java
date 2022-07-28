package com.xworkz.block;

public class WrapperTester {
	public static void main(String[] args) {
		Integer baba = 78;
		// auto boxing
		Integer baba1 = 78;

		Long baba2 = 78L;
		System.out.println(baba == baba2.intValue());

		// un boxing
		baba = baba1.intValue();
		System.out.println(baba1 == baba);
	}

}
