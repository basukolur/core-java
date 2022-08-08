package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class General_Int {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add(1);
		coll.add(2);
		coll.add(3);
		coll.add(4);
		coll.add(5);
		coll.add(6);
		coll.add(7);
		coll.add(8);
		coll.add(9);
		coll.add(10);
		coll.add(11);

		coll.remove(11);
		coll.forEach(System.out::println);
	}
}