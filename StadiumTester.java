class StadiumTester{
	public static void main(String a[]){
		
		Stadium stadium = new Stadium();
		
		stadium.setName("Chinnaswamy");
		stadium.setTicketFees(2000.00);
		stadium.setNoOfSeats(40000);
		stadium.setEstablishment(1969);
		stadium.setLocation("Bengaluru");
		System.out.println(stadium.getName()+" "+stadium.getTicketFees()+" "+stadium.getNoOfSeats()+
		                  " "+stadium.getEstablishment()+" "+stadium.getLocation());
	    stadium.toWatchGames();
	}
}