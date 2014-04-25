package com.jon.clases;

public class Ejecutivo extends Empleado {

	private int presupuesto;
	
	public Ejecutivo(Empresa empresa, String nombre, int sueldo) {
		super(empresa, nombre, sueldo);
	}
	
	public Ejecutivo(Empresa empresa, String nombre, int sueldo, int numero) {
		super(empresa, nombre, sueldo, numero);
	}
	
	public int getPresupuesto() {
		return this.presupuesto;
	}

	public void asignaPresupuesto(int p) {
		this.presupuesto = p;
	}
	
	@Override
	public String toString() {
		return "Este empleado es un ejecutivo";
	}
	
}
