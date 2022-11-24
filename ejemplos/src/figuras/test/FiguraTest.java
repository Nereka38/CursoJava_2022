/**
 * 
 */
package figuras.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.exceptions.FiguraException;

/**
 * @author nefernan
 *
 */
class FiguraTest {
	// 1-lote de pruebas

	Cuadrado cuaVacio;
	Cuadrado cuaLleno;
	Circulo cirVacio;
	Circulo cirLleno;

	// la lista se guarda en forma ordered, permite duplicados
	List<Figura> figurasList;

	// es unordered, no permite duplicados
	Set<Figura> figurasSet;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		// creo mi lote de pruebas
		cuaVacio = new Cuadrado();
		cuaLleno = new Cuadrado("cuadrado", 10);

		cirVacio = new Circulo();
		cirLleno = new Circulo("circulo", 10);

		figurasList = new ArrayList<>();
		figurasList.add(cuaVacio);
		figurasList.add(cuaLleno);
		figurasList.add(cirVacio);
		figurasList.add(cirLleno);
		figurasList.add(new Cuadrado("cuadrado 2", 15));
		figurasList.add(new Circulo("cuadrado 2", 15));

		figurasSet = new HashSet<>();
		figurasSet.add(cuaVacio);
		figurasSet.add(cuaLleno);
		figurasSet.add(cirVacio);
		figurasSet.add(cirLleno);
		figurasSet.add(new Cuadrado("cuadrado 3", 15));
		figurasSet.add(new Circulo("cuadrado 3", 15));

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		cuaVacio = null;
		cuaLleno = null;

		cirVacio = null;
		cirLleno = null;

		figurasList = null;
		figurasSet = null;
		
		Figura.clear();
	}

	@Test
	void testCuadradoLlenoGetNombre() {
		assertEquals("cuadrado", cuaLleno.getNombre());
	}

	@Test
	void testCuadradoLlenoGetLado() {
		assertEquals(10, cuaLleno.getLado(), 0.001);
	}

	@Test
	void testCuadradoPerimetro() {
		assertEquals(40, cuaLleno.calcularPerimetro(), 0.001);
	}

	@Test
	void testCuadradoSuperficie() {
		assertEquals(100, cuaLleno.calcularSuperficie(), 0.001);
	}

	@Test
	void testCuadradoEqualsHashcodeList_True() {
		try {
			assertTrue(figurasList.contains(new Cuadrado("cuadrado", 10)));
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	void testCuadradoEqualsHashcodeList_False() {
		try {
			assertFalse(figurasList.contains(new Cuadrado("cuadradito", 10)));
		} catch (FiguraException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	void testCuadradoEqualsList_Cantidad() {
		figurasList.add(new Cuadrado());
		assertEquals(7, figurasList.size());
	}

	@Test
	void testCuadradoSetEquals_Cantidad() throws FiguraException {
		figurasSet.add(new Cuadrado("cuadrado", 10));
		assertEquals(6, figurasSet.size());
	}

	@Test
	void testCuadradoSetEquals_True() throws FiguraException {
		Cuadrado miCuadrado = new Cuadrado("cuadrado", 10);
		assertTrue(cuaLleno.equals(miCuadrado));
	}

	@Test
	void testCuadradoSetEquals_False() throws FiguraException {
		Cuadrado miCuadrado = new Cuadrado("cuadradito", 15);
		assertFalse(cuaLleno.equals(miCuadrado));
	}

	@Test
	void testCuadradoFiguraException() {
		Cuadrado cua = new Cuadrado();
		System.out.println("la lista de figuras");
		System.out.println(figurasList);

		System.out.println("cuadrado lleno=" + cuaLleno);

		try {
			cua.setLado(-10);
		} catch (FiguraException e) {
			assertEquals("El valor del lado no puede ser negativo", e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testCantidadDeObjetos() {
		assertEquals(8, Figura.getCantidadDeFiguras());
	}
	
	@Test
	void testCantidadDeObjetos10() {
		Cuadrado cua1 = new Cuadrado();
		Cuadrado cua2 = new Cuadrado();
		
		assertEquals(10, Figura.getCantidadDeFiguras());
		
	}

}
