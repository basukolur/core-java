import java.util.Arrays;

class Airport2{
	TerminalDTO[] dtos;
	int index;
	public Airport2(int size){
		dtos=new TerminalDTO[size];
		System.out.println("Airport Constructor is Called");
	}
	
	public boolean createTerminal(TerminalDTO dto){
		System.out.println("Inside Airport Terminal ");
		boolean isAdded = false;
		
		if(dto!=null && dto.getName()!=null){
			this.dtos[index++]=dto;
			isAdded=true;
			System.out.println("Airport Terminal added Successfully");
		}
		else{
			System.out.println("Airport Terminal cannot added");
		}
		return isAdded;
	}
	public void getTerminalDetails(){
			System.out.println("Inside Get Terminal Details ");
			for(int i=0; i<dtos.length;i++){
					System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getNoOfTerminals()+" "+dtos[i].getPlace());
			}
	}
	
	public boolean updateNoOfTerminalsById(int id, int noOfTerminals){
		System.out.println("Inside Update No Of Terminals by Id");
		boolean updateNoOfTerminals = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId() == id){
				dtos[i].setNoOfTerminals(noOfTerminals);
				updateNoOfTerminals = true;
				System.out.println("Updated Successfully");
			}
			else{
				System.out.println("Id is Not Matching");
			}
		}
		return updateNoOfTerminals;
	}
	 public boolean updateTerminalsPlaceByName(String name , String place){
		  System.out.println("inside update Terminals Place By Name");
		  boolean updatePlace=false;
		  for(int i=0; i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			  dtos[i].setPlace(place);
			  updatePlace = true;
		  }
		  else{
			  System.out.println("Name is not matching");
		  }
		 }
		 return updatePlace;
	  }
	  public boolean deleteTerminalsByName(String name){
			System.out.println("Inside Delete Terminals by Name");
			boolean terminalsDeleted = false;
			int i,j;
			for(i=0,j=0; j<dtos.length; j++){
				if(!dtos[j].getName().equals(name)){
					dtos[i++] = dtos[j];
					terminalsDeleted = true;
					System.out.println("Terminals Deleted Successfully");
				}
				else{
					System.out.println("Name is not Matching");
				}
			}
			dtos = Arrays.copyOf(dtos,i);
			return terminalsDeleted;
		}
}