class Factory {
	
	public Factory() {
     System.out.println("Factory object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String name;
String address;
long contactNo;

public static void main (String a[]) {
	
Factory factory = new Factory();
factory.id = 1;
factory.name = "Satish Sugars";
factory.address = "Gokak";
factory.contactNo = 8765456789L;

System.out.println("Factory ID : "+factory.id);
System.out.println("Factory name : "+factory.name);
System.out.println("Factory Address : "+factory.address);
System.out.println("Factory ContactNo : "+factory.contactNo);
System.out.println(" ");

Factory factory1 = new Factory();
factory1.id = 2;
factory1.name = " JP Cement Factory";
factory1.address = "Yadwad";
factory1.contactNo = 78965676789L;

System.out.println("Factory ID : "+factory1.id);
System.out.println("Factory name : "+factory1.name);
System.out.println("Factory Address : "+factory1.address);
System.out.println("Factory ContactNo : "+factory1.contactNo);
System.out.println(" ");

Factory factory2 = new Factory();
factory2.id = 3;
factory2.name = " HP Factory";
factory2.address = "Pinya";
factory2.contactNo = 9898456789L;

System.out.println("Factory ID : "+factory2.id);
System.out.println("Factory name : "+factory2.name);
System.out.println("Factory Address : "+factory2.address);
System.out.println("Factory ContactNo : "+factory2.contactNo);
System.out.println(" ");

Factory factory3 = new Factory();
factory3.id = 4;
factory3.name = "Cotton Factory";
factory3.address = "Majastic";
factory3.contactNo = 9876789789L;

System.out.println("Factory ID : "+factory3.id);
System.out.println("Factory name : "+factory3.name);
System.out.println("Factory Address : "+factory3.address);
System.out.println("Factory ContactNo : "+factory3.contactNo);
System.out.println(" ");
}
}