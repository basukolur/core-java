class OrthopedicsTester{
	public static void main(String a[]){
		
		Orthopedics op = new Orthopedics();
		op.setName("Physician,Surgeon");
		op.setSector("Medicine,Surgery");
		op.setEmploymentField("Hospital,clinic");
		op.setEducationReq("M.B.B.S , M.D");
		
		
		System.out.println(op.getName()+":"+op.getSector()+":"+op.getEmploymentField()+":"+op.getEducationReq());
		op.doctor();
	}
	
	
}