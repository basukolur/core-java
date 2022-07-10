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
}