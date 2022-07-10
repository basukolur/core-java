class Library2 {
	BookDTO[] dtos;                 //has many patients
	int index;                  	//Instance variable
	public Library2(int size){
		dtos = new BookDTO[size];
		System.out.println("Library Constructor is Called");
	}
	public boolean createBook(BookDTO dto){
		System.out.println("Inside Create Book");
		boolean isAdded = false;
		if(dto != null && dto.getName() != null){
			this.dtos[index++] = dto;
			isAdded = true;  
			System.out.println("Book Added Successful");
		}
		else{
			System.out.println("Cannot add Book");
		}
		return isAdded;
	}
	public void getBookDetails(){
		System.out.println("Inside Get Book Details ");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAuthor()
			                    +" "+dtos[i].getPublisher()+" "+dtos[i].getLanguage());
		}
	}
}