class New3Mul { 
public static void main(String a[]){
  
  int mulWithTwoNumbers = mul(56,30);
  System.out.println(mulWithTwoNumbers);
  
  int mulWithThreeNumbers = mul(56,30,25);
  System.out.println(mulWithThreeNumbers);
}
 
  public static int mul(int a,int b) {
	  return a*b;
  }
  
  public static int mul(int a,int b,int c) {
	  return a*b*c;
  }
}