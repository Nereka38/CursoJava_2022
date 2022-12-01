/**
 * 
 */
package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * @author Nerea
 *
 */
public class CalendarString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1994, Calendar.AUGUST, 3);
		
		//cal.add(Calendar.MONTH , 3);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy EEE");
		System.out.println("La fecha de nacimiento es: " + sdf.format(cal.getTime()));
		
		System.out.println("Datos a obtener: ");
		System.out.println("El año es: "+ cal.get(Calendar.YEAR));
        System.out.println("El mes es: "+ cal.get(Calendar.MONTH)+1);
        System.out.println("El día es: "+ cal.get(Calendar.DATE));
        System.out.println("El día de la semana es: "+ cal.get(Calendar.DAY_OF_WEEK));
       
        
        System.out.println("Ingrese el año:");
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Día a Resaltar:");
        int dia = sc.nextInt();
        
        System.out.println("El último día del mes fue " + getUltimoDiaDelMes(mes-1, anio, dia));
        System.out.println("El primer día del mes fue " + getPrimerDiaDelMes(mes, anio, dia));
        
        calendarPrint(anio, mes, dia);
        sc.close();

	}
		 public static void calendarPrint(int pMes, int pAnio, int pDiaAResaltar) {
			 
		 }
		 
		 private static int getUltimoDiaDelMes(int pMes, int pAnio, int day) {
			   Calendar cal = Calendar.getInstance();
		   	   cal.set(pAnio, pMes, 1);
		   	   int ultimoDia =1;
		   	   
		   	   while(cal.get(Calendar.MONTH) == pMes) {
		   		   ultimoDia =cal.get(Calendar.DATE);
		   		   cal.add(Calendar.DATE, 1);
		   	   }
		   		   
			   return ultimoDia;
		   
		   }
		 
		 private static int getPrimerDiaDelMes(int pMes, int pAnio, int day) {
			 Calendar cal = Calendar.getInstance();
			 cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-1);
			 int primerDia =1;
			 while(cal.get(Calendar.MONTH) == pMes) {
		   		   primerDia =cal.get(Calendar.DATE);
		   		   cal.add(Calendar.DATE, 1);
		   		   cal.add(Calendar.DAY_OF_MONTH, 1);
		   	   }
			 return primerDia;
			}


}
