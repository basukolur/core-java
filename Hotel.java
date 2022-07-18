import java.util.Arrays;
class Hotel{


    FoodItemsDTO[] foodItems ;
	int index;
	
	public Hotel(int size){
	  foodItems = new FoodItemsDTO[size];
      System.out.println("The Hotel constructor is created");	  
	
	}
	
	public boolean createFoodItem(FoodItemsDTO foodItem){
	
	    System.out.println("Inside the createFoodItem()");
		boolean isAdded = false;
		
		if(foodItem != null && foodItem.getName() != null) {
		    
			this.foodItems[index++] = foodItem;
			isAdded = true;
			System.out.println("The foodItems detail is saved");
		} else {
		   System.out.println("The foodItems is not saved");
		
		}
	       System.out.println("the createFoodItem() is ended");
	   return isAdded;
	}
	
	public void getFoodItemDetails(){
	
	     
		 for(int i=0; i<foodItems.length; i++){
		    
			  System.out.println(foodItems[i]);
		 
		 }
	     
	}
	
	public boolean updatePriceByName(String name, int price){
		 
		 System.out.println("Inside updatePriceByName ");
		 boolean updatePrice = false;
		 for(int i=0; i<foodItems.length;i++){
			 if(foodItems[i].getName().equals(name)){
				 foodItems[i].setPrice(price);
				 updatePrice = true;
				 
			 }
			 else{
				 System.out.println("The food name is not found");
			 }
		 }
		 return updatePrice;
	 }
	 
	 
	 
	  public boolean deleteByName(String name){
		 System.out.println("inside deleteByName");
		 boolean deleteFoodItem=false;
		 int i,j;
		 for(i=0,j=0;j<foodItems.length;j++){
			 if(!foodItems[j].getName().equals(name)){
				 foodItems[i++]=foodItems[j];
				 deleteFoodItem = true;
			 } else {
				 System.out.println("the foodItem is deleted");
			 }
		 }
		 foodItems = Arrays.copyOf(foodItems, i);
		 return deleteFoodItem;
	 }
	 
	 
	  public boolean deleteByType(String type){
		 System.out.println("inside deleteByType");
		 boolean deleteFoodItem=false;
		 int i,j;
		 for(i=0,j=0;j<foodItems.length;j++){
			 if(foodItems[j].getType()!=type){
				 foodItems[i++]=foodItems[j];
				 deleteFoodItem = true;
			 } else {
				 System.out.println("the foodItem is deleted");
			 }
		 }
		 foodItems = Arrays.copyOf(foodItems, i);
		 System.out.println("end deleteByType ");
		 return deleteFoodItem;
	 }
	 
	 public String[] getAllFoodItemName(){
		 System.out.println("Inside getAllFoodItemName ");
		 int i,j;
		 for( j=0,i=0;i<foodItems.length;i++){ 
			  System.out.println(foodItems[i].getName());
			  j++;
		 }
		    
		  String[] allFoodName = new String[j];
		   for(int k=0,m=0;k<foodItems.length;k++){
			 allFoodName[m++] = foodItems[k].getName(); 
		  }
           System.out.println("End getAllFoodItemName ");
		 return allFoodName;
	 }
	 

}