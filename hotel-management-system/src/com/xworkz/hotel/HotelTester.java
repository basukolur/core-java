package com.xworkz.hotel;

import java.util.Scanner;

import com.xworkz.hotel.crud.HotelInf;
import com.xworkz.hotel.crud.impl.HotelImpl;
import com.xworkz.hotel.dto.FoodItemsDTO;

public class HotelTester {

	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of food items");
		int size = sc.nextInt();

		HotelInf hotel = new HotelImpl(size);

		for (int i = 0; i < size; i++) {

			FoodItemsDTO foodItem = new FoodItemsDTO();

			System.out.println("Enter the id of the foodItem");
			int id = sc.nextInt();
			System.out.println("Enter the food name");
			String name = sc.next();
			System.out.println("Enter the price of the food ");
			int price = sc.nextInt();
			System.out.println("Enter type of the food");
			String type = sc.next();

			foodItem.setId(id);
			foodItem.setName(name);
			foodItem.setPrice(price);
			foodItem.setType(type);

			hotel.createFoodItem(foodItem);

		}

		String option = null;
		do {
			System.out.println("Enter 1 for all food details");
			System.out.println("Enter 2 for update price by name");
			System.out.println("Enter 3 for delete food by name");
			System.out.println("Enter 4 for delete food by type");
			System.out.println("Enter 5 for all fooditem name");

			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				hotel.getFoodItemDetails();
				break;
			case 2:
				System.out.println("Enter the existing Name to update the price");
				String existingName = sc.next();
				System.out.println("Enter price to be update");
				int updatePrice = sc.nextInt();
				hotel.updatePriceByName(existingName, updatePrice);
				break;
			case 3:
				System.out.println("Enter the name to be deleted");
				String name1 = sc.next();
				hotel.deleteByName(name1);
				break;
			case 4:
				System.out.println("enter the type to  delete");
				String type1 = sc.next();
				hotel.deleteByType(type1);
				break;
			case 5:
				hotel.getAllFoodItemName();
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}

			System.out.println("Do you want to continue Y/N");
			option = sc.next();

		} while (option.equalsIgnoreCase("Y"));
		sc.close();
	}
}
