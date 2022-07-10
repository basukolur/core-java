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
	}
}	