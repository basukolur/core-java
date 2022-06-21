class Moviehub {
   static String movies[] = {"Charlie 777", "Vikram", "Bhool Bjulayya 2", "Prithviraj", "KGF 2"};
   
   public static void main(String a[]){
 
   String value = getMovie("Charlie 777");
   System.out.println("Come...will watch " +value);
   }
   
   public static String getMovie(String movie) {
	   String movieName = null;
   for(int i=0; i<movies.length; i++) {
	   
	   if(movies[i] == movie) {
		   movieName = movies[i];
	   }
       }
     return movieName;
   }
}
