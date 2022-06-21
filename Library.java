class Library {

static String name = "City Central Library";
static String name1 = "Indian Institute of Wolrd Culture";
int noOfBooks;
String location;
String openTime;
String closeTime;

public Library (int books, String loc, String oTime, String cTime) {

noOfBooks = books;
location = loc;
openTime = oTime;
closeTime = cTime;
}

public static void main (String a[]) {

Library lib = new Library (50000, "Jayanagar", "8.30am", "8.00pm");
System.out.println("Library Name : "+Library.name);
System.out.println("*Location : "+lib.location+"  *No Of Books : "+lib.noOfBooks+"  *Open Time : "+lib.openTime+"  *Close Time : "+lib.closeTime);
System.out.println(" ");

Library lib1 = new Library (40000, "BasavanaGudi", "9.00am", "7.30pm");
System.out.println("Library Name : "+Library.name1);
System.out.println("*Location : "+lib1.location+"  *No Of Books : "+lib1.noOfBooks+"  *Open Time : "+lib1.openTime+"  *Close Time : "+lib1.closeTime);
}

}