/**
 * 
 */
package ej11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Nerea
 *
 */
public class CalendarList {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Escribe mes y el año asì: MM aaaa ");
        int month = in.nextInt();
        int year = in.nextInt();
        in.close();
        
        try {

            if (month < 1 || month > 12)
                throw new Exception("Mes inválido " + month);
            printCalendarMonthYear(month, year);} 

         catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void printCalendarMonthYear(int month, int year) {
        Calendar cal = new GregorianCalendar();
        cal.clear();
        cal.set(year, month - 1, 1); 
        System.out.println("Mes "+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG,
                        Locale.US) + " " + cal.get(Calendar.YEAR));
        System.out.println("------------------------");
        int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
        int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
    }
    private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
    	Calendar cal2 = Calendar.getInstance(); 
    	System.out.println("Fecha Actual:" + sdf.format(cal2.getTime()));
    	
    	System.out.println("------------------------");
    	
        int weekdayIndex = 0;
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        System.out.println("..........................");
        
        for (int day = 1; day < firstWeekdayOfMonth; day++) {
            System.out.print("    "); 
            weekdayIndex++;
        }
        for (int day = 1; day <= numberOfMonthDays; day++) {

            if (day<10) 
            System.out.print(day+" ");
            else System.out.print(day); 
            weekdayIndex++;
            if (weekdayIndex == 7) {
                weekdayIndex = 0;
                System.out.println();
            } else { 
                System.out.print("  ");
            }
            
            }
        }
    	
	}
