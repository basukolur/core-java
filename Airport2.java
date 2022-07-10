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
}