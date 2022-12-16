package com.baeldung.boot.jsp.repository.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.boot.jsp.repository.BookRepository;
import com.baeldung.boot.jsp.repository.model.BookData;

@SpringBootTest
class DbJPABookRepositoryTest {
	@Autowired
	BookRepository bookRepository;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
//		bookRepository = new DbJPABookRepository();
	}

	@AfterEach
	void tearDown() throws Exception {
//		bookRepository = null;
	}

	@Test
	void testFindAll() {
		System.out.println("todos = " + bookRepository.findAll());
		assertEquals(3, bookRepository.findAll().size());
	}

	@Test
	void testFindById() {
		System.out.println("byid = " + bookRepository.findById("347667748495"));
		Optional<BookData> bookTest = bookRepository.findById("347667748495");
		assertTrue(bookTest.isPresent());
	}
	
	@Test
	void testAdd() {
		System.out.println();
		List<BookData> bookTest = new ArrayList<BookData>();
        bookTest.add(new BookData("737484924834", "Libro4", "Rosa"));
	}

}
