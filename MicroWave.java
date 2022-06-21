class MicroWave {
static String brandName = "Prestige";
static double price = 5000;
static String color = "Silver";
static boolean isConnected;
static int maxPower = 5;
static int currentPower;
static int minPower;

public static void main(String a[]) {
System.out.println("The BrandName is : "+brandName);
System.out.println("The Price is : "+price);
System.out.println("The Color is : "+color);
onOrOff();
increasePower();
increasePower();
increasePower();
increasePower();
increasePower();
decreasePower();
decreasePower();
decreasePower();
decreasePower();
decreasePower();
onOrOff(); 
}

public static void onOrOff() {
System.out.println("The Invoking onOrOff()");

if (isConnected == false) {
	isConnected = true;
System.out.println("The MicroWave is on...Available to Connect");
}
	
else if (isConnected == true) {
	isConnected = false;
System.out.println("The MicroWave is off...");
}
}

public static void increasePower() {
	System.out.println("Increase Power Method is Started");
	if (isConnected == true) {
		System.out.println("MicroWave is turned onn");
		if (currentPower < maxPower) {
			currentPower = currentPower + 1;
		System.out.println("The Current Power is : "+currentPower);
		}
		else {
			System.out.println("Max Power is Reached");
		}
	    }
		else {
			System.out.println("MicroWave On Madu");
		}
		System.out.println("Increase Power Method is Ended");
	    }

public static void decreasePower() {
	System.out.println("Decrease Power Method is Started");
	if (isConnected == true) {
		System.out.println("MicroWave is turned onn");
		if (currentPower > minPower) {
			currentPower = currentPower - 1;
		System.out.println("The Current Power is : "+currentPower);
		}
		else {
			System.out.println("Min Power is Reached");
		}
	    }
		else {
			System.out.println("MicroWave on Madu");
		}
		System.out.println("Decrease Power Method is Ended");
}		
}
