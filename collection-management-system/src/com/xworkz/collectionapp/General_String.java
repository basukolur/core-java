package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class General_String {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("Basu");
		coll.add("Yama");
		coll.add("Nikhil");
		coll.add("Sunil");
		coll.add("Manoj");
		coll.add("Suhas");
		coll.add("Praveen");
		coll.add("Drishya");
		coll.add("Darshan");
		coll.add("Gurudeep");
		coll.add("Shilpa");
		coll.add("Vaishnavi");
		coll.add("Spoorthy");
		
		coll.remove("Basu");
		coll.forEach(System.out::println);
	}
}