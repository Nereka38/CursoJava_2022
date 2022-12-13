package com.nereaCode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nereaCode.model.Persona;
import com.nereaCode.repo.IPersonaRepo;

@Controller
public class DemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		//añadir una persona
		Persona per = new Persona(0, "Gabriel Casas");
		repo.save(per);
		
		//añadir world a la tabla
//		if(name==null || name.isEmpty())
//			name="nereaCode";
//		Persona per = new Persona(0, name);
//		repo.save(per);
		
		//Para borrar una persona en la base de datos
//		if(name.endsWith("World")) {
//			repo.delete(new Persona(1, "Gabriel Casas"));
//			name="nereaCode";
//		}
		
		
		model.addAttribute("name", name);
		return "greeting";
	}
}
