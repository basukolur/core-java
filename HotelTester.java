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
	}
}