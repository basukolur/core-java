class WashingMachine {
static String brandName = "Samsung";
static double price = 15000;
static String color = "Red";
static boolean isConnected;
static int maxLevel = 5;
static int currentLevel;
static int minLevel;

public static void main(String a[]) {
System.out.println("The BrandName is : "+brandName);
System.out.println("The Price is : "+price);
System.out.println("The Color is : "+color);
onOrOff();
increaseLevel();
increaseLevel();
increaseLevel();
increaseLevel();
increaseLevel();
increaseLevel();
decreaseLevel();
decreaseLevel();
decreaseLevel();
decreaseLevel();
decreaseLevel();
decreaseLevel();
onOrOff(); 
}

public static void onOrOff() {
System.out.println("The Invoking onOrOff()");

if(isConnected == false) {
	isConnected = true;
System.out.println("The WashingMachine is on...Available to Connect");
}
	
else if (isConnected == true) {
	isConnected = false;
System.out.println("The WashingMachine is off...");
}
}

public static void increaseLevel() {
	System.out.println("Increase Level Method is Started");
	if (isConnected == true) {
		System.out.println("WashingMachine is turned onn");
		if (currentLevel < maxLevel) {
			currentLevel = currentLevel + 1;
			System.out.println("The Current Level is : " +currentLevel);
		}
		else {
			System.out.println("Max Level Reached");
		}
	    }
		else {
			System.out.println("WashingMachine On Madu");
		}
		System.out.println("Increase Level Method is Ended");
	   }
	   
public static void decreaseLevel() {
	System.out.println("Decrease Level Method is Started");
	if (isConnected == true) {
		System.out.println("WashingMachine is turned onn");
		if (currentLevel > minLevel) {
			currentLevel = currentLevel - 1;
			System.out.println("The Current Level is : " +currentLevel);
		}
		else {
			System.out.println("Min Level Reached");
		}
	    }
	   else {
	   System.out.println("WashingMachine On Madu");
	   }
	   System.out.println("Decrease Level Method is Ended");
}
}
