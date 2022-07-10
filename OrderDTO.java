public class OrderDTO {
	public OrderDTO(){
	}
	private int id;
	private String name;
	private double price;
	private String date;
	
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
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date = date;
	}
}