class Factorial {
public static void main (String a [] ) {
  int factValue = fact(5);
  System.out.println(factValue);
}
public static int fact (int factNumber) {
	System.out.println("Invoked Fact()");
	System.out.println("Parameter Value " +factNumber);
        int f = 1;
   for(int i =1 ; i<= factNumber ; i++) {
      f = f * i ;
   }
   System.out.println("End of Fact()");
    return  f;
   }
}



