/**
 * 
 */
package ej13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



/**
 * @author 
 *
 */
public abstract class PersonsUtil {

	public static Map<Integer, Person> getPersons(List<Person> list) {

		Map<Integer, Person> persons = new HashMap<Integer, Person>();
		for (Person p : list) {
			persons.put(p.getFile(), p);

		}
		return persons;

	}
	
	public static Set<Integer> getPersonsOrder(List<Person> list) {
		Set<Integer> personsSet = new TreeSet<Integer>();
		for (Person p : list) {
			personsSet.add(p.getAge());
			     
		}

		return personsSet;
	}
}
