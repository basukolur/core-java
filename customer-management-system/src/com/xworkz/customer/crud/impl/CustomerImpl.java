package com.xworkz.customer.crud.impl;

import java.util.Arrays;

import com.xworkz.customer.crud.CustomerInf;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerImpl implements CustomerInf {

	OrderDTO[] orders;
	int index;

	public CustomerImpl(int size) {
		orders = new OrderDTO[size];
		System.out.println("The Customer constructor is created");

	}

	@Override
	public boolean createOrder(OrderDTO order) {

		System.out.println("Inside the createOrder");
		boolean isAdded = false;

		if (order != null && order.getName() != null) {

			this.orders[index++] = order;
			isAdded = true;
			System.out.println("The Order detail is saved");
		} else {
			System.out.println("The order is not saved");

		}
		System.out.println("the createOrder() is ended");
		return isAdded;
	}

	@Override
	public void getOrderDetails() {

		for (int i = 0; i < orders.length; i++) {

			System.out.println(orders[i]);

		}

	}

	@Override
	public boolean updateNameById(int id, String name) {

		System.out.println("Inside updateTypeById ");
		boolean updateName = false;
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].getId() == id) {
				orders[i].setName(name);
				updateName = true;

			} else {
				System.out.println("The order id is not found");
			}
		}
		return updateName;
	}

	@Override
	public boolean updatequantityByName(String name, int quantity) {

		System.out.println("Inside updatequantityByName ");
		boolean updatequantity = false;
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].getName().equals(name)) {
				orders[i].setQuantity(quantity);
				updatequantity = true;

			} else {
				System.out.println("The order name is not found");
			}
		}
		return updatequantity;
	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("inside deleteByName");
		boolean deleteOrder = false;
		int i, j;
		for (i = 0, j = 0; j < orders.length; j++) {
			if (!orders[j].getName().equals(name)) {
				orders[i++] = orders[j];
				deleteOrder = true;
			} else {
				System.out.println("the order is deleted");
			}
		}
		orders = Arrays.copyOf(orders, i);
		return deleteOrder;
	}

	@Override
	public boolean deleteById(int id) {
		System.out.println("inside deleteById");
		boolean deleteOrder = false;
		int i, j;
		for (i = 0, j = 0; j < orders.length; j++) {
			if (orders[j].getId() != id) {
				orders[i++] = orders[j];
				deleteOrder = true;
			} else {
				System.out.println("the order is deleted");
			}
		}
		orders = Arrays.copyOf(orders, i);
		return deleteOrder;
	}

	@Override
	public String getOrderTypeByName(String name) {
		System.out.println("inside getOrderTypeByName()");
		String orderType = null;
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].getName().equals(name)) {
				orderType = orders[i].getType();
			} else {
				System.out.println("The customer name not matched");
			}
		}
		return orderType;
	}

	public String getOrderNameById(int id) {
		String orderName = null;
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].getId() == id) {
				orderName = orders[i].getName();
			} else {
				System.out.println("The customer id not matched");
			}

		}
		return orderName;
	}

	@Override
	public int[] getAllQuantities() {

		int i, j;
		for (j = 0, i = 0; i < orders.length; i++) {
			System.out.println(orders[i].getQuantity());
			j++;
		}

		int[] allQuantities = new int[j];
		for (int k = 0, m = 0; k < orders.length; k++) {
			allQuantities[m++] = orders[k].getQuantity();
		}

		return allQuantities;
	}

	@Override
	public String[] getAllOrderName() {

		int i, j;
		for (j = 0, i = 0; i < orders.length; i++) {
			System.out.println(orders[i].getName());
			j++;
		}

		String[] allOrderName = new String[j];
		for (int k = 0, m = 0; k < orders.length; k++) {
			allOrderName[m++] = orders[k].getName();
		}

		return allOrderName;
	}
}