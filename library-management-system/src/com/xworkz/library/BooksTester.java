package com.xworkz.library;

import java.util.Scanner;

import com.xworkz.library.crud.LibraryInf;
import com.xworkz.library.crud.impl.LibraryImpl;
import com.xworkz.library.dto.BooksDTO;

public class BooksTester {
	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("The Number of Books");
		int size = sc.nextInt();

		LibraryInf lib = new LibraryImpl(size);
		for (int i = 0; i < size; i++) {

			BooksDTO book = new BooksDTO();
			System.out.println("Enter the id ");
			int id = sc.nextInt();
			System.out.println("Enter The Name Of Book");
			String name = sc.next();
			System.out.println("Enter the Author");
			String author = sc.next();
			System.out.println("Enter the publication");
			String publication = sc.next();
			System.out.println("Enter the type of Book");
			String type = sc.next();

			book.setId(id);
			book.setName(name);
			book.setAuthor(author);
			book.setPublication(publication);
			book.setType(type);

			lib.createBook(book);

		}

		String option = null;
		do {
			System.out.println("Enter 1 for all Books details");
			System.out.println("Enter 2 for update publication by name");
			System.out.println("Enter 3 for delete books by name");
			System.out.println("Enter 4 for delete books by author");
			System.out.println("Enter 5 for get book name by id");
			System.out.println("Enter 6 for get all books name");

			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				lib.getBookDetails();
				break;

			case 2:
				System.out.println("Enter the existing Name to update the publication");
				String existingName = sc.next();
				System.out.println("Enter publication to update");
				String updatePublication = sc.next();
				lib.updatePublicationByName(existingName, updatePublication);
				break;

			case 3:
				System.out.println("Enter the name to be deleted");
				String name1 = sc.next();
				lib.deleteByName(name1);
				break;

			case 4:
				System.out.println("enter the author to be deleted");
				String author1 = sc.next();
				lib.deleteByAuthor(author1);
				break;

			case 5:
				System.out.println("Enter the id to get the name");
				int id1 = sc.nextInt();
				System.out.println(lib.getBookNameById(id1));
				break;

			case 6:
				lib.getAllBooksName();
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}

			System.out.println("Do you want to continue Y/N");
			option = sc.next();
		} while (option.equalsIgnoreCase("Y"));
		sc.close();
	}

}
