package com.nereaCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nereaCode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
}
