package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaArchivos  implements ServicioPersona{
	public boolean insertar(Persona p) {
		System.out.println("Insertando persona en un archivo: "+p);
		return true;
	}

	public boolean actualizar(Persona p) {
		System.out.println("Actualizando persona en un archivo: "+p);
		return true;
	}

	public boolean eliminar(Persona p) {
		System.out.println("Eliminando persona en un archivo: "+p);
		return true;
	}
}
