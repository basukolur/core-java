class Garden {
static String name = "Lalbagh";
static String name1 = "Cubbon Park";
String location; 
String openTime; 
String closeTime;
String area;

public Garden (String loc, String oTime,String cTime, String aRea) {
location = loc;
openTime = oTime;
closeTime = cTime;
area = aRea; 
}

public static void main (String a[]) {

Garden garden = new Garden ("Bangalore","9.00am","6.00pm","240acre");
System.out.println("Garden Name : "+Garden.name);
System.out.println("Location : "+garden.location+"  OpenTime : "+garden.openTime+"  CloseTime : "+garden.closeTime+"  Area : "+garden.area);
System.out.println("  ");

Garden garden1 = new Garden ("Bangalore","9.00am","6.00pm","300acre");
System.out.println("Garden Name : "+Garden.name1);
System.out.println("Location : "+garden1.location+"  OpenTime : "+garden1.openTime+"  CloseTime : "+garden1.closeTime+"  Area : "+garden1.area);

}
}