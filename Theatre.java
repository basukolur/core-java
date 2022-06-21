class Theatre {
	
	public Theatre() {
     System.out.println("Theatre object Created");
     System.out.println("-----------------");	 
	}
	
String name;
String address;
long contactNo;
String ownerName;
String runningMovies[] = new String[3] ;


public static void main (String a[]) {
//ClassName refVariable = new ClassName();
  Theatre theatre = new Theatre();
theatre.name = "Veeresh";
theatre.address = "Magadi Road";
theatre.contactNo = 8908908901L;
theatre.ownerName = "XYZ";
theatre.runningMovies [0] = "Vikram";
theatre.runningMovies [1] = "Charlie 777";
theatre.runningMovies [2] = "Om";

System.out.println("Theatre Name is : "+theatre.name);
System.out.println("Theatre Address is : "+theatre.address);
System.out.println("Thetre Contact No is : "+theatre.contactNo);
System.out.println("Theatre Owner Name is : "+theatre.ownerName);
System.out.println("Theatre Running Movies are : ");
theatre.getRunningMovies();
}
public void getRunningMovies() {
	for (int i=0; i<runningMovies.length; i++) {
	System.out.println(runningMovies[i]);
}
}
}