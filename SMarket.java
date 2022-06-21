class SMarket {
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
	
	getBiscuits();
	getVegetables();
	getSportsProducts();
	getGrocerries();
	getSoaps();
	getDetergents();
	getCoolDrinks();
	getDeos();
	getHomeApplieances();
	getSnacks();
	getFruits();
	getGiftItems();
	getChocolates();
}
   public static void getBiscuits() {  
System.out.println("Lists of Biscuits : ");
	for(int i=0; i<biscuits.length; i++) {
System.out.println(biscuits[i]);
	}
   }
   public static void getVegetables() { 
System.out.println("Lists of Vegetables : ");
    for(int i=0; i<vegetables.length; i++){
System.out.println(vegetables[i]);
	}
   }
    public static void getSportsProducts() { 
System.out.println("Lists of Sports Products : ");
    for(int i=0; i<sportsProducts.length; i++) {
System.out.println(sportsProducts[i]);
	}
	}
	public static void getGrocerries() { 
System.out.println("Lists of Grocerries : ");
    for(int i=0; i<grocerries.length; i++) {
System.out.println(grocerries[i]);
    }
	}
	public static void getSoaps() { 
System.out.println("Lists of Soaps : ");
	for(int i=0; i<soaps.length; i++) {
System.out.println(soaps[i]);
	}
	}
	public static void getDetergents() { 
System.out.println("Lists of Detergents : ");
	for(int i=0; i<detergents.length; i++) {
System.out.println(detergents[i]);
	} 
	}
	public static void getCoolDrinks() { 
System.out.println("Lists of Cool Drinks : ");
	for(int i=0; i<coolDrinks.length; i++) {
System.out.println(coolDrinks[i]);
    } 
	}
	public static void getDeos() { 
System.out.println("Lists of Deos : ");	
     for(int i=0; i<deos.length; i++) {
System.out.println(deos[i]);
    }
	}
	public static void getHomeApplieances() { 
System.out.println("Lists of Home Applieances : ");
     for(int i=0; i<homeApplieances.length; i++) {	
System.out.println(homeApplieances[i]);
	 }
	 }
	 public static void getSnacks() { 
System.out.println("Lists of Snacks : ");
     for(int i=0; i<snacks.length; i++) {
System.out.println(snacks[i]);
     }
	 }
	 public static void getFruits() { 
System.out.println("Lists of Fruits : ");
     for(int i=0; i<fruits.length; i++) {
System.out.println(fruits[i]); 
     }
	 }
	 public static void getGiftItems() { 
System.out.println("Lists of Gift Items : ");
     for(int i=0; i<giftItems.length; i++) {
System.out.println(giftItems[i]);
     }
	 }
	 public static void getChocolates() { 
System.out.println("Lists of Chocolates : ");
     for(int i=0; i<chocolates.length; i++) {
System.out.println(chocolates[i]);
     }
	 } 
	 }
   
 