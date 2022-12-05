package MiPilaGeneric.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.training.java.ej2.MiPilaGeneric;
import com.capgemini.training.java.ej2.Pila;

class MiPilaGenericTest {
	MiPilaGeneric<String> pila;
	private ArrayList<String> list;
	
	@BeforeEach
	void setUp() throws Exception {
	
		list = new ArrayList<String>();
		list.add("Hola");
		list.add("Adios");
		list.add("Buenas");
		pila = new MiPilaGeneric<>(list);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		pila = null;
		list = null;
	}


	@Test
	void testConstructorWithParam() {
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Hola");
		expected.add("Adios");
		expected.add("Buenas");
		assertEquals(new MiPilaGeneric<>(expected).getList(), pila.getList());
	}
	
	@Test
	void testGenericPop() {
		pila.pop();
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Hola");
		expected.add("Adios");
		assertEquals(pila.getList(), new MiPilaGeneric<>(list).getList());
	}
	
	@Test
	void testGenericPushPeek() {
		pila.push("Tardes");
		assertEquals(pila.peek(), "Tardes");
	}
	
	@Test
	void testGenericReverse() {
		pila.reverse();
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Buenas");
		expected.add("Adios");
		expected.add("Hola");
		assertEquals(pila.getList(), new MiPilaGeneric<>(expected).getList());
	}
	
	@Test
	void testEqualsGeneric_true() {
		assertEquals(pila, new MiPilaGeneric<>(list));
	}
	
	@Test
	void testEqualsGeneric_false() {
		assertNotEquals(pila, new MiPilaGeneric<>());
	}


}
