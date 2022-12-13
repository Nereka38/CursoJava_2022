package com.nereaCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	@Id
	private int codigo;
	@Column(name = "clave")
	private String clave;
	@Column(name = "nombre")
	private String nombre;
	
	
	public Usuario() {}
	
	public Usuario(int uCod, String uCla, String uNom) {
		codigo = uCod;
		clave = uCla;
		nombre = uNom;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
