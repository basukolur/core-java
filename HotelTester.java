import java.util.Scanner;
public class HotelTester {
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Food Items to be Added");
		int size = scan.nextInt();
		
		Hotel htl = new Hotel(size);
		for(int i=0; i<size; i++){
			System.out.println("Enter Food Item Id : ");
			int id = scan.nextInt();
			
			System.out.println("Enter Food Item Name : ");
			String name = scan.next();
			
			System.out.println("Enter the Food Item Price : ");
			double price = scan.nextDouble();
			
			FoodItemsDTO dto = new FoodItemsDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setPrice(price);
			htl.createFoodItems(dto);
		}
		
		String option = null;
		do{
			System.out.println("Enter 1 fetch all the Food Items ");
			System.out.println("Enter 2 to update the Food Item Price by Id ");
			System.out.println("Enter 3 to update Food Item  by name ");
			System.out.println("Enter 4 to delete Food Item by name ");
			System.out.println("Enter the Choise ");
			int choise = scan.nextInt();
			
			switch(choise){
				case 1 : htl.getFoodDetails();
				break;
				
				case 2 : System.out.println("Enter the Existing id for price has to be");
						int existingId = scan.nextInt();
					    System.out.println("Enter the Price to be Updated");
						double updatedPrice = scan.nextDouble();
						htl.updateFoodItemPriceById(existingId,updatedPrice);
						break;
						
				case 3 : System.out.println("Enter the Existing name for Price has to be");
			            String existingName = scan.next();
			            System.out.println("Enter the Price to be Updated");
			            double price = scan.nextDouble();
			            htl.updateFoodItemPriceByName(existingName , price);
                        break;
                
                case 4 : System.out.println("Enter the Existing Name for delete Food Item");
			            String name = scan.next();
		                htl.deleteFoodItemByName(name);
                        break;
                
                default : System.out.println("Given choise cannot be delivered");
                        break;								
			}
			System.out.println("Do you want to continue y/n ");
			option = scan.next();
		}
		while(option.equals("y"));
	}	
}