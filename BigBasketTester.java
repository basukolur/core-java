class BigBasketTester{
	public static void main(String a[]){
		
		BigBasketDTO bb = new BigBasketDTO();
		bb.setOwnedBy("Tata Digital Limited");
		bb.setType("Online and offline");
		bb.setStartedIn(2011);
		bb.setOrigin("Bengaluru");
		
		
		System.out.println(bb.getOwnedBy()+":"+bb.getType()+":"+bb.getStartedIn()+":"+bb.getOrigin());
	
	}
}