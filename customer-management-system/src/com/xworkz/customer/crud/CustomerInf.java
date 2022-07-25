package com.xworkz.customer.crud;

import com.xworkz.customer.dto.OrderDTO;

public interface CustomerInf {
	public boolean createOrder(OrderDTO order);

	public void getOrderDetails();

	public boolean updateNameById(int id, String name);

	public boolean updatequantityByName(String name, int quantity);

	public boolean deleteByName(String name);

	public boolean deleteById(int id);

	public String getOrderTypeByName(String name);

	public String getOrderNameById(int id);

	public int[] getAllQuantities();

	public String[] getAllOrderName();

}
