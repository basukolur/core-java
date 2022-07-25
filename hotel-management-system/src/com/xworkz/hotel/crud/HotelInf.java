package com.xworkz.hotel.crud;

import com.xworkz.hotel.dto.FoodItemsDTO;

public interface HotelInf {
	public boolean createFoodItem(FoodItemsDTO foodItem);

	public void getFoodItemDetails();

	public boolean updatePriceByName(String name, int price);

	public boolean deleteByName(String name);

	public boolean deleteByType(String type);

	public String[] getAllFoodItemName();

}
