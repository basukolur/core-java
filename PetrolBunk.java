class PetrolBunk {
static String name = "Indian Oil";
static String name1 = "Hindustan Petrolium";
static String name2 = "Reliance";
double petrolPrice;
double dieselPrice;
String location;
long contactNo;

public PetrolBunk (double petrol, double diesel, String loc,long cNo) {
petrolPrice = petrol;
dieselPrice = diesel;
location = loc;
contactNo = cNo;
}
public static void main (String a[]) {
PetrolBunk bunk = new PetrolBunk (101.92, 87.87, "Rajajinagar", 9879879879L);
System.out.println("Bunk Name : "+PetrolBunk.name);
System.out.println("Petrol Price : "+bunk.petrolPrice +"  Diesel Price : "+bunk.dieselPrice+" Location : "+bunk.location+ " Contanct No : "+bunk.contactNo);
System.out.println(" ");

PetrolBunk bunk1 = new PetrolBunk (101.50, 87.50, "BTM", 8768768768L);
System.out.println("Bunk Name : "+PetrolBunk.name1);
System.out.println("Petrol Price : "+bunk1.petrolPrice +"  Diesel Price : "+bunk1.dieselPrice+" Location : "+bunk1.location+ " Contanct No : "+bunk1.contactNo);
System.out.println(" ");

PetrolBunk bunk2 = new PetrolBunk (100.50, 86.50, "Malleshwar", 767887878L);	
System.out.println("Bunk Name : "+PetrolBunk.name2);
System.out.println("Petrol Price : "+bunk2.petrolPrice +"  Diesel Price : "+bunk2.dieselPrice+" Location : "+bunk2.location+ " Contanct No : "+bunk2.contactNo);

}
}