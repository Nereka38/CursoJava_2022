/**
 * 
 */
package ej11;

import java.util.Calendar;

/**
 * @author Nerea
 *
 */
public class CalendarList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
         * @param args
         *  
         *  Lista de días del mes actual:
         *  
         *  
         */
        Calendar calendar = Calendar.getInstance();

        if (args.length == 2) {
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            calendar.set(year, month, 1);
        }

        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        while (calendar.get(Calendar.MONTH) == month) {
            System.out.println(calendar.getTime());
            calendar.add(Calendar.DATE, 1);
        }
        

	}

}
