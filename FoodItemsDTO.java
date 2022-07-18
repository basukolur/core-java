public class FoodItemsDTO {

     private int id;
	 private String name;
	 private int price;
	 private String type;
	 
	 public FoodItemsDTO(){
	   
	 }
	 
	 public int getId(){
	    return id;
	 }
	 public void setId(int id){
	    this.id = id;
	 }
	 
	 public String getName(){
	    return name;
	 }
	 public void setName(String name){
	    this.name = name;
	 }
	 public int getPrice(){
	    return price;
	 }
	 public void setPrice(int price){
	    this.price = price;
	 }
	 public String getType(){
	    return type;
	 } 
	 public void setType(String type){
	    this.type = type;
	 }
	 
	 @Override
	 public String toString(){
		 return "[OrderDTO : Id = "+this.getId()+", Name = "+this.getName()+", Price = "+this.getPrice()+", Type="+this.getType()+"]";
	 }
	


}