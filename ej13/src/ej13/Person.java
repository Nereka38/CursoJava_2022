/**
 * 
 */
package ej13;

/**
 * @author Nerea
 *
 */
public class Person {
	private int file;
	private int age;
	private String name;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int file, int age, String name) {
		super();
		this.file = file;
		this.age = age;
		this.name = name;
	}


	/**
	 * @return the file
	 */
	public int getFile() {
		return file;
	}


	/**
	 * @param file the file to set
	 */
	public void setFile(int file) {
		this.file = file;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, file, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && file == other.file && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Person [file=" + file + ", age=" + age + ", name=" + name + "]";
	}
	
	



}
