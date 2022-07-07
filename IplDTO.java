public class IplDTO{
	public IplDTO(){
	}
  private String gameOf;
  private String type;
  private String sponser;
  private String managedBy;
  private int teams;

     public String getGameOf(){
	  return gameOf;
     }
     public void setGameOf(String gameOf){ 
	   this.gameOf=gameOf;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public String getSponser(){
		 return sponser;
	 }
	 public void setSponser(String sponser){
		 this.sponser=sponser;
	 }
	 
	 public String getManagedBy(){
		 return managedBy;
	 }
	 public void setManagedBy(String managedBy){
		 this.managedBy=managedBy;
	 }
	 
	 public int getTeams(){
		 return teams;
	 }
	 public void setTeams(int teams){
		 this.teams=teams;
	 }
}