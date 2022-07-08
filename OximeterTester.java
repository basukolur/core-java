class OximeterTester{
	public static void main(String a[]){
		
		OximeterDTO om = new OximeterDTO();
		om.setMethod("noninvasive");
		om.setType("Pulse oximeter");
		om.setDevelopedIn(1935);
		om.setOrigin("Germany");
		
		
		System.out.println(om.getMethod()+":"+om.getType()+":"+om.getDevelopedIn()+":"+om.getOrigin());
	
	}
}