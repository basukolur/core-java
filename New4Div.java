class New4Div { 
public static void main(String a[]){
  
  int divWithTwoNumbers = div(100,5);
  System.out.println(divWithTwoNumbers);
  
  int divWithThreeNumbers = div(100,5,2);
  System.out.println(divWithThreeNumbers);
}
 
  public static int div(int a,int b) {
	  return a/b;
  }
  
  public static int div(int a,int b,int c) {
	  return a/b/c;
  }
}