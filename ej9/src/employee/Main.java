/**
 * 
 */
package employee;


/**
 * @author Nerea
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String [] arg) {
		Employee junior = new Employee("1/1/22",1000,"Pepe",40,0);
		Employee senior = new Employee("1/1/22",1000,"Pepe",40,1);
		
		if(junior.hashCode() == senior.hashCode())
        {
                System.out.println("Both Objects are equal. " + "Junior: " + junior.hashCode() + " Senior: " + senior.hashCode());
    
        }
		 else
		        System.out.println("Both Objects are not equal. "  + "Junior: " + junior.hashCode() + " Senior: " + senior.hashCode()); 
	}
}
