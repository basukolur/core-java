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
	}
}