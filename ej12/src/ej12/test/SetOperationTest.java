/**
 * 
 */
package ej12.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej12.SetOperations;

/**
 * @author Nerea
 *
 */
class SetOperationTest {
	
	Set<String> setStrA;
	Set<String> setStrB;
	
	Set<Integer> setIntA;
	Set<Integer> setIntB;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		setStrA = new HashSet<String>();
		setStrA.add("1");
		setStrA.add("2");
	    setStrA.add("3");
	    setStrA.add("4");
	    
	    setStrB = new HashSet<String>();
		setStrB.add("1");
		setStrB.add("2");
	    setStrB.add("3");
	    setStrB.add("4");
	    setStrB.add("5");
	    setStrB.add("6");
	    
	    setIntA = new HashSet<Integer>();
	    setIntA.add(1);
	    setIntA.add(2);
	    setIntA.add(3);
	    setIntA.add(4);
	    
	    setIntB = new HashSet<Integer>();
	    setIntB.add(1);
	    setIntB.add(2);
	    setIntB.add(3);
	    setIntB.add(4);
	    setIntB.add(5);
	    setIntB.add(6);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		setStrA = null;
		setStrB = null;
		setIntA = null;
		setIntB = null;
	}

	@Test
	void testUnionInt() {
		Set<Integer> intSetUnion = new HashSet<Integer>();
		intSetUnion.add(1);
		intSetUnion.add(2);
		intSetUnion.add(3);
		intSetUnion.add(4);
		intSetUnion.add(5);
		intSetUnion.add(6);
		
		assertEquals(intSetUnion, SetOperations.union(setIntA, setIntB));
	}
	
	@Test
	void testInterseccionInt() {
		Set<Integer> intSetInterseccion = new HashSet<Integer>();
		intSetInterseccion.add(1);
		intSetInterseccion.add(2);
		intSetInterseccion.add(3);
		intSetInterseccion.add(4);
		
		assertEquals(intSetInterseccion, SetOperations.interseccion(setIntA, setIntB));
	}
	
	@Test
	void testDiferenciaInt() {
		Set<Integer> intSetDiferencia = new HashSet<Integer>();
		
		assertEquals(intSetDiferencia, SetOperations.diferencia(setIntA, setIntB));
	}
	
}
