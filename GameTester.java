class GameTester{
	public static void main(String a[]){
		
		Games gm = new Games();
		gm.setName("BGMI");
		gm.setType("online");
		gm.setTotalPlayers(100);
		gm.setOrigin("South Korea");
		
		
		System.out.println(gm.getName()+":"+gm.getType()+":"+gm.getTotalPlayers()+":"+gm.getOrigin());
		gm.pubg();
	}
	
	
}