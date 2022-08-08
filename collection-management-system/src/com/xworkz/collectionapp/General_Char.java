package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class General_Char {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add('A');
		coll.add('B');
		coll.add('C');
		coll.add('D');
		coll.add('E');
		coll.add('F');
		coll.add('G');
		coll.add('H');
		coll.add('I');
		coll.add('J');
		coll.add('K');

		coll.remove('F');
		coll.forEach(System.out::println);
	}
}