package com.nereaCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nereaCode.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String username);
	
}
