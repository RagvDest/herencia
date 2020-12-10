package com.clearminds.rgv.herenciaEvaluacion;

import com.clearminds.impl.PersonaManager;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager pManager = new PersonaManager();
		pManager.insertarPersona(new Persona("Portoviejo","Quito","Ecuatoriana"));
	}

}
