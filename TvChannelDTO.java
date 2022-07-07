public class TvChannelDTO{
	public TvChannelDTO(){
	}
  private String channelName;
  private String type;
  private double startedIn;
  private String language;

     public String getChannelName(){
	  return channelName;
     }
     public void setChannelName(String channelName){ 
	   this.channelName=channelName;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public double getStartedIn(){
		 return startedIn;
	 }
	 public void setStartedIn(double startedIn){
		 this.startedIn=startedIn;
	 }
	 
	 public String getLanguage(){
		 return language;
	 }
	 public void setLanguage(String language){
		 this.language=language;
	 }
}