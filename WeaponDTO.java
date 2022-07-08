public class WeaponDTO{
	public WeaponDTO(){
	}
  private String name;
  private String type;
  private double range;
  private String origin;

     public String getName(){
	  return name;
     }
     public void setName(String name){ 
	   this.name=name;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public double getRange(){
		 return range;
	 }
	 public void setRange(double range){
		 this.range=range;
	 }
	 
	 public String getOrigin(){
		 return origin;
	 }
	 public void setOrigin(String origin){
		 this.origin=origin;
	 }
}