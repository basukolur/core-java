class RumTester{

public static void main (String a[]) {

OldMonk old = new OldMonk();
old.price = 440.00;
old.alcoholContent = "42.8%";
old.quantity = "750ml";
old.mfgDate = "2 April 2022";
old.expiry = "Best Before 36 Months";

System.out.println(old.price +" "+old.alcoholContent+" "+old.quantity
          +" "+old.mfgDate+" "+old.expiry); 
}
}