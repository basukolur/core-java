public class OximeterDTO{
	public OximeterDTO(){
	}
  private String method;
  private String type;
  private int developedIn;
  private String origin;

     public String getMethod(){
	  return method;
     }
     public void setMethod(String method){ 
	   this.method=method;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public int getDevelopedIn(){
		 return developedIn;
	 }
	 public void setDevelopedIn(int developedIn){
		 this.developedIn=developedIn;
	 }
	 
	 public String getOrigin(){
		 return origin;
	 }
	 public void setOrigin(String origin){
		 this.origin=origin;
	 }
}