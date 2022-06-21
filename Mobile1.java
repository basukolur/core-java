class Mobile1 {
	
	public Mobile1() {
     System.out.println("Mobile object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String name;
String color;
String model;
int price;
String processor;

public static void main(String a[]) {
Mobile1 mobile = new Mobile1();
mobile.id = 1;
mobile.name = "Samsung";
mobile.color = "White";
mobile.model = "GalaxyF22";
mobile.price = 10499;
mobile.processor = "MediaTek Helio G80";

System.out.println("Mobile ID is : "+mobile.id);
System.out.println("Mobile Name is : "+mobile.name);
System.out.println("Mobile Color is : "+mobile.color);
System.out.println("Mobile Model is : "+mobile.model);
System.out.println("Mobile Price is : "+mobile.price);
System.out.println("Mobile Processsor is : "+mobile.processor);
System.out.println(" ");

Mobile1 mobile1 = new Mobile1();
mobile1.id = 2;
mobile1.name = "RealMe";
mobile1.color = "Orange";
mobile1.model = "6Pro";
mobile1.price = 19999;
mobile1.processor = "Snapdragon 720G";

System.out.println("Mobile ID is : "+mobile1.id);
System.out.println("Mobile Name is : "+mobile1.name);
System.out.println("Mobile Color is : "+mobile1.color);
System.out.println("Mobile Model is : "+mobile1.model);
System.out.println("Mobile Price is : "+mobile1.price);
System.out.println("Mobile Processsor is : "+mobile1.processor);
System.out.println(" ");

Mobile1 mobile2 = new Mobile1();
mobile2.id = 3;
mobile2.name = "Redmi";
mobile2.color =  "Purple";
mobile2.model = "Note10S";
mobile2.price = 12999;
mobile2.processor = "MediaTek Helio G95";

System.out.println("Mobile ID is : "+mobile2.id);
System.out.println("Mobile Name is : "+mobile2.name);
System.out.println("Mobile Color is : "+mobile2.color);
System.out.println("Mobile Model is : "+mobile2.model);
System.out.println("Mobile Price is : "+mobile2.price);
System.out.println("Mobile Processsor is : "+mobile2.processor);
System.out.println(" ");

Mobile1 mobile3 = new Mobile1();
mobile3.id = 4;
mobile3.name = "OnePlus";
mobile3.color =  "Black Dusk";
mobile3.model = "Nord CE 2 Lite 5G";
mobile3.price = 19645;
mobile3.processor = "Octa Core 2.2 GHz";

System.out.println("Mobile ID is : "+mobile3.id);
System.out.println("Mobile Name is : "+mobile3.name);
System.out.println("Mobile Color is : "+mobile3.color);
System.out.println("Mobile Model is : "+mobile3.model);
System.out.println("Mobile Price is : "+mobile3.price);
System.out.println("Mobile Processsor is : "+mobile3.processor);
System.out.println(" ");
}
}