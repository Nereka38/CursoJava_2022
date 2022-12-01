/**
 * 
 */
package ej11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Nerea
 *
 */
public class CalendarPrint {
	

	private static final int MONTH = 0;
	private static final int DAY_OF_WEEK = 0;
	private static final int DAY_OF_MONTH = 0;
	private static final int YEAR = 0;
	private static final int DATE = 0;
	private static final int SUNDAY = 0;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	/**
	 * @param args
	 * 
	 * Fecha actual completo:
	 * 
	 * 
	 */
	
        Date today = new Date();
        System.out.println(today);
        System.out.println("---------------------------------------------");
        
      /**
       * @param args
       *  
       *  Formateando la fecha:
       *  
       *  
       */
        
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Son las: "+ hourFormat.format(today)+" de fecha: "+ dateFormat.format(today));
        
        Calendar calendar = Calendar.getInstance();

        if (args.length == 2) {
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            calendar.set(year, month, 1);
        }

        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        while (calendar.get(Calendar.MONTH) == month) {
            System.out.println(calendar.getTime());
            calendar.add(Calendar.DATE, 1);
        }
        
        /**
         * @param args
         *  
         *  Fecha actual más completo, con horas, minutos y segundos:
         *  
         *  
         */
        
        Calendar actualDay = Calendar.getInstance();
        int year = actualDay.get(Calendar.YEAR);
        int month1 = actualDay.get(Calendar.MONTH) +1;
        int day = actualDay.get(Calendar.DAY_OF_MONTH);
        int hour = actualDay.get(Calendar.HOUR_OF_DAY);
        int minute = actualDay.get(Calendar.MINUTE);
        int second = actualDay.get(Calendar.SECOND);

        System.out.println("Fecha Actual: "+ day + "/" + (month1) + "/" + year);
        System.out.printf("Hora Actual: %02d:%02d:%02d %n", hour, minute, second);
        System.out.println("-------------Fecha desglosada----------------");
        System.out.println("El año es: "+ year);
        System.out.println("El mes es: "+ month1);
        System.out.println("El día es: "+ day);
        System.out.printf("La hora es: %02d %n", hour);
        System.out.printf("El minuto es: %02d %n", minute);
        System.out.printf("El segundo es: %02d %n", second);
       
        /**
         * @param args
         *  
         *  Ejercicio Calendario:
         *  
         *  
         */
      System.out.println("-------------Calendario----------------");
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
      Calendar calendar2 = Calendar.getInstance(); 
      System.out.println("Fecha Actual:" + sdf.format(calendar2.getTime()));

      calendar.set(Calendar.DAY_OF_MONTH,1);
      System.out.println("Primer día del mes actual:" + sdf.format(calendar2.getTime()));
      System.out.println("Último día del mes actual " + calendar2.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
	
	

}
