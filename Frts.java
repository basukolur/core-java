class Frts {
  String name;
  int price;

public Frts(){
	this.provideNutrition();
	System.out.println("Fruits Object is Created");
}
public Frts(String name, int price){
	this();
	this.name = name;
    this.price = price;
}
public void provideNutrition() {
	System.out.println("Help Us to Get Nutrition");
}

public static void main(String a[]){
    Frts f = new Frts("Mango",789);
    System.out.println(f.name +" "+f.price);
}
}