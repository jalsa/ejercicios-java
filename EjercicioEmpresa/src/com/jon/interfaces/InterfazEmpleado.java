package com.jon.interfaces;

public interface InterfazEmpleado {

	public String getNombre();
	
	public int getSueldo();
	
	public int getNumEmpleado();
	
	public void setNombre(String nombre);
	
	public void setSueldo(int sueldo);
	
	@Override
	public String toString();

	public void despedir();
	
}
