package com.jon.clases;

import com.jon.interfaces.InterfazEmpleado;

public class Empleado implements InterfazEmpleado{
	
	protected final Empresa empresa;
	protected String nombre;
	protected int sueldo;
	protected final int numero;
	
	public Empleado (Empresa empresa, String nombre, int sueldo){
		this.empresa = empresa;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numero = this.empresa.getContador();
	}
	
	protected Empleado (Empresa empresa, String nombre, int sueldo, int numero){
		this.empresa = empresa;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numero = numero;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getSueldo() {
		return this.sueldo;
	}
	
	public int getNumEmpleado() {
		return this.numero;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.numero) + this.nombre + Integer.toString(this.sueldo);
	}
	
	public final void aumentarSueldo(int n) {
		//this.sueldo += this.sueldo * (n/100);
		this.sueldo += this.sueldo * n;
	}

	public void despedir() {
		this.empresa.despideEmpleado(this.numero);
	}
	
	public void ascender() {
		Ejecutivo ej = new Ejecutivo(this.empresa, this.nombre, this.sueldo, this.numero);
	}

}
