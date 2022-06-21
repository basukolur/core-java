class ShowRoom {
	public ShowRoom() {
     System.out.println("ShowRoom object Created");
     System.out.println("------");	 
	}
int id;
String name;
String address;
long contactNo;
int noOfEmployees;

public static void main (String a[]) {
ShowRoom showRoom = new ShowRoom();
showRoom.id = 1;
showRoom.name = "Trends";
showRoom.address= "Malleshwaram";
showRoom.contactNo = 9876543210L;
showRoom.noOfEmployees = 20;

System.out.println("ShowRoom ID is : "+showRoom.id);
System.out.println("ShowRoom Name is : "+showRoom.name);
System.out.println("ShowRoom Address is : "+showRoom.address);
System.out.println("ShowRoom ContactNo is : "+showRoom.contactNo);
System.out.println("No Of Employees are : "+showRoom.noOfEmployees);
System.out.println("  ");

ShowRoom showRoom1 = new ShowRoom();
showRoom1.id = 2;
showRoom1.name = "Brand Factory";
showRoom1.address= "BTM";
showRoom1.contactNo = 8765643210L;
showRoom1.noOfEmployees = 23;

System.out.println("ShowRoom ID is : "+showRoom1.id);
System.out.println("ShowRoom Name is : "+showRoom1.name);
System.out.println("ShowRoom Address is : "+showRoom1.address);
System.out.println("ShowRoom ContactNo is : "+showRoom1.contactNo);
System.out.println("No Of Employees are : "+showRoom1.noOfEmployees);
System.out.println("  ");

ShowRoom showRoom2 = new ShowRoom();
showRoom2.id = 3;
showRoom2.name = "Value and Verity";
showRoom2.address= "Majestic";
showRoom2.contactNo = 9878965210L;
showRoom2.noOfEmployees = 30;

System.out.println("ShowRoom ID is : "+showRoom2.id);
System.out.println("ShowRoom Name is : "+showRoom2.name);
System.out.println("ShowRoom Address is : "+showRoom2.address);
System.out.println("ShowRoom ContactNo is : "+showRoom2.contactNo);
System.out.println("No Of Employees are : "+showRoom2.noOfEmployees);
System.out.println("  ");

ShowRoom showRoom3 = new ShowRoom();
showRoom3.id = 4;
showRoom3.name = "Max";
showRoom3.address= "Koramangala";
showRoom3.contactNo = 7654543210L;
showRoom3.noOfEmployees = 40;

System.out.println("ShowRoom ID is : "+showRoom3.id);
System.out.println("ShowRoom Name is : "+showRoom3.name);
System.out.println("ShowRoom Address is : "+showRoom3.address);
System.out.println("ShowRoom ContactNo is : "+showRoom3.contactNo);
System.out.println("No Of Employees are : "+showRoom3.noOfEmployees);
System.out.println("  ");
}
}