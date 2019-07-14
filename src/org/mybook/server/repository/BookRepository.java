package org.mybook.server.repository;

import java.util.ArrayList;
import java.util.List;

import org.mybook.repository.Repository;
import org.mybook.server.client.dto.BookDTO;
import org.mybook.server.client.dto.PersonDTO;
import org.mybook.server.entity.BOBook;
import org.mybook.server.entity.BOPerson;

public class BookRepository {

	public List<BookDTO> getAllBooks(PersonDTO person) {

		List<BOBook> bookRepository = Repository.BOOK_REPOSITORY;
		List<BookDTO> myBooks = new ArrayList<>();
		for (BOBook book : bookRepository) {
			if (person.getCode().equals(book.getOwner().getCode())) {
				BookDTO bookDTO = convertToBookDTO(book);
				myBooks.add(bookDTO);
			}
		}
		return myBooks;
	}

	public List<BookDTO> getBookByAuthor(String author) {

		List<BOBook> bookRepository = Repository.BOOK_REPOSITORY;
		List<BookDTO> authorBooks = new ArrayList<>();
		for (BOBook book : bookRepository) {
			if (author.equals(book.getAuthor())) {

				authorBooks.add(convertToBookDTO(book));
			}
		}
		return authorBooks;
	}

	private BookDTO convertToBookDTO(BOBook book) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setCode(book.getCode());
		bookDTO.setAuthor(book.getAuthor());
		bookDTO.setExpired(book.isExpired());
		PersonDTO personDTO = new PersonDTO();
		personDTO.setCode(book.getOwner().getCode());
		personDTO.setName(book.getOwner().getFirstName() + " " + book.getOwner().getLastName());
		bookDTO.setOwner(personDTO);
		bookDTO.setTitle(book.getTitle());
		return bookDTO;
	}

}
