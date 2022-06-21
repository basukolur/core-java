class Vegetables {
   static String vegetables[] = {"Carrot","Beans","Chilli","Potato","Tomato","Cabbage","Peas"};
   
   public static void main(String a[]){
 
   String value = getVegetable("Potato");
   System.out.println("Come...will eat " +value);
   }
   
   public static String getVegetable(String vegetable) {
	   String vegetableName = null;
   for(int i=0; i<vegetables.length; i++) {
	   
	   if(vegetables[i] == vegetable) {
		   vegetableName = vegetables[i];
	   }
       }
     return vegetableName;
   }
}
