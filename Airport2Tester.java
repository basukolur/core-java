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
	}
}