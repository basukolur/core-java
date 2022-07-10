class Hospital1 {
	PatientDTO[] dtos;                 //has many patients
	int index;                          //Instance variable
	                        
	public Hospital1(int size){
		dtos = new PatientDTO[size];
		System.out.println("Hospital Constructor is called");
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
			System.out.println("Cannot add patient.. ");
		}
		return isAdded;
	}
	public void getPatientDetails(){
		System.out.println("Inside Get Patient Details ");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAddress()
			                    +" "/*+dtos[i].getGender()*/+" "+dtos[i].getContactNo());
		}
	}
	
}