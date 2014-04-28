package com.jon.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jon.clases.*;
import com.jon.excepciones.Excepcion;
import com.jon.interfaces.InterfazEmpleado;

public class EmpresaTest {
	
	Empresa empr;
	InterfazEmpleado empl, empl1, empl2;
	Ejecutivo ej;

	@Before
	public void setUp() {
		empr = new Empresa("Caf", 20);
		empl = empr.nuevoEmpleado("Patxi", 1000);
		empl1 = empr.nuevoEmpleado("Pello", 1500);
		ej = new Ejecutivo(empr, "Antxon", 2000);
		empl2 = empr.nuevoEmpleado("Antxon", 2000);
		empl2.ascender();
	}
	
	@Test
	public void test() {
		assertEquals("Empresa 1", "Caf", empr.getNombre());
		assertEquals("Empresa 1", 20, empr.getTamano());
		try {
			assertEquals("Empresa 1", empl, empr.getEmpleado(0));
		} catch (Excepcion e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Empresa 1", 3, empr.getContador());
		try {
			assertEquals("Empresa 1", empl1, empr.getEmpleado(1));
		} catch (Excepcion e) {
			System.out.println(e.getMessage());
		}
		assertEquals("Empleado 1", "Patxi", empl.getNombre());
		assertEquals("Empleado 1", 1000, empl.getSueldo());
		assertEquals("Empleado 1", "0Patxi1000", empl.toString());
		empl.aumentarSueldo(20);
		assertEquals("Empleado 1", 21000, empl.getSueldo());
		assertEquals("Empleado 2", "Pello", empl1.getNombre());
		assertEquals("Empleado 2", 1500, empl1.getSueldo());
		assertEquals("Empleado 2", "1Pello1500", empl1.toString());
		empl1.aumentarSueldo(20);
		assertEquals("Empleado 2", 31500, empl1.getSueldo());
		try {
			assertEquals("Ejecutivo 1", "Este empleado es un ejecutivo", empr.getEmpleado(2).toString());
			((Ejecutivo) empr.getEmpleado(2)).asignaPresupuesto(2500);
			assertEquals("Ejecutivo 1", 2500, ((Ejecutivo) empr.getEmpleado(2)).getPresupuesto());
		} catch (Excepcion e) {
			System.out.println(e.getMessage());
		}
	}

}
