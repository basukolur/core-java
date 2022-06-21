class Shoes1 {
	
	public Shoes1() {
     System.out.println("Shoes object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String name;
String color;
int size;
int price;

public static void main(String a[]){
Shoes1 shoes = new Shoes1();
shoes.id = 1;
shoes.name = "Puma";
shoes.color = "White";
shoes.size = 9;
shoes.price = 2000;

System.out.println("Shoes ID is : "+shoes.id);
System.out.println("Shoes Name is : "+shoes.name);
System.out.println("Shoes Color  is : "+shoes.color);
System.out.println("Shoes  Size is : "+shoes.size);
System.out.println("Shoes Price is : "+shoes.price);
System.out.println(" ");

Shoes1 shoes1 = new Shoes1();
shoes1.id = 2;
shoes1.name = "Fastrack";
shoes1.color = "Black";
shoes1.size = 9;
shoes1.price = 1000;

System.out.println("Shoes ID is : "+shoes1.id);
System.out.println("Shoes Name is : "+shoes1.name);
System.out.println("Shoes Color  is : "+shoes1.color);
System.out.println("Shoes  Size is : "+shoes1.size);
System.out.println("Shoes Price is : "+shoes1.price);
System.out.println(" ");

Shoes1 shoes2 = new Shoes1();
shoes2.id = 3;
shoes2.name = "US POLO";
shoes2.color = "White";
shoes2.size = 9;
shoes2.price = 2500;

System.out.println("Shoes ID is : "+shoes2.id);
System.out.println("Shoes Name is : "+shoes2.name);
System.out.println("Shoes Color  is : "+shoes2.color);
System.out.println("Shoes  Size is : "+shoes2.size);
System.out.println("Shoes Price is : "+shoes2.price);
System.out.println(" ");

Shoes1 shoes3 = new Shoes1();
shoes3.id = 4;
shoes3.name = "Bata";
shoes3.color = "Maroon";
shoes3.size = 9;
shoes3.price = 1500;

System.out.println("Shoes ID is : "+shoes3.id);
System.out.println("Shoes Name is : "+shoes3.name);
System.out.println("Shoes Color  is : "+shoes3.color);
System.out.println("Shoes  Size is : "+shoes3.size);
System.out.println("Shoes Price is : "+shoes3.price);
System.out.println(" ");
}
}