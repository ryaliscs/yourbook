package org.mybook.client;

import java.util.List;

import org.mybook.server.client.dto.BookDTO;
import org.mybook.server.entity.BOBook;

public class SimpleClientServer {

	public static void main(String[] args) {

		Resource resource = new Resource();
		List<BookDTO> allBooks = resource.getAllBooks("001");
		for (BookDTO bookDTO : allBooks) {
			System.out.println(bookDTO);
		}

		System.out.println("Books by Xyz2");
		List<BookDTO> bookByAuthor = resource.getBookByAuthor("xyz2");
		for (BookDTO bookDTO : bookByAuthor) {
			System.out.println(bookDTO);
		}
	}

}
