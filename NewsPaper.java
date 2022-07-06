public class NewsPaper {
	public NewsPaper(){
		
	}
	private String name;
	private double price;
	private String founder;
	private int founded;
	private String headQuarters;
	
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
	public String getFounder(){
		return founder;
	}
	public void setFounder(String founder){
		this.founder = founder;
	}
	public int getFounded(){
		return founded;
	}
	public void setFounded(int founded){
		this.founded = founded;
	}
	public String getHeadQuarters(){
		return headQuarters;
	}
	public void setHeadQuarters(String headQuarters){
		this.headQuarters = headQuarters;
	}
	void toGetKnowledge(){
		System.out.println("Get a Knowledge");
	}
}