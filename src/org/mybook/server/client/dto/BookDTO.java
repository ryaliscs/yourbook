package org.mybook.server.client.dto;

import org.mybook.server.entity.BOPerson;

public class BookDTO {

	private String code;
	private String title;
	private String Author;
	private PersonDTO owner;
	private boolean isExpired;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		Author = author;
	}

	/**
	 * @return the owner
	 */
	public PersonDTO getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(PersonDTO owner) {
		this.owner = owner;
	}

	/**
	 * @return the isExpired
	 */
	public boolean isExpired() {
		return isExpired;
	}

	/**
	 * @param isExpired
	 *            the isExpired to set
	 */
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	@Override
	public String toString() {
		return this.code + ", " + this.owner + ", " + this.title + ", " + this.Author;
	}
}
