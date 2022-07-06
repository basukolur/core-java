class IplTester{
	public static void main(String a[]){
		
		Ipl ip = new Ipl();
		ip.setGameOf("Cricket");
		ip.setType("Domestic");
		ip.setSponser("TATA");
		ip.setManagedBy("BCCI");
		ip.setTeams(10);
		
		
		System.out.println(ip.getGameOf()+":"+ip.getType()+":"+ip.getSponser()+":"+ip.getManagedBy()+":"+ip.getTeams());
		ip.ipl();
	}
	
	
}