class Stationary {
	
	public Stationary() {
     System.out.println("Stationary object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String name;
String address;
long contactNo;

public static void main(String a[]) {
Stationary stationary = new Stationary();
stationary.id = 1;
stationary.name = "Vijay Stationary";
stationary.address = "VijayNagar";
stationary.contactNo = 9876567843L;

System.out.println("Stationary ID : "+stationary.id);
System.out.println("Stationary Name : "+stationary.name);
System.out.println("Stationary Address : "+stationary.address);
System.out.println("Stationary ContactNo : "+stationary.contactNo);
System.out.println(" ");

Stationary stationary1 = new Stationary();
stationary1.id = 2;
stationary1.name = "Ravi Stationary";
stationary1.address = "J.P.Nagar";
stationary1.contactNo = 8765467843L;

System.out.println("Stationary ID : "+stationary1.id);
System.out.println("Stationary Name : "+stationary1.name);
System.out.println("Stationary Address : "+stationary1.address);
System.out.println("Stationary ContactNo : "+stationary1.contactNo);
System.out.println(" ");

Stationary stationary2 = new Stationary();
stationary.id = 3;
stationary2.name = "Rahul Stationary";
stationary2.address = "GayatriNagar";
stationary2.contactNo = 6566567843L;

System.out.println("Stationary ID : "+stationary2.id);
System.out.println("Stationary Name : "+stationary2.name);
System.out.println("Stationary Address : "+stationary2.address);
System.out.println("Stationary ContactNo : "+stationary2.contactNo);
System.out.println(" ");

Stationary stationary3 = new Stationary();
stationary3.id = 4;
stationary3.name = "Ajay Stationary";
stationary3.address = "MarutiNagar";
stationary3.contactNo = 98764546843L;

System.out.println("Stationary ID : "+stationary3.id);
System.out.println("Stationary Name : "+stationary3.name);
System.out.println("Stationary Address : "+stationary3.address);
System.out.println("Stationary ContactNo : "+stationary3.contactNo);
System.out.println(" ");
}
}