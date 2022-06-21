class Hospitals {
	
	public Hispitals() {
     System.out.println("Hospitals object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String name;
String location;
int noOfDoctors;
String type;

public static void main(String a[]) {

Hospitals hospitals = new Hospitals();
hospitals.id = 1;
hospitals.name = "Lake View";
hospitals.location = "belagavi";
hospitals.noOfDoctors = 30;
hospitals.type = "MultiSpeciality";

System.out.println("Hospitals ID : "+hospitals.id);
System.out.println("Hospitals Name : "+hospitals.name);
System.out.println("Hospitals Location : "+hospitals.location);
System.out.println("Hospitals NoOf Doctors : "+hospitals.noOfDoctors);
System.out.println("Hospitals Type : "+hospitals.type);
System.out.println(" ");

Hospitals hospitals1 = new Hospitals();
hospitals1.id = 2;
hospitals1.name = "KLE";
hospitals1.location = "belagavi";
hospitals1.noOfDoctors = 50;
hospitals1.type = "SuperSpeciality";

System.out.println("Hospitals ID : "+hospitals1.id);
System.out.println("Hospitals Name : "+hospitals1.name);
System.out.println("Hospitals Location : "+hospitals1.location);
System.out.println("Hospitals NoOf Doctors : "+hospitals1.noOfDoctors);
System.out.println("Hospitals Type : "+hospitals1.type);
System.out.println(" ");

Hospitals hospitals2 = new Hospitals();
hospitals2.id = 3;
hospitals2.name = "Ganga";
hospitals2.location = "Gokak";
hospitals2.noOfDoctors = 4;
hospitals2.type = "General";

System.out.println("Hospitals ID : "+hospitals2.id);
System.out.println("Hospitals Name : "+hospitals2.name);
System.out.println("Hospitals Location : "+hospitals2.location);
System.out.println("Hospitals NoOf Doctors : "+hospitals2.noOfDoctors);
System.out.println("Hospitals Type : "+hospitals2.type);
System.out.println(" ");

Hospitals hospitals3 = new Hospitals();
hospitals3.id = 4;
hospitals3.name = "Vasan Eye care";
hospitals3.location = "Belagavi";
hospitals3.noOfDoctors = 3;
hospitals3.type = "Eye Specialist";

System.out.println("Hospitals ID : "+hospitals3.id);
System.out.println("Hospitals Name : "+hospitals3.name);
System.out.println("Hospitals Location : "+hospitals3.location);
System.out.println("Hospitals NoOf Doctors : "+hospitals3.noOfDoctors);
System.out.println("Hospitals Type : "+hospitals3.type);
System.out.println(" ");
}
}