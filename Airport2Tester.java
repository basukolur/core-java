import java.util.Scanner;
public class Airport2Tester{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of terminal to be Added");
		int size = scan.nextInt();
		
		Airport2 ap = new Airport2(size);
		for(int i=0; i<size; i++){
			System.out.println("Enter Terminals Id : ");
			int id = scan.nextInt();
			
			System.out.println("Enter Terminals Name : ");
			String name = scan.next();
			
			System.out.println("Enter no of Terminals : ");
			int noOfTerminals= scan.nextInt();
			
			System.out.println("Enter Terminals place : ");
			String place = scan.next();
			
			TerminalDTO dto = new TerminalDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setNoOfTerminals(noOfTerminals);
			dto.setPlace(place);
			ap.createTerminal(dto);
		}
		ap.getTerminalDetails();
	
	//invoking update No of Terminals By Id method
			System.out.println("Enter the Existing id for Terminals has to be");
			int existingId = scan.nextInt();
			System.out.println("Enter the No of Terminals to be Updated");
			int updatedNoOfTerminals = scan.nextInt();
			ap.updateNoOfTerminalsById(existingId, updatedNoOfTerminals);
			ap.getTerminalDetails();
			
		//invoking update Place By name method	
			System.out.println("Enter the Existing name for Place has to be");
			String existingName = scan.next();
			System.out.println("Enter the Place to be Updated");
			String updatedplace = scan.next();
			ap.updateTerminalsPlaceByName(existingName , updatedplace);
			ap.getTerminalDetails();
			
		//invoking delete Terminals by name method
			System.out.println("Enter the Existing Name for delete Terminals");
			String name = scan.next();
		    ap.deleteTerminalsByName(name);
			ap.getTerminalDetails();
	}
}