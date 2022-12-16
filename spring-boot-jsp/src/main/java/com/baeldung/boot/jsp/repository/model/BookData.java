package com.baeldung.boot.jsp.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table (name = "books")
public class BookData {
	@Id
	@Column (name = "bk_isbn")
	private String isbn;
	@Column(name = " bk_name")
	private String name;
	@Column(name = "bk_author")
	private String author;
	
//    public BookData(String bdisbn, String bdname, String bdauthor) {
//    	isbn = bdisbn;
//		name = bdname;
//		author = bdauthor;
//	}
//
//	/**
//	 * @return the isbn
//	 */
//	public String getIsbn() {
//		return isbn;
//	}
//
//	/**
//	 * @param isbn the isbn to set
//	 */
//	public void setIsbn(String isbn) {
//		this.isbn = isbn;
//	}
//
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	/**
//	 * @return the author
//	 */
//	public String getAuthor() {
//		return author;
//	}
//
//	/**
//	 * @param author the author to set
//	 */
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	
   
}