class Hotel {
	FoodItemsDTO[] dtos;
	int index;
	public Hotel(int size){
		dtos = new FoodItemsDTO[size];
		System.out.println("Hotel Constructor is Called");
	}
	public boolean createFoodItems(FoodItemsDTO dto){
		System.out.println("Inside Order Food Items");
		boolean isAdded = false;
		
		if((dto!=null && dto.getName()!=null)){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Hotel Food Item is Added Successfully");
		}
		else {
			System.out.println("Food Item is Not Added");
		}
		return isAdded;
	}
	
	public void getFoodDetails(){
		System.out.println("Inside Get Food Details");
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"   "+dtos[i].getPrice());
		}
	}
} 