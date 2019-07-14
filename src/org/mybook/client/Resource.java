package org.mybook.client;

import java.util.List;

import org.mybook.server.client.dto.BookDTO;
import org.mybook.server.client.dto.PersonDTO;
import org.mybook.server.entity.BOBook;
import org.mybook.server.repository.BookRepository;

public class Resource {
	
	public List<BookDTO> getAllBooks(String aPersonCode)
	{
		PersonDTO personDTO = new PersonDTO();
		personDTO.setCode(aPersonCode);
		BookRepository bookRepository = new BookRepository();
		List<BookDTO> allBooks = bookRepository.getAllBooks(personDTO);
		
		return allBooks;
	}
	
	public List<BookDTO> getBookByAuthor(String author) {
		BookRepository bookRepository = new BookRepository();
		return bookRepository.getBookByAuthor(author);
	}

}
