package com.baeldung.boot.jsp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
	
	private String isbn;
    private String name;
    private String author;
    
//    public Book(String isbn, String name, String author) {
//		this.isbn= isbn;
//		this.name = name;
//		this.author = author;
//	}
//	public Book() {}
//	/**
//	 * @return the isbn
//	 */
//	public String getIsbn() {
//		return isbn;
//	}
//	/**
//	 * @param isbn the isbn to set
//	 */
//	public void setIsbn(String isbn) {
//		this.isbn = isbn;
//	}
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//	/**
//	 * @return the author
//	 */
//	public String getAuthor() {
//		return author;
//	}
//	/**
//	 * @param author the author to set
//	 */
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	
	
}