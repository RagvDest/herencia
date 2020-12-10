package com.clearminds.rgv.herenciaEvaluacion;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		try {
			PersonaManager pManager = new PersonaManager("com.clearminds.impl.ServicioPersonaArchivos");
			pManager.insertarPersona(new Persona("Portoviejo","Quito","Ecuatoriana"));
		} catch (InstanceException e) {
			e.printStackTrace();
		}
		
	}

}
