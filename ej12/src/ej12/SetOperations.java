/**
 * 
 */
package ej12;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Nerea
 *
 */
public class SetOperations {
	
	public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
	    Set<T> setUnion = new TreeSet<T>(setA);
	    setUnion.addAll(setB);
	    return setUnion;
	  }
	
	public static <T> Set<T> interseccion(Set<T> setA, Set<T> setB) {
		 Set<T> setInterseccion = new TreeSet<T>(setA);
		 setInterseccion.retainAll(setB);
//		 for (T x : setA)
//		      if (setB.contains(x))
//		        setInterseccion.add(x);
		    return setInterseccion;
	}
	
//	public static <T> Set<T> diferencia(Set<T> setA, Set<T> setB) {
//		Set<T> setDiferencia = new TreeSet<T>(setA);
//	    setDiferencia.removeAll(setB);
//	    return setDiferencia;
//	}
//	
//	public static <T> Set<T> difSimetrica(Set<T> setA, Set<T> setB) {
//	    Set<T> setA1;
//	    Set<T> setB1;
//
//	    setA1 = union(setA, setB);
//	    setB1 = interseccion(setA, setB);
//	    return diferencia(setA1, setB1);
//	  }

	
	public static void main(String args[]) {
	    TreeSet<Character> set1 = new TreeSet<Character>();
	    TreeSet<Character> set2 = new TreeSet<Character>();
	    //Set1
	    set1.add('1');
	    set1.add('2');
	    set1.add('3');
	    set1.add('4');
	    
	    //Set2
	    set2.add('3');
	    set2.add('4');
	    set2.add('5');
	    set2.add('6');

	    System.out.println("Set 1: " + set1);
	    System.out.println("Set 2: " + set2);

	    System.out.println("Union: " + union(set1, set2));
	    System.out.println("Intersection: " + interseccion(set1, set2));
//	    System.out.println("Difference : " + diferencia(set1, set2));
//	    System.out.println("Symmetric Difference: " + difSimetrica(set1, set2));

	  }
	

}
