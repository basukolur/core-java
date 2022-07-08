public class MusicPlayerDTO{
	public MusicPlayerDTO(){
	}
  private String name;
  private String type;
  private double price;
  private String brand;
  private String size;

     public String getName(){
	  return name;
     }
     public void setName(String name){ 
	   this.name=name;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public double getPrice(){
		 return price;
	 }
	 public void setPrice(double price){
		 this.price=price;
	 }
	 
	 public String getBrand(){
		 return brand;
	 }
	 public void setBrand(String brand){
		 this.brand=brand;
	 }
	 
	 public String getSize(){
		 return size;
	 }
	 public void setSize(String size){
		 this.size=size;
	 }
}