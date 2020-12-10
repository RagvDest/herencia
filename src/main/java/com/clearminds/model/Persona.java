package com.clearminds.model;

public class Persona {
	private String ciudadNacimiento;
	private String ciudadActual;
	private String nacionalidad;
	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}
	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}
	public String getCiudadActual() {
		return ciudadActual;
	}
	public void setCiudadActual(String ciudadActual) {
		this.ciudadActual = ciudadActual;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Persona() {
		super();
	}
	public Persona(String ciudadNacimiento, String ciudadActual, String nacionalidad) {
		super();
		this.ciudadNacimiento = ciudadNacimiento;
		this.ciudadActual = ciudadActual;
		this.nacionalidad = nacionalidad;
	}
}
