class SMall {
	
	public SMall() {
     System.out.println("ShoppingMall object Created");
     System.out.println("-----------------");	 
	}
	
int id;	
String name;
String address;
String ownerName;
int noOfEmployees;

public static void main(String a[]) {

SMall shoppingMall = new SMall();
shoppingMall.id = 1;
shoppingMall.name = "Forum";
shoppingMall.address = "Koramangala";
shoppingMall.ownerName = "ABC";
shoppingMall.noOfEmployees = 50;

System.out.println("ShoppingMall ID is : "+shoppingMall.id);
System.out.println("ShoppingMall Name is : "+shoppingMall.name);
System.out.println("ShoppingMall Address is : "+shoppingMall.address);
System.out.println("ShoppingMall Owner Name is : "+shoppingMall.ownerName);
System.out.println("ShoppingMall No of Employee : "+shoppingMall.noOfEmployees);
System.out.println(" ");

SMall shoppingMall1 = new SMall();
shoppingMall1.id = 2;
shoppingMall1.name = "MantriSquare";
shoppingMall1.address = "Malleshwaram";
shoppingMall1.ownerName = "PQR";
shoppingMall.noOfEmployees = 40;

System.out.println("ShoppingMall ID is : "+shoppingMall1.id);
System.out.println("ShoppingMall Name is : "+shoppingMall1.name);
System.out.println("ShoppingMall Address is : "+shoppingMall1.address);
System.out.println("ShoppingMall Owner Name is : "+shoppingMall1.ownerName);
System.out.println("ShoppingMall No of Employee : "+shoppingMall.noOfEmployees);
System.out.println(" ");

SMall shoppingMall2 = new SMall();
shoppingMall2.id = 3;
shoppingMall2.name = "Orian";
shoppingMall2.address = "Yashwantpura";
shoppingMall2.ownerName = "XYZ";
shoppingMall.noOfEmployees = 60;

System.out.println("ShoppingMall ID is : "+shoppingMall2.id);
System.out.println("ShoppingMall Name is : "+shoppingMall2.name);
System.out.println("ShoppingMall Address is : "+shoppingMall2.address);
System.out.println("ShoppingMall Owner Name is : "+shoppingMall2.ownerName);
System.out.println("ShoppingMall No of Employee : "+shoppingMall.noOfEmployees);
System.out.println(" ");

SMall shoppingMall3 = new SMall();
shoppingMall3.id = 4;
shoppingMall3.name = "Nucleus";
shoppingMall3.address = "Belagavi";
shoppingMall3.ownerName = "MNO";
shoppingMall.noOfEmployees = 25;

System.out.println("ShoppingMall ID is : "+shoppingMall3.id);
System.out.println("ShoppingMall Name is : "+shoppingMall3.name);
System.out.println("ShoppingMall Address is : "+shoppingMall3.address);
System.out.println("ShoppingMall Owner Name is : "+shoppingMall3.ownerName);
System.out.println("ShoppingMall No of Employee : "+shoppingMall.noOfEmployees);
System.out.println(" ");
}
}