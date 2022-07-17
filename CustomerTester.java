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
		
		String option = null;
		do{
			System.out.println("Enter 1 fetch all the Orders ");
			System.out.println("Enter 2 to update the Order date by Id ");
			System.out.println("Enter 3 to update order price by name ");
			System.out.println("Enter 4 to delete order by name ");
			System.out.println("Enter the Choise ");
			int choise = scan.nextInt();
			
			switch(choise){
				case 1 : cust.getOrderDetails();
				break;
				
				case 2 : System.out.println("Enter the Existing id for date has to be");
			            int existingId = scan.nextInt();
			            System.out.println("Enter the Date to be Updated");
			            String updatedDate = scan.next();
			            cust.updateOrderDateById(existingId,updatedDate);
						break;
						
				case 3 : System.out.println("Enter the Existing name for Price has to be");
			            String existingName = scan.next();
			            System.out.println("Enter the Price to be Updated");
			            double updatedPrice = scan.nextDouble();
			            cust.updateOrderPriceByName(existingName , updatedPrice);
						break;
						
				case 4 : System.out.println("Enter the Existing Name for delete Order");
			            String name = scan.next();
		                cust.deleteOrderByName(name);
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