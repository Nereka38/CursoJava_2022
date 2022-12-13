package com.nereaCode.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.nereaCode.model.Usuario;

@SpringBootTest
class IUsuarioRepoTest {
	@Autowired
	IUsuarioRepo usuRepo;
	
	@Autowired
	BCryptPasswordEncoder encoder;

	@Test
	void testAgregar() {
		Usuario usu = new Usuario (0, "nfer", "Nerea");
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals("nfer", usuRetorno.getClave());
	}
	
	@Test
	void testAgregarEncode() {
		Usuario usu2 = new Usuario (0, encoder.encode("nfer"), "Nerea");
		Usuario usuRetorno = usuRepo.save(usu2);
		assertEquals(usu2.getClave(), usuRetorno.getClave());
	}

}
