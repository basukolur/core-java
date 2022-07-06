class WeaponTester{
	public static void main(String a[]){
		
		Weapon wp = new Weapon();
		wp.setName("351 Magnum");
		wp.setType("Gun");
		wp.setRange(55);
		wp.setOrigin("Germany");
		
		
		System.out.println(wp.getName()+":"+wp.getType()+":"+wp.getRange()+":"+wp.getOrigin());
		wp.pistol();
	}
	
	
}