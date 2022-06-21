class Institute {
static String name = "Indian Institute of Science";
static String name1 = "Ramaiah Institute of Technology";
String location;
String founder;
long contactNo;
int establish;

public Institute (String loc, String fndr, long cNo, int est) {
location = loc;
founder = fndr;
contactNo = cNo;
establish = est;
}
public static void main(String a[]) {
Institute institute = new Institute("Bangalore","TATA & Krishnaraj Wadiyar IV",9879879879L,1909);
System.out.println("Institute Name : "+Institute.name);
System.out.println("Location : "+institute.location+" Founder: "+institute.founder+"  Contact No : "+institute.contactNo+"  Established : "+institute.establish);
System.out.println(" ");

Institute institute1 = new Institute("Bangalore","M.S.Ramaiah",7897897890L,1962);
 System.out.println("Institute Name : "+Institute.name1);
System.out.println("Location : "+institute1.location+" Founder: "+institute1.founder+" Contact No : "+institute1.contactNo+" Established : "+institute1.establish);



}



}