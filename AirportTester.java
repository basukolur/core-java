class AirportTester {
	public static void main(String a[]){
		
		Airport airport = new Airport();
		
		airport.setName("Kempegowda International Airport ");
		airport.setType("Public ");
		airport.setLocation("Devanhalli, Bengaluru");
		airport.setOpenedIn(2008);
		System.out.println(airport.getName()+" "+airport.getType()+" "+airport.getLocation()+" "
		                            +airport.getOpenedIn());
		airport.forJourney();
	}
	
}