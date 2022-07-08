class Hospital1Tester {
	public static void main(String a[]){
		
		Hospital1 hos = new Hospital1();
		
		PatientDTO dto = new PatientDTO();
		dto.setGender(Gender.MALE);
		dto.setId(1);
		dto.setName("Raja");
		dto.setAddress("Belagavi");
		dto.setContactNo(9879879870L);
		hos.createPatient(dto);
		
		PatientDTO dto1 = new PatientDTO();
		dto1.setGender(Gender.FEMALE);
		dto1.setId(2);
		dto1.setName("Rani");
		dto1.setAddress("Belagavi");
		dto1.setContactNo(9879879870L);
		hos.createPatient(dto1);
		
		PatientDTO dto2 = new PatientDTO();
		dto2.setGender(Gender.MALE);
		dto2.setId(3);
		dto2.setName("Rahul");
		dto2.setAddress("Belagavi");
		dto2.setContactNo(9879879870L);
		hos.createPatient(dto2);
		
		PatientDTO dto3 = new PatientDTO();
		dto3.setGender(Gender.FEMALE);
		dto3.setId(4);
		dto3.setName("Radha");
		dto3.setAddress("Belagavi");
		dto3.setContactNo(9879879870L);
		hos.createPatient(dto3);
		
		PatientDTO dto4 = new PatientDTO();
		dto4.setGender(Gender.MALE);
		dto4.setId(5);
		dto4.setName("Ramesh");
		dto4.setAddress("Belagavi");
		dto4.setContactNo(9879879870L);
		hos.createPatient(dto4);
		
		hos.getPatientDetails();
	}
}