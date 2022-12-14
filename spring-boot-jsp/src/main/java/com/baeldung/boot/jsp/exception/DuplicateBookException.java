package com.baeldung.boot.jsp.exception;

import com.baeldung.boot.jsp.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Book book;
    
    public DuplicateBookException(Book book) {
        this.book = book;
    }

	public Object getBook() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object getIsbn() {
		// TODO Auto-generated method stub
		return null;
	}
}