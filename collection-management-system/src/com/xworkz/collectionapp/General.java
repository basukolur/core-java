package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class General {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("Vikrant Rona");
		coll.add("Rocketry");
		coll.add(1);
		coll.add(true);
		coll.add(9.99);
		
		coll.remove(1);
		coll.forEach(System.out::println);
	}
}
