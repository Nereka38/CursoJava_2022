package ej3Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

@Entity
@Controller
@Table(name="employee")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
		
		public Employee() {}
		
		public Employee(int id, String name) {
		      this.id = id;
		      this.name = name;
		   }
		
		public int getId() {  
		    return id;  
		}  
		
		public void setId(int id) {  
		    this.id = id;  
		}  
		
		public String getName() {  
		    return name;  
		}  
		
		public void setName(String name) {  
		    this.name = name;  
		}  

		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name +"]";
		}
			
	}
