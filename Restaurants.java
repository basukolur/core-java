class Restaurants {
	
	public Restaurants() {
     System.out.println("Restaurants object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String name;
String address;
long contactNo;

public static void main(String a[]) {

Restaurants restaurants = new Restaurants();
restaurants.id = 1;
restaurants.name = "Marriot";
restaurants.address = "Belagavi";
restaurants.contactNo = 9876545678L;

System.out.println("Restaurants ID : "+restaurants.id);
System.out.println("Restaurant Name : "+restaurants.name);
System.out.println("Restaurant Address : "+restaurants.address);
System.out.println("Restaurant ContactNo : "+restaurants.contactNo);
System.out.println(" ");

Restaurants restaurants1 = new Restaurants();
restaurants1.id = 2;
restaurants1.name = "Native";
restaurants1.address = "Belagavi";
restaurants1.contactNo = 7676545678L;

System.out.println("Restaurants ID : "+restaurants1.id);
System.out.println("Restaurant Name : "+restaurants1.name);
System.out.println("Restaurant Address : "+restaurants1.address);
System.out.println("Restaurant ContactNo : "+restaurants1.contactNo);
System.out.println(" ");
 
Restaurants restaurants2 = new Restaurants();
restaurants2.id = 3;
restaurants2.name = "Ramdev";
restaurants2.address = "Belagavi";
restaurants2.contactNo = 7878786678L;

System.out.println("Restaurants ID : "+restaurants2.id);
System.out.println("Restaurant Name : "+restaurants2.name);
System.out.println("Restaurant Address : "+restaurants2.address);
System.out.println("Restaurant ContactNo : "+restaurants2.contactNo);
System.out.println(" ");

Restaurants restaurants3 = new Restaurants();
restaurants3.id = 4;
restaurants3.name = "Sanman";
restaurants3.address = "Belagavi";
restaurants3.contactNo = 7657584678L;

System.out.println("Restaurants ID : "+restaurants3.id);
System.out.println("Restaurant Name : "+restaurants3.name);
System.out.println("Restaurant Address : "+restaurants3.address);
System.out.println("Restaurant ContactNo : "+restaurants3.contactNo);
System.out.println(" ");
}
}
