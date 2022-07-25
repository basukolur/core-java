package com.xworkz.library.crud;

import com.xworkz.library.dto.BooksDTO;

public interface LibraryInf {
	public boolean createBook(BooksDTO book);

	public void getBookDetails();

	public boolean updatePublicationByName(String name, String publication);

	public boolean deleteByName(String name);

	public boolean deleteByAuthor(String author);

	public String getBookNameById(int id);

	public String[] getAllBooksName();

}
