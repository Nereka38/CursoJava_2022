package ej3Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Controller
@Table(name="ejHibernate")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	int id;
	@Column(name = "name")
	String name;
	
	
		@RequestMapping("/index")
		public String employeeIndex() {
			return "Employee";
		}
		
		public Employee() {}
		
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
