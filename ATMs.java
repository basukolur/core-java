class ATMs {
	
	public ATMs() {
     System.out.println("ATMs object Created");
     System.out.println("-----------------");	 
	}
	
int id;
String branch;
String type;
int noOfMachines;

public static void main(String a[]){

ATMs atms = new ATMs();
atms.id = 1; 
atms.branch = "Rajajinagar";
atms.type = "Withdraw";
atms.noOfMachines = 20;

System.out.println("ATMs ID : "+atms.id);
System.out.println("ATMs Branch : "+atms.branch);
System.out.println("ATMs Type : "+atms.type);
System.out.println("ATMs No of Machines : "+atms.noOfMachines);
System.out.println(" ");

ATMs atms1 = new ATMs();
atms1.id = 2; 
atms1.branch = "R.R.Nagar";
atms1.type = "Withdraw";
atms1.noOfMachines = 10;

System.out.println("ATMs ID : "+atms1.id);
System.out.println("ATMs Branch : "+atms1.branch);
System.out.println("ATMs Type : "+atms1.type);
System.out.println("ATMs No of Machines : "+atms1.noOfMachines);
System.out.println(" ");

ATMs atms2 = new ATMs();
atms2.id = 3; 
atms2.branch = "BTM";
atms2.type = "Withdraw and Deposit";
atms2.noOfMachines = 25;

System.out.println("ATMs ID : "+atms2.id);
System.out.println("ATMs Branch : "+atms2.branch);
System.out.println("ATMs Type : "+atms2.type);
System.out.println("ATMs No of Machines : "+atms2.noOfMachines);
System.out.println(" ");

ATMs atms3 = new ATMs();
atms3.id = 4; 
atms3.branch = "VijayNagar";
atms3.type = "Withdraw and Deposit";
atms3.noOfMachines = 30;

System.out.println("ATMs ID : "+atms3.id);
System.out.println("ATMs Branch : "+atms3.branch);
System.out.println("ATMs Type : "+atms3.type);
System.out.println("ATMs No of Machines : "+atms3.noOfMachines);
System.out.println(" ");
}
}