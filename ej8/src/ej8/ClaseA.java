package ej8;

import ej8.exception.ExceptionA;
import ej8.exception.ExceptionB;

public class ClaseA {

/**
 * 
 * @param args
 * @throws ExceptionA
 * 
 * 
 * Checked exception
 * 
 */
	public static void a() throws ExceptionA {
		 throw new ExceptionA("Soy el Exception A");
		}
	
	
	/**
	 * Unchecked exception
	 */
	
	public static void b() throws ExceptionB {
		throw new ExceptionB("Soy el Exception B");
		
	}

}
