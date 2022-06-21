class Factorial1 {
public static void main (String a [] ) {
  int factValue = fact(5);
  System.out.println(factValue);
  
  //int npr = fact(n) / fact (n-r);
  int npr = fact(5) / fact (5-3);
  System.out.println(npr);
  
  //int ncr = fact(n) / (fact(n) * fact(n-r));
  int ncr = fact(5) / (fact(2) * fact(5-2));
    System.out.println(ncr);
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
