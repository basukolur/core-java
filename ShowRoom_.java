class ShowRoom_ {
 int id;
 static String name = "WoodLand";
 static int noOfBranches = 56;
 String location;
 long contactNo;
 
 public ShowRoom_() {
 System.out.println("ShowRoom Object Created");
 }
 
 public static void main(String a[]) {
 ShowRoom_ show = new ShowRoom_();
 show.id = 1;
 show.contactNo = 3453453456L;
 //show.name = "WoodLand";
 //show.noOfBranches =56;
 show.location = "Commercial Street";
 
 System.out.println("ShowRoom Id : "+show.id);
 System.out.println(ShowRoom_.name+ " "+ShowRoom_.noOfBranches);
 System.out.println("ShowRoom Contact NO : "+show.contactNo);
 System.out.println("ShowRoom Location : "+show.location);
 System.out.println(" ");
 
 
 ShowRoom_ show1 = new ShowRoom_();
 show1.id = 2;
 show1.contactNo = 3453453457L;
 //show.name = "WoodLand";
 //show.noOfBranches =56;
 show1.location = "JayaNagar";
 
 System.out.println("ShowRoom Id : "+show1.id);
 System.out.println(ShowRoom_.name+ " "+ShowRoom_.noOfBranches);
 System.out.println("ShowRoom Contact NO : "+show1.contactNo);
 System.out.println("ShowRoom Location : "+show1.location);
 
  }
}

