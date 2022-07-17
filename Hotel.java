import java.util.Arrays;

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
	
	public boolean updateFoodItemPriceById(int id, double price){
		System.out.println("Inside Update Food Item Price by Id");
		boolean updatePrice = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId() == id){
				dtos[i].setPrice(price);
				updatePrice = true;
				System.out.println("Updated Successfully");
			}
			else{
				System.out.println("Food Item Id Not Matching");
			}
		}
		return updatePrice;
	}
	 public boolean updateFoodItemPriceByName(String name , double price){
		  System.out.println("inside update FoodItem Price By Name");
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
	  public boolean deleteFoodItemByName(String name){
			System.out.println("Inside Delete Food Item by Name");
			boolean foodItemDeleted = false;
			int i,j;
			for(i=0,j=0; j<dtos.length; j++){
				if(!dtos[j].getName().equals(name)){
					dtos[i++] = dtos[j];
					foodItemDeleted = true;
					System.out.println("Food Item Deleted Successfully");
				}
				else{
					System.out.println("Name is not Matching");
				}
			}
			dtos = Arrays.copyOf(dtos,i);
			return foodItemDeleted;
		}
} 