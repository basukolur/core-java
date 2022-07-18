public class OrderDTO {

     private int id;
	 private String name;
	 private int quantity;
	 private String type;
	 
	 public OrderDTO(){
	   
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
	 public int getQuantity(){
	    return quantity;
	 }
	 public void setQuantity(int quantity){
	    this.quantity = quantity;
	 }
	 public String getType(){
	    return type;
	 } 
	 public void setType(String type){
	    this.type = type;
	 }
	 
	 @Override
	 public String toString(){
		 return "[OrderDTO : Id ="+this.getId()+", Name= "+ this.getName()+", Quantity = "+ this.getQuantity()+", Type ="+this.getType()+"]";
	 }
	


}