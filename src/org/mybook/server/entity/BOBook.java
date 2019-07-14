package org.mybook.server.entity;

public class BOBook {

	private int pk;
	private String code;
	private String title;
	private String Author;
	private BOPerson owner;
	private boolean isExpired;

	/**
	 * @return the pk
	 */
	public int getPk() {
		return pk;
	}

	/**
	 * @param pk
	 *            the pk to set
	 */
	public void setPk(int pk) {
		this.pk = pk;
	}

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
	public BOPerson getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(BOPerson owner) {
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

}
