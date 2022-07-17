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
		htl.getFoodDetails();
		
		//invoking update Price By Id method
			System.out.println("Enter the Existing id for price has to be");
			int existingId = scan.nextInt();
			System.out.println("Enter the Price to be Updated");
			double updatedPrice = scan.nextDouble();
			htl.updateFoodItemPriceById(existingId,updatedPrice);
			htl.getFoodDetails();
			
		//invoking update Price By name method	
			System.out.println("Enter the Existing name for Price has to be");
			String existingName = scan.next();
			System.out.println("Enter the Price to be Updated");
			double price = scan.nextDouble();
			htl.updateFoodItemPriceByName(existingName , price);
			htl.getFoodDetails();
			
		//invoking delete food item by name method
			System.out.println("Enter the Existing Name for delete Food Item");
			String name = scan.next();
		    htl.deleteFoodItemByName(name);
			htl.getFoodDetails();
	}
}