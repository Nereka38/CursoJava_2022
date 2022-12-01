/**
 * 
 */
package employee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import employee.Employee;

/**
 * @author Nerea
 *
 */
class EmployeeTest {
	
	Employee junior;
	Employee senior;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		junior = new Employee("1/1/22",1000,"Pepe",40,1);
		senior = new Employee("1/1/22",1000,"Pepe",40,2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		junior = null;
		senior = null;
	}

	@Test
	void testJuniorEquals_True() throws Exception {
		Employee junior2 = new Employee("1/1/22",1000,"Pepe",40,1);
		assertTrue(junior.equals(junior2));
	}
	
	@Test
	void testJuniorEquals_False() throws Exception {
		Employee junior2 = new Employee("1/1/22",1300,"Pepito",40,2);
		assertFalse(junior.equals(junior2));
	}
	
	@Test
	void testEmployeeHasCode_False() {
		Employee junior2 = new Employee("1/1/22",1000,"Pepe",40,1);
	    assertFalse(junior2.hashCode() == junior.hashCode());
	}
}
