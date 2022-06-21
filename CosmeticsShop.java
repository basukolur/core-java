class CosmeticsShop {
	
	public CosmeticsShop() {
     System.out.println("CosmeticsShop object Created");
     System.out.println("-----------------");	 
	}
	
	
	
int id;
String brand;
int price;
String color;
String type;

public static void main(String a[]) {
	
CosmeticsShop cosmetics = new CosmeticsShop();
cosmetics.id = 1;
cosmetics.brand = "Swiss Beauty";
cosmetics.price = 99;
cosmetics.color = "Black";
cosmetics.type = "Eyelash";

System.out.println("Cosmetics ID : "+cosmetics.id);
System.out.println("Cosmetics Brand : "+cosmetics.brand);
System.out.println("Cosmetics Price : "+cosmetics.price);
System.out.println("Cosmetics Color : "+cosmetics.color);
System.out.println("Cosmetics Type : "+cosmetics.type);
System.out.println(" ");

CosmeticsShop cosmetics1 = new CosmeticsShop();
cosmetics1.id = 2;
cosmetics1.brand = "NutriGlow";
cosmetics1.price = 474;
cosmetics1.color = "Kesar";
cosmetics1.type = "Face Makeup Combo";

System.out.println("Cosmetics ID : "+cosmetics1.id);
System.out.println("Cosmetics Brand : "+cosmetics1.brand);
System.out.println("Cosmetics Price : "+cosmetics1.price);
System.out.println("Cosmetics Color : "+cosmetics1.color);
System.out.println("Cosmetics Type : "+cosmetics1.type);
System.out.println(" ");

CosmeticsShop cosmetics2 = new CosmeticsShop();
cosmetics2.id = 3;
cosmetics2.brand = "Just Herbs";
cosmetics2.price = 352;
cosmetics2.color = "Pink";
cosmetics2.type = "LipStick";

System.out.println("Cosmetics ID : "+cosmetics2.id);
System.out.println("Cosmetics Brand : "+cosmetics2.brand);
System.out.println("Cosmetics Price : "+cosmetics2.price);
System.out.println("Cosmetics Color : "+cosmetics2.color);
System.out.println("Cosmetics Type : "+cosmetics2.type);
System.out.println(" ");

CosmeticsShop cosmetics3 = new CosmeticsShop();
cosmetics3.id = 4;
cosmetics3.brand = "MayBelline NewYork";
cosmetics3.price = 205;
cosmetics3.color = "Black";
cosmetics3.type = "Kajal";

System.out.println("Cosmetics ID : "+cosmetics3.id);
System.out.println("Cosmetics Brand : "+cosmetics3.brand);
System.out.println("Cosmetics Price : "+cosmetics3.price);
System.out.println("Cosmetics Color : "+cosmetics3.color);
System.out.println("Cosmetics Type : "+cosmetics3.type);
System.out.println(" ");
}
}