class Grinder {
static String brandName = "Pigeon";
static double price = 1500;
static String color = "Maroon";
static boolean isConnected;
static int maxVolume = 4;
static int currentVolume;
static int minVolume;

public static void main (String a[]) {
System.out.println("The BrandName is : "+brandName);
System.out.println("The Price is : "+price);
System.out.println("The Color is : "+color);
onOrOff();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
onOrOff();
}

public static void onOrOff() {
System.out.println("Invoking onOrOff()");

if(isConnected == false){
    isConnected = true;
System.out.println("The Grinder is turned on...Available to Connect");	
}

else if (isConnected == true) {
	isConnected = false;
System.out.println("The Grinder is turned off...");
}
}

public static void increaseVolume() {
	System.out.println("Increase Volume Method is Started");
	if (isConnected == true) {
		System.out.println("Grinder is turned onn");
	if (currentVolume < maxVolume) {
		currentVolume = currentVolume + 1;
	    System.out.println("The Current Volume is : " +currentVolume);
	}
	else {
		System.out.println("Max volume is Reached");
	}
	}
	else {
		System.out.println("Grinder On madu");
	}
	System.out.println("Increase Volume Method Ended");
}

public static void decreaseVolume() {
	System.out.println("Decrease Volume Method is Started");
	if (isConnected == true) {
		System.out.println("Grinder is Turned on");
		if (currentVolume > minVolume) {
			currentVolume = currentVolume - 1;
			System.out.println("The Current Volume is : " +currentVolume);
		}
		else {
			System.out.println("Min Volume is Reached"); 
		}
	    }
		else {
			System.out.println("Grinder on Madu");
		}
		System.out.println("Decrease Volume Method is Ended");
}
}
