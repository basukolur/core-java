class MusicPlayerTester{
	public static void main(String a[]){
		
		MusicPlayer mp = new MusicPlayer();
		mp.setName("Walkman");
		mp.setType("portable");
		mp.setPrice(899);
		mp.setBrand("Sony");
		mp.setSize("15cm x 12cm");
		
		
		System.out.println(mp.getName()+":"+mp.getType()+":"+mp.getPrice()+":"+mp.getBrand()+":"+mp.getSize());
		mp.listen();
	}
	
	
}