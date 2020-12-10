package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	private ServicioPersona srv;

	public PersonaManager() {
		super();
		this.srv = new ServicioPersonaArchivos();
	}
	
	public void insertarPersona(Persona p){
		srv.insertar(p);
	}
	
}
