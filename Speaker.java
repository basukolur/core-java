class Speaker {
static String brandName ="Boat";
static double price = 2000;
static String color = "Black";
static boolean isConnected;

public static void main (String a[]) {
System.out.println("The BrandName is : "+brandName);
System.out.println("The Price is : "+price);
System.out.println("The Color is : "+color);
onOrOff();
onOrOff();
}

public static void onOrOff() {
System.out.println("Invoking onOrOff()");

if (isConnected == false){
isConnected = true;
System.out.println("speaker is turned on ...Available to Connect");
}

else if (isConnected == true) {
isConnected = false;
System.out.println("Speaker is turned off...");
}
}
}
