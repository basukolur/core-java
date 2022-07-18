import java.util.Scanner ;
class HospitalTester{

     public static void main(String a[]){
	 
	     Scanner sc = new Scanner(System.in);
		    System.out.println("The number of patient");
			int size = sc.nextInt();
	   
		 Hospital hos = new Hospital(size);
		 
		 for(int i=0; i<size;i++) {
		 PatientDTO dto = new PatientDTO();
		 
		      System.out.println("Enter the patient name ");
	          String name = sc.next();
			  System.out.println("Enter the patient address ");
			  String address = sc.next();
			  System.out.println("Enter the patient id ");
			  int id = sc.nextInt();
			  System.out.println("Enter the patient contact no ");
			  long contactNo = sc.nextLong();
			  System.out.println("Enter the gender");
			  String ge = sc.next();
			  
		 
		 dto.setGender(Gender.valueOf(ge)); 
		 dto.setId(id);
		 dto.setName(name);
		 dto.setAddress(address);
		 dto.setContactNo(contactNo);

	
		
		 
		hos.createPatient(dto);}
		
		String options = null;
		
		do{
		     System.out.println("Enter 1 to fetch the all patients");
			 System.out.println("Enter 2 to update address by existing id");
			 System.out.println("Enter 3 to update contactNo by existing name ");
			 System.out.println("enter 4 to delete patient details by name");
			 System.out.println("enter 5 to delete patient details by contactNo");
			 System.out.println("Enter 6 to get the name by id");
			 System.out.println("Enter 7 to get the contact no by name");
			 System.out.println("Enter 8 to delete the patient details by gender");
			 
			 System.out.println("enter the choice");
			 int choice = sc.nextInt();
			 
			 switch(choice){
				    
					case 1 : hos.getPatientDetails();
					          break ;
					case 2 : System.out.println("Enter the existing id to update the address");
		                     int existingId = sc.nextInt();
		                     System.out.println("Enter address to be update");
		                     String updateAddress = sc.next();
		                     hos.updatePatientAddressById(existingId, updateAddress);
				              break ;
					case 3 : System.out.println("Enter the existing Name to update the ContatNo");
		                     String existingName = sc.next();
		                     System.out.println("Enter contactNo to be update");
		                     long updateContactNo = sc.nextLong();
		                     hos.updatePatientContactNoByName(existingName, updateContactNo);
							 break ;
					case 4 : System.out.println("Enter the name to be deleted");
		                     String name1 = sc.next();
		                     hos.deletePatientDetailsByName(name1);
							  break ;
					case 5 :  System.out.println("enter the contact no to delete patient details");
		                      long contactNo1 = sc.nextLong();
		                      hos.deletePatientByContactNo(contactNo1);
							  break ;
					case 6 : System.out.println("enter the id to get name");
                              int existingId1 = sc.nextInt();
                              System.out.println(hos.getPatientNameById(existingId1));	
							  break;
                    case 7 : System.out.println("enter the existing name to get contact number");
                              String exstingName = sc.next();
                              System.out.println(hos.getPatientContactNoByName(exstingName));
							  break ;
                    case 8 : System.out.println("Enter the Gender to delete patient details");
		                     String ge1 = sc.next();
		                     hos.deletePatientDetailsByGender(Gender.valueOf(ge1));
							  break ;							  
					default : System.out.println("Enter the valid choices");
					          break;

			 }
			    
				System.out.println("Do you want to continue Y/N");
				options = sc.next();
			 
			 
		}while(options.equals("Y"));
		 
		
		
	 }


}