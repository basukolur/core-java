public class Stadium {
	public Stadium(){
		
	}
	private String name;
	private double ticketFees;
	private int noOfSeats;
	private int establishment;
	private String location;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getTicketFees(){
		return ticketFees;
	}
	public void setTicketFees(double ticketFees){
		this.ticketFees = ticketFees;
	}
	public int getNoOfSeats(){
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats){
		this.noOfSeats = noOfSeats;
	}
	public int getEstablishment(){
		return establishment;
	}
	public void setEstablishment(int establishment){
		this.establishment = establishment;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location = location;
	}
	
	void toWatchGames(){
		System.out.println(" To Watching Games");
	}
}