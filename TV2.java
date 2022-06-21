class TV2 {
static String brandName = "Sony";
static double price = 30000;
static String color = "Black";
static boolean isConnected;
static int maxVolume = 5;
static int currentVolume;
static int minVolume;

public static void main(String a[]) {
System.out.println("The BrandName is : "+brandName);
System.out.println("The Price is : "+price);
System.out.println("The Color us : "+color);
onOrOff();
increaseVolume();
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
System.out.println("Invoking onOrOff() ");

if(isConnected == false) {
isConnected = true;
System.out.println("TV is Turned on...Available to Connect ");
}

else if(isConnected ==true){
isConnected = false;
System.out.println("TV is Turned Off... ");
}

}
public static void increaseVolume() {
System.out.println("Increase Volume Method Started");
	if(isConnected == true) {
System.out.println("The TV is turned onn");
	if ( currentVolume < maxVolume) {
		currentVolume = currentVolume + 1;
	System.out.println("The Current Volume is : "+currentVolume);
	}
	else {
		System.out.println("Max Volume Reached");
	}
	}
	else {
	System.out.println("TV on Madu");
	}
	System.out.println("Increase Volume Method Ended");
	}

public static void decreaseVolume() {
System.out.println("Decrease Volume Method Started");
    if (isConnected == true) {
	System.out.println("The TV is turned onn");
	if(currentVolume > minVolume) {
		currentVolume = currentVolume - 1;
		System.out.println("The Current Volume is : "+currentVolume);
	}
	else {
	System.out.println("Min Volume reached");
	}
    }	
    else {
	System.out.println("TV on Madu");
	}
	System.out.println("Decrease Volume method Ended");
}
}

