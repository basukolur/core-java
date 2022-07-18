public class TerminalDTO {

     private int id;
	 private String name;
	 private int noOfLoadingBridges;
	 private int noOfDepartureGates;
	 private int noOfCheckIncounters;
	 
	 public TerminalDTO(){
	   
	 }
	 
	 public int getId(){
	    return id;
	 }
	 public void setId(int id){
	    this.id = id;
	 }
	 
	 public String getName(){
	    return name;
	 }
	 public void setName(String name){
	    this.name = name;
	 }
	 public int getNoOfLoadingBridges(){
	    return noOfLoadingBridges;
	 }
	 public void setNoOfLoadingBridges(int noOfLoadingBridges){
	    this.noOfLoadingBridges = noOfLoadingBridges;
	 }
	 public int getNoOfDepartureGates(){
	    return noOfDepartureGates;
	 } 
	 public void setNoOfDepartureGates(int noOfDepartureGates){
	    this.noOfDepartureGates = noOfDepartureGates;
	 }
	 
	 public int getNoOfCheckinCounters(){
	    return noOfCheckIncounters;
	 } 
	 public void setNoOfCheckinCounters(int noOfCheckIncounters){
	    this.noOfCheckIncounters = noOfCheckIncounters;
	 }
	 
	 @Override
	 public String toString(){
		 return "[TerminalDTO : Id="+this.getId()+", Name="+this.getName()+", NoOfLoadingbridges= "+this.getNoOfLoadingBridges()+", NoOfDeparturegates= "+this.getNoOfDepartureGates()+", NoOfCheckinCounters="+this.getNoOfCheckinCounters()+"]";
	 }
	 
	 
	


}