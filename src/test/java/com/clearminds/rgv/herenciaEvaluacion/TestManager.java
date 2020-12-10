package com.clearminds.rgv.herenciaEvaluacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		try {
			PersonaManager pManager = new PersonaManager();
			pManager.insertarPersona(new Persona("Portoviejo","Quito","Ecuatoriana"));
		} catch (InstanceException e) {
			e.printStackTrace();
		}
		
	}

}
