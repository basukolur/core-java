class BigBasketTester{
	public static void main(String a[]){
		
		BigBasket bb = new BigBasket();
		bb.setOwnedBy("Tata Digital Limited");
		bb.setType("Online and offline");
		bb.setStartedIn(2011);
		bb.setOrigin("Bengaluru");
		
		
		System.out.println(bb.getOwnedBy()+":"+bb.getType()+":"+bb.getStartedIn()+":"+bb.getOrigin());
		bb.bigb();
	}
	
	
}