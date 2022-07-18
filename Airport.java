import java.util.Arrays;
class Airport{


    TerminalDTO[] terminals ;
	int index;
	
	public Airport(int size){
	  terminals = new TerminalDTO[size];
      System.out.println("The Airport constructor is created");	  
	
	}
	public boolean createTerminal(TerminalDTO terminal){
	
	
	    System.out.println("Inside the createTerminal()");
		boolean isAdded = false;
		
		if(terminal != null && terminal.getId() != 0) {
		    
			this.terminals[index++] = terminal;
			isAdded = true;
			System.out.println("The terminals detail are saved");
		} else {
		   System.out.println("The terminals are not saved");
		
		}
	       System.out.println("the createTerminal() is ended");
	   return isAdded;
	}
	
	public void getTerminalDetails(){
	
	     
		 for(int i=0; i<terminals.length; i++){
		    
			  System.out.println(terminals[i]);
		 
		 }
	     
	}
	
	 public boolean updateLoadingBridgeById(int id, int noOfLoadingBridges){
		 
		 System.out.println("Inside updateLoadingBridgeById ");
		 boolean updateNoOfLoadingBridge = false;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getId() == id ){
				 terminals[i].setNoOfLoadingBridges(noOfLoadingBridges);
				 updateNoOfLoadingBridge = true;
				 
			 }
			 else{
				 System.out.println("The terminal id is not found");
			 }
		 }
		 return updateNoOfLoadingBridge;
	 }
	 
	 public boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters){
		 
		 System.out.println("Inside updatePatientContactNoByName ");
		 boolean updateCheckInCounters = false;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getName().equals(name)){
				 terminals[i].setNoOfCheckinCounters(noOfCheckIncounters);
				 updateCheckInCounters = true;
				 
			 }
			 else{
				 System.out.println("The terminal name is not found");
			 }
		 }
		 return updateCheckInCounters;
	 }
	 
	 public boolean deleteTerminalsByName(String name){
		 System.out.println("inside deleteTerminalsByName");
		 boolean terminalDeleted = false;
		 int i,j;
		 for(i=0,j=0; j<terminals.length;j++){
			 if(!terminals[j].getName().equals(name)){
				 terminals[i++]=terminals[j];
				 terminalDeleted=true;
			 }
			 else{
				 System.out.println("The terminal is not found");
			 }
		 }
		 terminals = Arrays.copyOf(terminals, i);
		 return terminalDeleted;
		 
	 }
	 
	 public boolean deleteTerminalsById(int id){
		 System.out.println("Inside deleteTerminalsById");
		 boolean terminalDeleted=false;
		 int i,j;
		 for(i=0,j=0;j<terminals.length;j++){
			 if(terminals[j].getId()!=id){
				 terminals[i++]=terminals[j];
				 terminalDeleted=true;
			 }
			 else{
				 System.out.println("the termial id not found");
			 }
		 }
		 terminals = Arrays.copyOf(terminals, i);
		 return terminalDeleted;
	 }
	 
	 public String[] getAllTerminalName(){
		 System.out.println("Inside getAllTerminalName()");
		 int i,j;
		 for( j=0,i=0;i<terminals.length;i++){ 
		     System.out.println(terminals[i].getName());
			  j++;
		 }
		    
		    String[] allTerminalNames = new String[j];
		  for(int k=0,m=0;k<terminals.length;k++){
			 allTerminalNames[m++] = terminals[k].getName(); 
		  }

		 return allTerminalNames;
	 }
	 
	 public String getTerminalNameById(int id){
		 System.out.println("Inside getTerminalNameById()");
		 String terminalName = null;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getId()==id){
				 terminalName = terminals[i].getName();
			 }
			 else{
				 System.out.println("The Terminal id not matched");
			 }
			 
		 }
		 return terminalName;
	 }
	 




}