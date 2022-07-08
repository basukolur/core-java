public class GamesDTO{
	public GamesDTO(){
	}
  private String name;
  private String type;
  private int totalPlayers;
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
	 
	 public int getTotalPlayers(){
		 return totalPlayers;
	 }
	 public void setTotalPlayers(int totalPlayers){
		 this.totalPlayers=totalPlayers;
	 }
	 
	 public String getOrigin(){
		 return origin;
	 }
	 public void setOrigin(String origin){
		 this.origin=origin;
	 }
}