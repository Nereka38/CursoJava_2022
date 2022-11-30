package es.edu.alter.practica0.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.edu.alter.practica0.Papel;
import es.edu.alter.practica0.Piedra;
import es.edu.alter.practica0.PiedraPapelTijeraFactory;
import es.edu.alter.practica0.Tijera;
import es.edu.alter.practica0.Lagartija;
import es.edu.alter.practica0.Spock;

class PiedraPapelTijeraFactoryTest {

PiedraPapelTijeraFactory piedra, papel, tijera, lagartija, spock;
	

	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		lagartija = new Lagartija();
		spock = new Spock();
	}

	@AfterEach
	void tearDown() throws Exception {
		piedra = null;
		papel = null;
		tijera = null;
		lagartija = null;
		spock = null;
	}

	@Test
	void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Piedra);
	}
	
	@Test
	void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL) instanceof Papel);
	}
	
	@Test
	void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Tijera);
	}
	
	@Test
	void testGetInstanceLagartija() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.LAGARTIJA) instanceof Lagartija);
	}
	
	@Test
	void testGetInstanceSpock() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.SPOCK) instanceof Spock);
	}
	
	@Test
	void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Papel);
	}
	
	@Test
	void testGetInstancePapel_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL) instanceof Tijera);
	}
	
	@Test
	void testGetInstanceTijera_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Piedra);
	}
	
	@Test
	void testPiedraLeGanaTijera() {
		assertEquals(1, piedra.comparar(tijera));
		assertEquals(piedra.getDescripcionResultado(), "piedra Gana contra tijera");
	}
	
	@Test
	void testPiedraPierdeConPapel() {
		assertEquals(-1, piedra.comparar(papel));
		assertEquals(piedra.getDescripcionResultado(), "piedra Pierde contra papel");
	}
	
	@Test
	void testPiedraIgualPiedra() {
		assertEquals(0, piedra.comparar(new Piedra()));
		assertEquals(piedra.getDescripcionResultado(), "piedra Empata contra piedra");
		assertEquals(piedra.getNombre(), "piedra");
	}
	
	@Test
	void testPapelLeGanaPiedra() {
		assertEquals(1, papel.comparar(piedra));
		assertEquals(papel.getDescripcionResultado(), "papel Gana contra piedra");
	}
	
	@Test
	void testPapelPierdeConTijera() {
		assertEquals(-1, papel.comparar(tijera));
		assertEquals(papel.getDescripcionResultado(), "papel Pierde contra tijera");
	}
	
	@Test
	void testPapelIgualPapel() {
		assertEquals(0, papel.comparar(new Papel()));
		assertEquals(papel.getDescripcionResultado(), "papel Empata contra papel");
		assertEquals(papel.getNombre(), "papel");
	}
	
	@Test
	void testTijeraLeGanaPapel() {
		assertEquals(1, tijera.comparar(papel));
		assertEquals(tijera.getDescripcionResultado(), "tijera Gana contra papel");
	}
	
	@Test
	void testTijeraPierdeConPiedra() {
		assertEquals(-1, tijera.comparar(piedra));
		assertEquals(tijera.getDescripcionResultado(), "tijera Pierde contra piedra");
	}
	
	@Test
	void testTijeraIgualTijera() {
		assertEquals(0, tijera.comparar(new Tijera()));
		assertEquals(tijera.getDescripcionResultado(), "tijera Empata contra tijera");
		assertEquals(tijera.getNombre(), "tijera");
	}
	
	
	
	

}
