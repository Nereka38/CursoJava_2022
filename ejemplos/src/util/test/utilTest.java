package util.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import util.Pair;

class utilTest {
	String miString;
	Integer miInteger;
	

	@BeforeEach
	void setUp() throws Exception {
		miString = new String("Nombre");
		miInteger = new Integer(10);
	}

	@AfterEach
	void tearDown() throws Exception {
		miString= null;
		miInteger= null;
	}

	@Test
	void testConstructorConString() {
		Pair<String> strPair = new Pair<String>(miString, "Nombre2");
		String first = strPair.getFirst();
		String second = strPair.getSecond();
		
		assertEquals("Nombre", first);
		assertEquals("Nombre2", second);
	}
	
	@Test
	void testConstructorConInteger() {
		Pair<Integer> intPair = new Pair<Integer>(miInteger, 12);
		Integer first = intPair.getFirst();
		Integer second = intPair.getSecond();
		
		assertEquals(10, first);
		assertEquals(12, second);
	}

}
