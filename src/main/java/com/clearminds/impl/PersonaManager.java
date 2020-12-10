package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	private ServicioPersona srv;

	public PersonaManager(String className) throws InstanceException {
		super();
		try {
			Class<?> clase = Class.forName(className);
			this.srv = (ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}
	
	public void insertarPersona(Persona p){
		srv.insertar(p);
	}
	
}
