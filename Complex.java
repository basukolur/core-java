class Complex {

String name;
int shops;

  public Complex() {
	   this("Paradise", 10);
       System.out.println("Complex Object is Created");
  }  
  public Complex(String name, int shops){
       this.name = name;
       this.shops = shops;
  }
  public static void main(String a[]) {
  Complex comp = new Complex();
  System.out.println(comp.name +"  "+comp.shops);
  }
}
