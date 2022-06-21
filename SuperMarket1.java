class SuperMarket1{
   static String biscuts[] = {"Oreo", "Bourboun", "Parle G", "Hide & Seek", "Mom's Magaic","Good Day", "Dark Fantasy"};
   static String vegetables[] = {"Beans", "Tomato", "Potato", "Cocumber", "Lemon", "Zinger", "Mint", "Pudina"};
   static String deos[] = {"Fog", "Nivea", "Woldstone", "KS", "Park Avenue", "Denvier", "Setwet"};
   static String sportItems[] = {"Balls", "Bat", "gloves", "pad", "rockets", "guard", "Vollyball", "Football"};
   static String soaps[] = {"Dove", "Santoor", "Lifeboy", "Wildstone", "pears", "Mysore sandal", "Medimex", "Rin", "Wheel", "surfexcel"};
   static String coolDrinks[]  = {"Sprite", "MountainDew", "7Up", "Mazaa", "Slice", "Red bull", "sting"};
   static String fruits[] = {"gova", "Mangoes", "sapota", "apple", "water Melon", "Dragonfruit", "jackfruit"};
   static String chocolates[] = {"5Star", "Dairy milk", "Mily Bar", "Snikers", "Kitkat", "Munch", "Perk"};
   static String snacks[] = {"Moong Dal", "Lays", "Togz", "Cheetos", "Doritos", "Pringles", "Kurkure"};
   static String grocerries[] = {"Rice", "Peanunt", "ground Nut", "turmeric powder", "chicken masala", "Garam Masala", "Tea Powder"};
   static String homeAppliances[] = {"AC", "Refrigerator", "Fan", "Mixer", "Grinder", "TV", "Geaser"};
   static String biscutName;
   static String vegetableName;
   static String deoName;
   static String sportItemName;
   static String soapName;
   static String coolDrinkName;
   static String fruitName;
   static String chocolateName;
   static String snackName;
   static String grocerrieName;
   static String homeApplianceName;
   

public static void main(String a[])
{
  getBiscut("Dark Fantasy");
  System.out.println("the selected biscut is "+ biscutName);
  getVegetable("Lemon");
  System.out.println(" The selected vegetable is "+ vegetableName);
  getDeo("Setwet");
  System.out.println("The selected deo is "+ deoName);
  getSportItem("Football");
  System.out.println("The selected sport item is "+ sportItemName);
  getSoap("pears");
  System.out.println("The Selected soap is "+ soapName);
  getCoolDrink("Slice");
  System.out.println("The selected cool drink is "+ coolDrinkName);
  getFruit("apple");
  System.out.println("The selected fruit is "+ fruitName);
  getChocolate("Kitkat");
  System.out.println("The selected chocolate is "+ chocolateName);
  getSnack("Kurkure");
  System.out.println("The selected cool drink is "+ snackName);
  getGrocerrie("Tea Powder");
  System.out.println("The selected grocerrie is "+ grocerrieName);
  getHomeAppliance("Grinder");
  System.out.println("The selected Home Appliance is "+ homeApplianceName);
}

public static String getBiscut(String biscut)
{
  for(int i=0 ; i<biscuts.length; i++)
  {
    if(biscuts[i] == biscut)
	{
	   biscutName = biscuts[i];
	}
  }
  return biscutName;
}

public static String getVegetable(String vegetable)
{
	for(int i=0; i < vegetables.length; i++)
	{
		if(vegetables[i] == vegetable)
		{
			vegetableName = vegetables[i];
		}
	}
	return vegetableName;
}
   
   public static String getDeo(String deo)
   {
	   for(int i=0; i<deos.length;i++)
	   {
		   if(deos[i] == deo)
		   {
			   deoName = deos[i];
		   }
	   }
	   return deoName;
   }
   
   public static String getSportItem(String sportItem)
   {
	   for(int i=0; i<sportItems.length;i++){
		   if(sportItems[i] == sportItem){
			   sportItemName = sportItems[i];
		   }
	   }
	   return sportItemName;
   }

   public static String getSoap(String soap){
	   for(int i=0; i<soaps.length;i++){
		   if(soaps[i]==soap){
			   soapName = soaps[i];
		   }
	   }
	   return soapName;
   } 

   public static String getCoolDrink(String coolDrink){
	   for(int i=0;i<coolDrinks.length;i++){
		   if(coolDrinks[i]==coolDrink){
			   coolDrinkName = coolDrinks[i];
		   }
	   }
	   return coolDrinkName;
   } 

    public static String getFruit(String fruit){
		for(int i=0; i<fruits.length;i++){
			if(fruits[i] == fruit){
				fruitName = fruits[i];
			}
		}
		return fruitName;
	} 

    public static String getChocolate(String chocolate){
		for(int i=0; i<chocolates.length; i++){
			if(chocolates[i] == chocolate){
				chocolateName = chocolates[i];
			}
		}
		return chocolateName;
	}

    public static String getSnack(String snack){
		for(int i=0; i<snacks.length; i++)
		{
			if(snacks[i] == snack)
			{
				snackName = snacks[i];
			}
		}
		return snackName;
	}
  
    public static String getHomeAppliance(String homeAppliance){
		for(int i=0; i<homeAppliances.length;i++){
			if(homeAppliances[i] == homeAppliance){
				homeApplianceName = homeAppliances[i];
			}
		}
		return homeApplianceName;
	} 

     public static String getGrocerrie(String grocerrie){
		 for(int i=0;i<grocerries.length;i++){
			 if(grocerries[i] == grocerrie){
				 grocerrieName = grocerries[i];
			 }
		 }
		 return grocerrieName;
	 }	
}