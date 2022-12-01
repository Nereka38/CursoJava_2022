package MiPilaGeneric.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.training.java.ej2.MiPilaGeneric;

class MiPilaGenericTest {

	MiPilaGeneric Pila;
	ArrayList<String> list;
	
	@BeforeEach
	void setUp() throws Exception {
	
		list = new ArrayList<>();
		list.add("Hola");
		list.add("Adios");
		list.add("Buenas");
		Pila = new MiPilaGeneric(list);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Pila = null;
		list = null;
	}


	@Test
	void testConstructorWithParam() {
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Hola");
		expected.add("Adios");
		expected.add("Buenas");
		assertEquals(new MiPilaGeneric(expected).getList(), Pila.getList());
	}
	
	@Test
	void testGenericPop() {
		Pila.pop();
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Hola");
		expected.add("Adios");
		assertEquals(Pila.getList(), new MiPilaGeneric(list).getList());
	}
	
	@Test
	void testGenericPushPeek() {
		Pila.push("Tardes");
		assertEquals(Pila.peek(), "Tardes");
	}
	
	@Test
	void testGenericReverse() {
		Pila.reverse();
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Buenas");
		expected.add("Adios");
		expected.add("Hola");
		assertEquals(Pila.getList(), new MiPilaGeneric(expected).getList());
	}
	
	@Test
	void testEqualsGeneric_true() {
		assertEquals(Pila, new MiPilaGeneric(list));
	}
	
	@Test
	void testEqualsGeneric_false() {
		assertNotEquals(Pila, new MiPilaGeneric());
	}


}
