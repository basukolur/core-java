import java.util.Scanner;
public class CustomerTester {
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Order to be Added");
		int size = scan.nextInt();
		
		Customer cust = new Customer(size);
		for(int i=0; i<size; i++){
			System.out.println("Enter Order Id : ");
			int id = scan.nextInt();
			
			System.out.println("Enter Order Name : ");
			String name = scan.next();
			
			System.out.println("Enter Order Price : ");
			double price= scan.nextDouble();
			
			System.out.println("Enter Order Date : ");
			String date = scan.next();
			
			OrderDTO dto = new OrderDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setPrice(price);
			dto.setDate(date);
			cust.createOrder(dto);
		}
		cust.getOrderDetails();
		
		//invoking update Date By Id method
			System.out.println("Enter the Existing id for date has to be");
			int existingId = scan.nextInt();
			System.out.println("Enter the Date to be Updated");
			String updatedDate = scan.next();
			cust.updateOrderDateById(existingId,updatedDate);
		    cust.getOrderDetails();
			
		//invoking update Price By name method	
			System.out.println("Enter the Existing name for Price has to be");
			String existingName = scan.next();
			System.out.println("Enter the Price to be Updated");
			double updatedPrice = scan.nextDouble();
			cust.updateOrderPriceByName(existingName , updatedPrice);
			cust.getOrderDetails();
			
		//invoking delete order by name method
			System.out.println("Enter the Existing Name for delete Order");
			String name = scan.next();
		    cust.deleteOrderByName(name);
			cust.getOrderDetails();
	}
}