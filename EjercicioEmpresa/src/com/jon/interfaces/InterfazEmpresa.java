package com.jon.interfaces;

import com.jon.clases.Ejecutivo;
import com.jon.clases.Empleado;
import com.jon.excepciones.Excepcion;

public interface InterfazEmpresa {
	
	public String getNombre();
	
	public int getTamano();
	
	public Empleado getEmpleado(int num) throws Excepcion;
	
	public void despideEmpleado(int num);
	
	public int getContador();
	
	public Empleado nuevoEmpleado(String nombre, int sueldo);
	
	public void ascender(int numero, Ejecutivo e);
}
