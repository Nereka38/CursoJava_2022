/**
 * 
 */
package planet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.training.java.Planet;
/**
 * @author Nerea
 *
 */
class PlanetTest  {
	String planet1Name;
	double planet1Mass, planet1Radius;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		planet1Name = "MERCURY";
		planet1Mass = 1.024E26;
		planet1Radius = 2.4397e6;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		planet1Name = null;
		planet1Mass = 0;
		planet1Radius = 0;
	}
	
	@Test
	void testMercuryName() {
		assertEquals(planet1Name, Planet.MERCURY.toString());
		
	}

	@Test
	void testMercuryMass() {
		assertEquals(planet1Mass, Planet.MERCURY.getMass());
		
	}
	
	@Test
	void testMercuryRadius() {
		assertEquals(planet1Radius, Planet.MERCURY.getRadius());
		
	}

}
