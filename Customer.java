import java.util.Arrays;

class Customer {
	OrderDTO[] dtos;
	int index;
	public Customer(int size){
		dtos = new OrderDTO[size];
		System.out.println("Customer Constructor is Called");
	}
	public boolean createOrder(OrderDTO dto){
		System.out.println("Inside Place Order");
		boolean isAdded = false;
		if(dto != null && dto.getName() != null){
			this.dtos[index++] = dto;
			isAdded = true;  
			System.out.println("Order Placed Successfully");
		}
		else {
			System.out.println("Cannot Placed Order");
		}
		return isAdded;
	}
	public void getOrderDetails(){
		System.out.println("Inside Get Order Details ");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"  "+dtos[i].getPrice()+"  "+dtos[i].getDate());
	    }
	}
	
	public boolean updateOrderDateById(int id, String date){
		System.out.println("Inside Update Order Date by Id");
		boolean updateDate = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId() == id){
				dtos[i].setDate(date);
				updateDate = true;
				System.out.println("Updated Successfully");
			}
			else{
				System.out.println("Order Id Not Matching");
			}
		}
		return updateDate;
	}
	public boolean updateOrderPriceByName(String name , double price){
		  System.out.println("inside update Order Price By Name");
		  boolean updatePrice=false;
		for(int i=0; i<dtos.length;i++){
		    if(dtos[i].getName().equals(name)){
			  dtos[i].setPrice(price);
			  updatePrice = true;
		    }
		    else{
			  System.out.println("Name is not matching");
		    }
		}
		 return updatePrice;
	}
	public boolean deleteOrderByName(String name){
			System.out.println("Inside Delete Order by Name");
			boolean orderDeleted = false;
			int i,j;
		for(i=0,j=0; j<dtos.length; j++){
			if(!dtos[j].getName().equals(name)){
				dtos[i++] = dtos[j];
				orderDeleted = true;
				System.out.println("Order Deleted Successfully");
			}
			else{
				System.out.println("Name is not Matching");
			}
		}
			dtos = Arrays.copyOf(dtos,i);
			return orderDeleted;
	}
}