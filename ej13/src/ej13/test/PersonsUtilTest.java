/**
 * 
 */
package ej13.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej13.Person;
import ej13.PersonsUtil;

/**
 * @author Nerea
 *
 */
class PersonsUtilTest {
	
	Person person1;
	Person person2;
	Person person3;

	
	List<Person> listTest;
	
	

	@BeforeEach
	void setUp() throws Exception {
		listTest = new ArrayList < Person> ();
        listTest.add(new Person(101, 30, "Jos"));
        listTest.add(new Person(102, 35, "Ana"));
        listTest.add(new Person(103, 27, "Clara"));
        
        person1 = new Person(101, 30, "Jos");
        person2 = new Person(102, 35, "Ana");
        person3 = new Person(103, 27, "Clara");
        
      
	
	}

	@AfterEach
	void tearDown() throws Exception {
		person1=null;
		person2=null;
		person3=null;
		listTest =null;
	}

	

	
	@Test
	void testgetPersonas_true() {
		 Map<Integer, Person> expected = new HashMap<Integer, Person>();
		 expected.put(person1.getFile(), person1);
		 expected.put(person2.getFile(), person2);
		 expected.put(person3.getFile(), person3);
		 assertEquals(expected, PersonsUtil.getPersons(listTest));
	  
	}
	
	@Test
	void testgetPersonas_false() {
		 
		person1.setName("Gabrielito");
		Map<Integer, Person> expected = new HashMap<Integer, Person>();
		 expected.put(person1.getFile(), person1);
		 expected.put(person2.getFile(), person2);
		 expected.put(person3.getFile(), person3);
		 assertNotEquals(expected, PersonsUtil.getPersons(listTest));
	  
	}
	
	@Test
	void testgetPersonsOrdere() {
		 
		Set<Integer> expected = new TreeSet<Integer>();
		 expected.add(person1.getAge());
		 expected.add(person2.getAge());
		 expected.add(person3.getAge());
		 System.out.println(expected);
		 System.out.println(PersonsUtil.getPersonsOrder(listTest));
		 assertEquals(expected, PersonsUtil.getPersonsOrder(listTest));
	  
	}


}