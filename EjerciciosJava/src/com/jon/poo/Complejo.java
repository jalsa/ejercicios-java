package com.jon.poo;

public class Complejo {
	
	private double pReal;
	private double pImag;
	private static int contador = 0;
	
	public Complejo() {
		this.pReal = 1.0;
		this.pImag = 1.0;
		contador++;
	}
	
	public Complejo(double x, double y) {
		this();
		this.pReal = x;
		this.pImag = y;
	}
	
	public Complejo asignar(double x, double y) {
		this.pReal = x;
		this.pImag = y;
		return this;
	}
	
	public double getpReal() {
		return pReal;
	}
	
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}
	
	public double getpImag() {
		return pImag;
	}
	
	public void setpImag(double pImag) {
		this.pImag = pImag;
	}
	
	public void sumar(Complejo b) {
		this.pReal = this.pReal + b.getpReal();
		this.pImag = this.pImag + b.getpImag();
	}
	
	public static Complejo sumar(Complejo x, Complejo y) {
		// 1
		Complejo c = new Complejo();
		c.setpReal(x.getpReal() + y.getpReal());
		c.setpImag(x.getpImag() + y.getpImag());
		// 2
		//Complejo c = new Complejo(x.getpReal() + y.getpReal(), x.getpImag() + y.getpImag());
		// 3
		//c = c.asignar(x.getpReal(), x.getpImag());
		//c.sumar(y);
		return c;
	}
	
	public boolean equals(Complejo c1) {
		if (this.pReal == c1.getpReal() && this.pImag == c1.getpImag()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Nœmero real: " + this.pReal + " Nœmero imaginario: " + this.pImag;
	}
	
	public static int getNumInstancias() {
		return contador;
	}
}
