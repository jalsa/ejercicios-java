package com.jon.interfaces;

import com.jon.clases.Empleado;
import com.jon.excepciones.Excepcion;

public interface InterfazEmpresa {
	
	public String getNombre();
	
	public int getTamano();
	
	//public void setEmpleado(Empleado empleado);
	
	public Empleado getEmpleado(int num) throws Excepcion;
	
	public void despideEmpleado(int num);
	
	public int getContador();
	
	public Empleado nuevoEmpleado(String nombre, int sueldo);
	
}
