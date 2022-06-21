class New2 { 
public static void main(String a[]){
  
  int subWithTwoNumbers = sub(65,39);
  System.out.println(subWithTwoNumbers);
  
  int subWithThreeNumbers = sub(65,39,11);
  System.out.println(subWithThreeNumbers);
}
 
  public static int sub(int a,int b) {
	  return a-b;
  }
  
  public static int sub(int a,int b,int c) {
	  return a-b-c;
  }
}