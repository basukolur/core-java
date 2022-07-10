import java.util.Scanner;
class Hospital1Tester {
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Patients To be added : ");
		int size = scan.nextInt();
		
		Hospital1 hos = new Hospital1(size);
		
		for(int i=0; i<size; i++){
		
		    System.out.println("Enter the Patient ID : ");
			int id = scan.nextInt();
			
			System.out.println("Enter the Patient Name : ");
			String name = scan.next();
			
			System.out.println("Enter the Patient Address : ");
			String address = scan.next();
			
			System.out.println("Enter the Patient Contact No : ");
			long contactNo = scan.nextLong();
		
		    PatientDTO dto = new PatientDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setAddress(address);
			dto.setContactNo(contactNo);
			hos.createPatient(dto);
		}	
			hos.getPatientDetails();
	}
}	
		
		
		
		
		/*System.out.println("Enter the Patient ID : ");
		int id1 = scan.nextInt();
		
		System.out.println("Enter the Patient Name : ");
		String name1 = scan.next();
        
        System.out.println("Enter the Patient Address : ");
		String address1 = scan.next();
		
		System.out.println("Enter the Patient Contact No : ");
		long contactNo1 = scan.nextLong();
		
		PatientDTO dto1 = new PatientDTO();
		dto1.setId(id1);
		dto1.setName(name1);
		dto1.setAddress(address1);
		dto1.setContactNo(contactNo1);
		hos.createPatient(dto1);*/
