package com.jon.clases;

import java.util.ArrayList;

import com.jon.excepciones.Excepcion;
import com.jon.interfaces.InterfazEmpleado;
import com.jon.interfaces.InterfazEmpresa;

public class Empresa implements InterfazEmpresa {
	
	private String nombre;
	private int tamano;
	private ArrayList<InterfazEmpleado> empleados;
	private static int contador = 0;

	public Empresa(String nombre, int tamano) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.empleados = new ArrayList<InterfazEmpleado>(this.tamano);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	protected void validateException(int num) throws Excepcion {
		if (num >= contador) {
			throw new Excepcion("Nœmero no v‡lido: es mayor que los empleados de la empresa");
		}
	}
	
	public InterfazEmpleado getEmpleado(int num) throws Excepcion {
		validateException(num);
		return this.empleados.get(num);
	}
	
	public void despideEmpleado(int num) {
		// Comprobar si hay empleados y si existe ese, si no, excepci—n
		this.empleados.remove(num);
	}
	
	public int getContador() {
		return contador;
	}
	
	public InterfazEmpleado nuevoEmpleado(String nombre, int sueldo) {
		//Comprobar tama–o de la empresa y si no hay sitio, excepci—n
		InterfazEmpleado empl = new Empleado(this, nombre, sueldo, contador);
		contador++;
		this.empleados.add(empl);
		return empl;
	}
	
	public void ascender(int numero, Ejecutivo e) {
		this.empleados.add(numero, e);
		/*try {
			this.empleados.add(this.empleados.indexOf(this.getEmpleado(numero)), e);
		} catch (Excepcion e1) {
			System.out.println(e1.getMessage());
		}*/
	}
	
}
