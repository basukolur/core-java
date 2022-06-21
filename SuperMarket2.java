class SuperMarket2{

   static String biscuits[] =

   {"Hide&Seek","Dark Fantasy","Parle G","Mom's Magic","Oreo","Good Day"};

 static String deos[] ={"Fogg","Wild Stone","Yardley","Axe","Denver","Park Avenue"};

   public static void main(String a[]){
	   
	   getBiscuits();
       getDeos();
   
   }

     public static void getBiscuits(){
			  
   System.out.println("List of Biscuits");
    System.out.println("========================");
    for(int i=0; i <= biscuits.length-1; i++){
	System.out.println(biscuits[i]);
	
	}
	 }
	 
	 public static void getDeos(){	 
		 
	System.out.println("List of Deos");
	System.out.println("========================");
	 for(int i=0; i < deos.length;i++){
	   System.out.println(deos[i])
	}
	 }
}