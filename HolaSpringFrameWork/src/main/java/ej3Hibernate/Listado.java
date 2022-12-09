package ej3Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class Listado {
	@RequestMapping ("/listado")
	public String goListado(Model model ) {
		List<String> alumnos = new ArrayList<String>();
		alumnos.add("Juan");
		alumnos.add("Pedro");
		alumnos.add("Juan");
		
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("profesor", "Gabriel");
		model.addAttribute("alumnos", alumnos);
		return "Listado";
	}
			
}
