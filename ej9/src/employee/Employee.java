/**
 * 
 */
package employee;

import java.util.Date;

/**
 * @author Nerea
 *
 */
public class Employee {
	
	private String fechaIngreso;
	private double salario;
	private String nombre;
	private int edad;
	private int id;
	
	public Employee() {
	}

	public Employee(String fechaIngreso, double salario, String nombre, int edad, int id) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
		setNombre(nombre);
		this.edad = edad;
		this.id = id;
	}

	/**
	 * @return the fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	 
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	 public int hashCode() {
		return super.hashCode();
    } 

	@Override
	public boolean equals(Object obj) {
		
		boolean employee = false;
		
		if(obj instanceof Employee) {
		Employee employee2 = (Employee)obj;
		employee = employee2.getNombre() != null
				&& employee2.getNombre().equals(nombre)
				&& employee2.getFechaIngreso() != null && employee2.getFechaIngreso().equals(fechaIngreso)
				&& employee2.getEdad() != 0 && employee2.getEdad() == (edad)
				&& employee2.getId() != 0 && employee2.getId() == (id);	
		}
		
		return employee;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nnombre=");
		sb.append("Fecha de ingreso: ");
		sb.append(fechaIngreso);
		sb.append("Salario: ");
		sb.append(salario);
		sb.append("Nombre: ");
		sb.append(nombre);
		sb.append("Edad: ");
		sb.append(edad);
		return sb.toString();

	}

}
