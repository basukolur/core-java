class SMarketPro {
static String biscuits[]={"Parle","Britania","GoodDay","MarieGold","Treat","DarkFantasy","BourBon"};
static String vegetables[]={"Carrot","Beans","Chilli","Potato","Tomato","Cabbage","Peas"};
static String sportsProducts[]={"Bat","Ball","Nets","Sticks","Racquets","Shoes","Pad"};
static String grocerries[]={"Rice","Wheat","Oil","SkinCare","Soaps","Nooddles","Oats"};
static String soaps[]={"Dove","RaktaChandan","Pears","Himalayan","Medimix","Lifebuoy","Santoor"};
static String detergents[]={"Wheel","Rin","Ghadi","SurfExcel","Tide","Ariel","Gain"};
static String coolDrinks[]={"Pepsi","Sprite","Maaza","Dew","Fanta","Frooti","Coke"};
static String deos[]={"Eva","Fogg","KS","Nivea","WildStone","ParkAvenue","Axe"};
static String homeApplieances[]={"Refrigerator","Oven","Iron","Mixer","Fan","Lamp","TV"};
static String snacks[]={"PeaNuts","PotatoChips","BananaChips","SoyaSticks","MoongDal","Tofo","Kurkure"};
static String fruits[]={"Apple","Banana","Pomegranate","Mango","Papaya","Cherry","Orange"};
static String giftItems[]={"PhotoFrame","Pen","Locket","Doll","Bracelet","Teddy","Chain"};
static String chocolates[]={"Dairymilk","KitKat","Kissme","Perk","Munch","Snickers","Eclairs"};

public static void main(String a[]) {  
  String biscuitName = getBiscuit("Tiger");
   System.out.println("The Selected Biscuit is : " +biscuitName);
  String vegetableName = getVegetable("Potato");
   System.out.println("The Selected Vegetable is : " +vegetableName);
  String sportsProductName = getSportsProduct("Bat");
   System.out.println("The Selected SportsProduct is : " +sportsProductName);
   String groceryName = getGrocery("Rice");
   System.out.println("The Selected Grocery is : " +groceryName);
  String soapName = getSoap("Medimix");
   System.out.println("The Selected Soap is : " +soapName);
  String detergentName = getDetergent("Wheel");
   System.out.println("The Selected Detergent is : " +detergentName);
  String coolDrinkName = getCoolDrink("Dew");
   System.out.println("The Selected CoolDrink is : " +coolDrinkName);
  String deoName = getDeo("Fogg");
   System.out.println("The Selected Deo is : " +deoName);
  String homeApplieanceName = getHomeApplieance("Iron");
   System.out.println("The Selected Home Applieance is : " +homeApplieanceName);
  String snackName = getSnack("PeaNuts");
   System.out.println("The Selected Snack is : " +snackName);
  String fruitName = getFruit("Mango");
   System.out.println("The Selected Fruit is : " +fruitName);
  String giftItemName = getGiftItem("Pen");
   System.out.println("The Selected GiftItem is : " +giftItemName);
  String chocolateName = getChocolate("Kissme");
   System.out.println("The Selected Chocolate is : " +chocolateName);
   }
   
   public static String getBiscuit(String biscuit) {
	 String biscuitName = null;
   for(int i=0; i<biscuits.length; i++) {
	   
	   if(biscuits[i] == biscuit) {
		   biscuitName = biscuits[i];
	   } 
      else {
		   System.out.println(biscuit + " is not Available in Array.");
		   }	   
       }
     return biscuitName;
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
   
    public static String getSportsProduct(String sportsProduct) {
	 String sportsProductName = null;
   for(int i=0; i<sportsProducts.length; i++) {
	   
	   if(sportsProducts[i] == sportsProduct) {
		   sportsProductName = sportsProducts[i];
	   }
       }
     return sportsProductName;
   }
   
    public static String getGrocery(String grocery) {
	   String groceryName = null; 
   for(int i=0; i<grocerries.length; i++) {
	   
	   if(grocerries[i] == grocery) {
		   groceryName = grocerries[i];
	   }
       }
     return groceryName;
   }
   
   public static String getSoap(String soap) {
	 String soapName = null;  
   for(int i=0; i<soaps.length; i++) {
	   
	   if(soaps[i] == soap) {
		   soapName = soaps[i];
	   }
       }
     return soapName;
   }
   
   public static String getDetergent(String detergent) {
	  String detergentName = null;
   for(int i=0; i<detergents.length; i++) {
	   
	   if(detergents[i] == detergent) {
		   detergentName = detergents[i];
	   }
       }
     return detergentName;
   }
   
   public static String getCoolDrink(String coolDrink) {
	   String coolDrinkName = null;
   for(int i=0; i<coolDrinks.length; i++) {
	   
	   if(coolDrinks[i] == coolDrink) {
		   coolDrinkName = coolDrinks[i];
	   }
       }
     return coolDrinkName;
   }
   
   public static String getDeo(String deo) {
     String deoName = null;
   for(int i=0; i<deos.length; i++) {
	   
	   if(deos[i] == deo) {
		   deoName = deos[i];
	   }
       }
     return deoName;
   }
   
   public static String getHomeApplieance(String homeApplieance) {
	String homeApplieanceName = null;
   for(int i=0; i<homeApplieances.length; i++) {
	   
	   if(homeApplieances[i] == homeApplieance) {
		   homeApplieanceName = homeApplieances[i];
	   }
       }
     return homeApplieanceName;
   }
   
   public static String getSnack(String snack) {
	 String snackName = null;
   for(int i=0; i<snacks.length; i++) {
	   
	   if(snacks[i] == snack) {
		   snackName = snacks[i];
	   }
       }
     return snackName;
   }
   
   public static String getFruit(String fruit) {
	 String fruitName = null;
   for(int i=0; i<fruits.length; i++) {
	   
	   if(fruits[i] == fruit) {
		   fruitName = fruits[i];
	   }
       }
     return fruitName;
   }
   
   public static String getGiftItem(String giftItem) {
	String giftItemName = null;
   for(int i=0; i<giftItems.length; i++) {
	   
	   if(giftItems[i] == giftItem) {
		   giftItemName = giftItems[i];
	   }
       }
     return giftItemName;
   }
   
   public static String getChocolate(String chocolate) {
     String chocolateName = null;
   for(int i=0; i<chocolates.length; i++) {
	   
	   if(chocolates[i] == chocolate) {
		   chocolateName = chocolates[i];
	   }
       }
     return chocolateName;
   }
 }
   
   
   
   
   
   