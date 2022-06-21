class HistoricalPlace {
static String name = "City Of Ruins";
static String name1 = "City of palaces";
static String name2 = "Unique Rock Cut Temples";
String location;
String tripDuration;

public HistoricalPlace(String loc, String duration) {
location = loc;
tripDuration = duration;
}

public static void main (String a[] ) {

HistoricalPlace history = new HistoricalPlace ("Hampi", "2Days");
System.out.println("Name : "+HistoricalPlace.name);
System.out.println("Location : "+history.location+"  Trip duration : "+history.tripDuration);
System.out.println("   ");

HistoricalPlace history1 = new HistoricalPlace ("Mysore","2days");
System.out.println("Name : "+HistoricalPlace.name1);
System.out.println("Location : "+history1.location+"  Trip duration : "+history1.tripDuration);
System.out.println("   ");

HistoricalPlace history2 = new HistoricalPlace ("Badami", "1day");	
System.out.println("Name : "+HistoricalPlace.name2);
System.out.println("Location : "+history2.location+"  Trip duration : "+history2.tripDuration);

}
}