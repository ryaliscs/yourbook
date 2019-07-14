package org.mybook.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.mybook.server.entity.BOBook;
import org.mybook.server.entity.BOPerson;

public class Repository {
	public static final List<BOBook> BOOK_REPOSITORY;

	static {
		List<BOBook> books = new ArrayList<>();
		BOPerson person1 = createPerson("001", "sarat", "ryali", "sarat.test.com", "23456");
		BOPerson person2 = createPerson("002", "surya", "Kocharlakota", "surya.test.com", "45666");

		books.add(createBook("b001", "java1", "xyz1", person1));
		books.add(createBook("b002", "java2", "xyz2", person1));
		books.add(createBook("b003", "java3", "xyz2", person2));
		books.add(createBook("b004", "java4", "xyz4", person1));
		books.add(createBook("b005", "java5", "xyz", person2));
		books.add(createBook("b006", "java6", "xyz", person1));
		books.add(createBook("b007", "java7", "xyz2", person2));
		BOOK_REPOSITORY = Collections.unmodifiableList(books);

	}

	private static BOBook createBook(String code, String title, String author, BOPerson owner) {
		BOBook book = new BOBook();
		book.setPk(getPK());
		book.setCode(code);
		book.setAuthor(author);
		book.setOwner(owner);
		book.setExpired(false);
		return book;
	}

	private static BOPerson createPerson(String code, String fName, String lName, String email, String phone) {
		int n = getPK();

		BOPerson person = new BOPerson();
		person.setPk(n);
		person.setCode(code);
		person.setFirstName(fName);
		person.setLastName(lName);
		person.setEmail(email);
		person.setPhone(phone);
		return person;
	}

	private static int getPK() {
		Random rand = new Random();
		int n = rand.nextInt(50);
		return n;
	}

}
