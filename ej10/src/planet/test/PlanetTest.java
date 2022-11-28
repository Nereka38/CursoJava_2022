/**
 * 
 */
package planet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.training.java.ej2.Planet;

/**
 * @author Nerea
 *
 */
class PlanetTest {
	
	Planet mass;
	Planet radius;
	String name;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPlanet() {
		String planet1 = new String ("MERCURY");
		
		assertEquals(planet1, Planet.MERCURY);
		
	}

}
