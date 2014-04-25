package com.jon.factories;

import com.jon.validadores.Buzz;
import com.jon.validadores.Fizz;
import com.jon.validadores.Mozz;

public abstract class ValidadorFactoria {
	
	public static final Fizz getFizzValidador() {
		Fizz f = new Fizz();
		f.setValor("Fizz");
		return f;
	}
	
	public static final Buzz getBuzzValidador() {
		Buzz b = new Buzz();
		b.setValor("Buzz");
		return b;
	}
	
	public static final Mozz getMozzValidador() {
		Mozz m = new Mozz();
		m.setValor("Mozz");
		return m;
	}
	
}
