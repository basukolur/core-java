class Hospital1 {
	
	//has many patients
	PatientDTO[] dtos = new PatientDTO[5];
	
	//Instance variable
	int index;
	
	public Hospital1(){
		System.out.println("Hospital Constance is called");
	}
	
	public boolean createPatient(PatientDTO dto){
		System.out.println("Inside createPatient");
		boolean isAdded = false;
		if(dto != null && dto.getName() != null){
			this.dtos[index++] = dto;
			isAdded = true;
			System.out.println("Patient added Successfully");
		} 
		else {
			System.out.println("Cannot add patient.. Please ");
		}
		return isAdded;
	}
	public void getPatientDetails(){
		System.out.println("Inside Get Patient Details ");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAddress()
			                    +" "+dtos[i].getGender()+" "+dtos[i].getContactNo());
		}
	}
	
}