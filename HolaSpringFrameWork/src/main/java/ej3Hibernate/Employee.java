package ej3Hibernate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee {
		@RequestMapping("/index")
		public String employeeIndex() {
			return "Employee";
		}
	}
