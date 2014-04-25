package com.jon.clases;

import java.util.ArrayList;

import com.jon.excepciones.Excepcion;
import com.jon.interfaces.InterfazEmpresa;

public class Empresa implements InterfazEmpresa {
	
	private String nombre;
	private int tamano;
	private ArrayList<Empleado> empleados;
	private static int contador = 0;

	public Empresa(String nombre, int tamano) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.empleados = new ArrayList<Empleado>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	/*public void setEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}*/
	
	protected void validateException(int num) throws Excepcion {
		if (num >= contador) {
			throw new Excepcion("Nœmero no v‡lido: es mayor que los empleados de la empresa");
		}
	}
	
	public Empleado getEmpleado(int num) throws Excepcion {
		validateException(num);
		return this.empleados.get(num);
	}
	
	public void despideEmpleado(int num) {
		this.empleados.add(num, null);
	}
	
	public int getContador() {
		return contador;
	}
	
	public Empleado nuevoEmpleado(String nombre, int sueldo) {
		Empleado empl = new Empleado(this, nombre, sueldo, contador);
		contador++;
		this.empleados.add(empl);
		return empl;
	}
}
