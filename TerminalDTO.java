public class TerminalDTO{
	public TerminalDTO(){
	}
	private int id;
	private String name;
	private int noOfTerminals;
	private String place;
	
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
	public int getNoOfTerminals(){
		return noOfTerminals;
	}
	public void setNoOfTerminals(int noOfTerminals){
		this.noOfTerminals = noOfTerminals;
	}
	public String getPlace(){
		return place;
	}
	public void setPlace(String place){
		this.place = place;
	}
}
