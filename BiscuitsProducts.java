class BiscuitsProducts {
   static String biscuits[] = {"Parle","Britania","GoodDay","MarieGold","Treat","DarkFantasy","BourBon"};
   
   public static void main(String a[]){
 
   String value = getBiscuit("Parle");
   System.out.println("Come...will eat " +value);
   }
   
   public static String getBiscuit(String biscuit) {
	   String biscuitName = null;
   for(int i=0; i<biscuits.length; i++) {
	   
	   if(biscuits[i] == biscuit) {
		   biscuitName = biscuits[i];
	   }
       }
     return biscuitName;
   }
}