class AC {
static String brandName = "Panasonic";
static double price = 35000;
static String color ="White";
static boolean isConnected;
static int maxTemp = 5;
static int currentTemp;
static int minTemp;

public static void main(String a[]) {
System.out.println("The BrandName is : "+brandName);
System.out.println("The Price is : "+price);
System.out.println("The color is : "+color);
onOrOff();
increaseTemp();
increaseTemp();
increaseTemp();
increaseTemp();
increaseTemp();
increaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
decreaseTemp();
onOrOff();	
}

public static void onOrOff() {
System.out.println("The Invoking onOrOff() ");

if (isConnected == false) {
isConnected = true;
System.out.println("The AC is turned on...Available to Connect");
}

else if(isConnected == true) {
isConnected = false;
System.out.println("The AC is turned off...");
}
}

public static void increaseTemp() {
	System.out.println("Increase Temp Method Started");
    if(isConnected == true) {
	System.out.println("The AC is turned on");
	if(currentTemp < maxTemp) {
		currentTemp = currentTemp + 1;
	System.out.println("sThe Current Temp is : " +currentTemp);
	}
	else {
		System.out.println("Max Temp is Reached");
	}
    }
	else {
		System.out.println("AC On Madu");	
	}
	System.out.println("Increase Temp Method Ended");
    }

public static void decreaseTemp() {
	System.out.println("Decrease Temp Method Started");
	if(isConnected == true) {
		System.out.println("The AC is turned onn");
	if(currentTemp > minTemp) {
		currentTemp = currentTemp - 1;
	System.out.println("The Current Temp is : " +currentTemp);
	}
	else {
	System.out.println("Min Temp is Reached");
	}
	}
	else {
    System.out.println("AC On Madu");
	}
	System.out.println("Decrease Temp Method Ended");
	}
}