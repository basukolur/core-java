import java.util.Arrays;

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
	
	public boolean updateBookLanguageById(int id, String language){
		System.out.println("Inside Update Book Language by Id");
		boolean updateLanguage = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId() == id){
				dtos[i].setLanguage(language);
				updateLanguage = true;
				System.out.println("Updated Successfully");
			}
			else{
				System.out.println("Book Id Not Matching");
			}
		}
		return updateLanguage;
	}
	public boolean updateBookAuthorByName(String name , String author){
		  System.out.println("inside update Book Author By Name");
		  boolean updateAuthor=false;
		for(int i=0; i<dtos.length;i++){
		    if(dtos[i].getName().equals(name)){
			  dtos[i].setAuthor(author);
			  updateAuthor = true;
		    }
		    else{
			  System.out.println("Name is not matching");
		    }
		}
		 return updateAuthor;
	}
	public boolean deleteBookByName(String name){
			System.out.println("Inside Delete Book by Name");
			boolean bookDeleted = false;
			int i,j;
		for(i=0,j=0; j<dtos.length; j++){
			if(!dtos[j].getName().equals(name)){
				dtos[i++] = dtos[j];
			    bookDeleted = true;
				System.out.println("Book Deleted Successfully");
			}
			else{
				System.out.println("Name is not Matching");
			}
		}
			dtos = Arrays.copyOf(dtos,i);
			return bookDeleted;
	}
}