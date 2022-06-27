class TransportTester {
public static void main (String a[]) {
Transport trans = new Transport();
trans.ticketPrice = 750.00;
trans.noOfSeats = 50;
trans.startPoint = "Belagavi";
trans.endPoint = "Bangalore";
trans.travelDistance = "600 KM";
System.out.println(trans.ticketPrice+"  "+trans.noOfSeats+"  "+trans.startPoint+"  "+trans.endPoint+"  "+trans.travelDistance);
}
}