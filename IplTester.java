class IplTester{
	public static void main(String a[]){
		
		IplDTO ip = new IplDTO();
		ip.setGameOf("Cricket");
		ip.setType("Domestic");
		ip.setSponser("TATA");
		ip.setManagedBy("BCCI");
		ip.setTeams(10);
		
		
	System.out.println(ip.getGameOf()+":"+ip.getType()+":"+ip.getSponser()+":"+ip.getManagedBy()+":"+ip.getTeams());

	}
	
	
}