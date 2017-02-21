package mx.com.anzen.corebank.models;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("User")
public class User {
	
	protected Long id;
	protected String nombre;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
