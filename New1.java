class New1 { 
public static void main(String a[]){
  
  int addWithTwoNumbers = add(56,56);
  System.out.println(addWithTwoNumbers);
  
  int addWithThreeNumbers = add(56,56,76);
  System.out.println(addWithThreeNumbers);
}
 
  public static int add(int a,int b) {
	  return a+b;
  }
  
  public static int add(int a,int b,int c) {
	  return a+b+c;
  }
}

