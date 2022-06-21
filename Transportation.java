class Transportation {

       String transType;
	   int noOfSeats;
static String startPoint = "Belagavi";
static String endPoint = "Bangalore";
	
public Transportation (String type,int seats) {
System.out.println("Transportation Object Created");
	transType = type;
	noOfSeats = seats;
}
public static void main(String a[]){
	
Transportation trans = new Transportation("Metro", 100);
System.out.println("Type : "+trans.transType+ " Seats : "+trans.noOfSeats);
System.out.println("From "+Transportation.startPoint+" To "+Transportation.endPoint);

Transportation trans1 = new Transportation("Bus",50);
System.out.println("Type : "+trans1.transType+ " Seats : "+trans1.noOfSeats);
System.out.println("From "+Transportation.startPoint+" To "+Transportation.endPoint);
}
}