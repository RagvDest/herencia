package com.clearminds.impl;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	private ServicioPersona srv;

	public PersonaManager() throws InstanceException {
		super();
		try {
			Properties p = new Properties();
			File f=new File("config.properties");
			p.load(new FileReader("config.properties"));
			Class<?> clase = Class.forName(p.getProperty("instancia"));
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
