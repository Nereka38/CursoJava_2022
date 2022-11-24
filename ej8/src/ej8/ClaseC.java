package ej8;

import ej8.exception.ExceptionA;

/**
 * 
 * @author Nerea
 *
 *
 *Checked ExceptionA: nos obliga a meter un throw y, por tanto, añadir un try-catch en main.
 *
 *Unchecked ExceptionB: no es necesario añadir un try-catch, añade el mensaje una vez hay un error.
 *
 *
 */
public class ClaseC {
	
	public static void main(String[] args) {
		 try {
			ClaseA.a();
		} catch (ExceptionA e) {
			
			e.printStackTrace();
		}
		 ClaseA.b();
		}
}
