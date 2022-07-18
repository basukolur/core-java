import java.util.Scanner ;

class CustomerTester{

      public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of orders");
		 int size = sc.nextInt();
		 
		 Customer cus = new Customer(size);
		 
		for(int i=0; i<size;i++) {
			
		   OrderDTO order = new OrderDTO();
		   
		   System.out.println("Enter the id of the order");
		   int id = sc.nextInt();
		   System.out.println("Enter the Order name");
		   String name = sc.next();
		   System.out.println("Enter the quantity of the order");
		   int quantity = sc.nextInt();
		   System.out.println("Enter type of the order");
		   String type = sc.next();
		   
		   order.setId(id);
		   order.setName(name);
		   order.setQuantity(quantity);
		   order.setType(type);
		   
		   cus.createOrder(order);
		 
		 
		 }
		 
		 String option = null;
		 do{
			 System.out.println("Enter 1 for order details");
			 System.out.println("Enter 2 for Update the name by id");
			 System.out.println("Enter 3 for update quantity by name");
			 System.out.println("enter 4 for delete by name");
			 System.out.println("Enter 5 for delete by id");
			 System.out.println("Enter 6 for getOrderTypeby name");
			 System.out.println("Enter 7 for getOrder name by id");
			 System.out.println("Enter 8 for getallOrderquantities");
			 System.out.println("Enter 9 for get all order names");
			 
			 System.out.println("Enter choice");
			 int choice = sc.nextInt();
			 
			 switch(choice){
				 case 1: cus.getOrderDetails();
				         break ;
				
				 case 2 : System.out.println("Enter the existing Name to update the quantity");
		                  String existingName = sc.next();
		                  System.out.println("Enter quantity to be update");
		                  int updatequantity = sc.nextInt();
		                  cus.updatequantityByName(existingName, updatequantity);
                           break ;
                 case 3 : System.out.println("Enter the existing id to update the name");
		                  int existingId = sc.nextInt();
		                  System.out.println("Enter name to  update");
		                  String updateName = sc.next();
						  cus.updateNameById(existingId, updateName);
						  break;
				 case 4 : System.out.println("Enter the name to be deleted");
		                   String name1 = sc.next();
		                  cus.deleteByName(name1);
						  break;
				 case 5 : System.out.println("enter the id to be deleted");
		                   int id1 = sc.nextInt();
		                   cus.deleteById(id1);
		 			       break;
						  
				 case 6 : System.out.println("enter name to find the type");
				           String name2 = sc.next();
						  System.out.println( cus.getOrderTypeByName(name2));
						   break ;
						   
				 case 7 : System.out.println("Enter id to get name");
				           int id2 = sc.nextInt();
						   System.out.println(cus.getOrderNameById(id2));
						   break ;
						   
				 case 8 : cus.getAllQuantities();
				           break ;
							
				 case 9 : cus.getAllOrderName();
				           break;
				 default : System.out.println("Enter valid choice");
				           break;
			 }
			 
			 System.out.println("Do you want to continue Y/N");
			 option = sc.next();
			 
			 
		 }while(option.equals("Y"));
		 

	  }


}