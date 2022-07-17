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
		lib.getBookDetails();
		
		//invoking update Language By Id method
			System.out.println("Enter the Existing id for language has to be");
			int existingId = scan.nextInt();
			System.out.println("Enter the Language to be Updated");
			String updatedLanguage = scan.next();
			lib.updateBookLanguageById(existingId,updatedLanguage);
		    lib.getBookDetails();
			
		//invoking update Author By name method	
			System.out.println("Enter the Existing name for Author has to be");
			String existingName = scan.next();
			System.out.println("Enter the Author to be Updated");
			String updatedAuthor = scan.next();
			lib.updateBookAuthorByName(existingName , updatedAuthor);
			lib.getBookDetails();
			
		//invoking delete order by name method
			System.out.println("Enter the Existing Name for delete Book");
			String name = scan.next();
		    lib.deleteBookByName(name);
			lib.getBookDetails();
	}
}