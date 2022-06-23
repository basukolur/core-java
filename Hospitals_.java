class Hospitals_{
String name;
int noOfDocs;
String location;

public Hospitals_(){
System.out.println("Hospitals Object Created");
}
public Hospitals_(String name, int noOfDocs, String location){
this();
this.name = name;
this.noOfDocs = noOfDocs;
this.location = location;
}
public static void main(String a[]){
Hospitals_ hospitals = new Hospitals_("LakeView",20,"Belagavi");
System.out.println("Hospital Name "+hospitals.name);
System.out.println("No Of Doctors " +hospitals.noOfDocs);
System.out.println("Location "+hospitals.location);
}
}