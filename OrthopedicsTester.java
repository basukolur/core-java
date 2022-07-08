class OrthopedicsTester{
	public static void main(String a[]){
		
		OrthopedicsDTO op = new OrthopedicsDTO();
		op.setName("Physician,Surgeon");
		op.setSector("Medicine,Surgery");
		op.setEmploymentField("Hospital,clinic");
		op.setEducationReq("M.B.B.S , M.D");
		
		
		System.out.println(op.getName()+":"+op.getSector()+":"+op.getEmploymentField()+":"+op.getEducationReq());

	}
}