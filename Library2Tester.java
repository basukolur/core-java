import java.util.Scanner;

class Library2Tester {
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Books To be added : ");
		int size = scan.nextInt();
		
		Library2 lib = new Library2(size);
		for(int i=0; i<size; i++){
			System.out.println("Enter the Book ID : ");
			int id = scan.nextInt();
			
			System.out.println("Enter the Book Name : ");
			String name = scan.next();
			
			System.out.println("Enter the Book Author : ");
			String author = scan.next();
			
			System.out.println("Enter the Book Publisher : ");
			String publisher = scan.next();
			
			System.out.println("Enter the Book Language");
			String language = scan.next();
			
			BookDTO dto = new BookDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setAuthor(author);
			dto.setPublisher(publisher);
			dto.setLanguage(language);
			lib.createBook(dto);
		}
		
		String option = null;
		do{
			System.out.println("Enter 1 fetch all the Books ");
			System.out.println("Enter 2 to update the Books Language by Id ");
			System.out.println("Enter 3 to update Books Author by name ");
			System.out.println("Enter 4 to delete Books by name ");
			System.out.println("Enter the Choise ");
			int choise = scan.nextInt();
			
			switch(choise){
				case 1 : lib.getBookDetails();
				break;
				
				case 2 : System.out.println("Enter the Existing id for language has to be");
			            int existingId = scan.nextInt();
			            System.out.println("Enter the Language to be Updated");
			            String updatedLanguage = scan.next();
			            lib.updateBookLanguageById(existingId,updatedLanguage);
						break;
						
				case 3 : System.out.println("Enter the Existing name for Author has to be");
			            String existingName = scan.next();
			            System.out.println("Enter the Author to be Updated");
			            String updatedAuthor = scan.next();
			            lib.updateBookAuthorByName(existingName , updatedAuthor);
                        break;

                case 4 : System.out.println("Enter the Existing Name for delete Book");
			            String name = scan.next();
		                lib.deleteBookByName(name);
                        break;
                default : System.out.println("Given choise cannot be delivered");
                        break;					
			}
			System.out.println("Do you want to continue y/n ");
			option = scan.next();
		}
		while(option.equals("y"));
	}
}