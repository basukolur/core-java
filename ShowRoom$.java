class ShowRoom$ {
                                //instance variables
 int id;
 static String name = "WoodLand";
 static int noOfBranches = 56;
 String location;
 long contactNo;
                                  //Parameterized Constructor
 public ShowRoom$(int showRoomId, String loc, long cNo) {
 System.out.println("ShowRoom Object Created");
 id = showRoomId;
 location = loc;
 contactNo = cNo;
 }
                                  //main method ==starting point
 public static void main(String a[]) {
	 
                                  //Constructor are used to initialize instance variables of class 
 ShowRoom$ show = new ShowRoom$(1,"Commercial Street",3453453456L);
 System.out.println(show.id + " "+show.location +" "+show.contactNo);
 System.out.println(ShowRoom$.name+ " "+ShowRoom$.noOfBranches);
 
 ShowRoom$ show1 = new ShowRoom$(2,"JayaNagar",3453453457L);
 System.out.println(show1.id + " "+show1.location +" "+show1.contactNo);
 System.out.println(ShowRoom$.name+ " "+ShowRoom$.noOfBranches);
 }
}

