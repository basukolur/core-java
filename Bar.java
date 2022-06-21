class Bar {
	
	public Bar() {
     System.out.println("Bar object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String type;
String name;
String address;
long contactNo;
String products[]= new String[3];

public static void main(String a[]){
Bar bar = new Bar();
bar.id = 1;
bar.type = "MRP";
bar.name = "Wines and Spirit";
bar.address = "Majestic";
bar.contactNo = 1234567890L;
bar.products[0] = "Old Monk";
bar.products[1] = "RedLebel";
bar.products[2] = "DSP Black"; 

System.out.println("Bar ID is : "+bar.id);
System.out.println("Bar Type is : "+bar.type);
System.out.println("Bar Name is : "+bar.name);
System.out.println("Bar Address is : "+bar.address);
System.out.println("Bar Contact No is : "+bar.contactNo);
System.out.println("Bar Products are : ");
bar.getProducts();

Bar bar1 = new Bar();
bar1.id = 2;
bar1.type = "MRP";
bar1.name = "Woodland Bar";
bar1.address = "Belagavi";
bar1.contactNo = 9876543221L;
bar1.products[0] = "Old Monk";
bar1.products[1] = "RedLebel";
bar1.products[2] = "DSP Black"; 

System.out.println("Bar ID is : "+bar1.id);
System.out.println("Bar Type is : "+bar1.type);
System.out.println("Bar Name is : "+bar1.name);
System.out.println("Bar Address is : "+bar1.address);
System.out.println("Bar Contact No is : "+bar1.contactNo);
System.out.println("Bar Products are : ");
bar1.getProducts();

Bar bar2 = new Bar();
bar2.id = 3;
bar2.type = "Bar And Family Restaurants";
bar2.name = "Cosmos Bar and Resto";
bar2.address = "RR Nagar";
bar2.contactNo = 3546767890L;
bar2.products[0] = "Old Monk";
bar2.products[1] = "RedLebel";
bar2.products[2] = "DSP Black"; 

System.out.println("Bar ID is : "+bar2.id);
System.out.println("Bar Type is : "+bar2.type);
System.out.println("Bar Name is : "+bar2.name);
System.out.println("Bar Address is : "+bar2.address);
System.out.println("Bar Contact No is : "+bar2.contactNo);
System.out.println("Bar Products are : ");
bar2.getProducts();

Bar bar3 = new Bar();
bar3.id = 4;
bar3.type = "Bar abd Restaurants";
bar3.name = "Ganesh Bar";
bar3.address = "Gokak";
bar3.contactNo = 9876567890L;
bar3.products[0] = "Old Monk";
bar3.products[1] = "RedLebel";
bar3.products[2] = "DSP Black"; 

System.out.println("Bar ID is : "+bar3.id);
System.out.println("Bar Type is : "+bar3.type);
System.out.println("Bar Name is : "+bar3.name);
System.out.println("Bar Address is : "+bar3.address);
System.out.println("Bar Contact No is : "+bar3.contactNo);
System.out.println("Bar Products are : ");
bar3.getProducts();
}

public void getProducts() {
for (int i=0; i<products.length; i++){
System.out.println(products[i]);
}
System.out.println("  ");
}
}