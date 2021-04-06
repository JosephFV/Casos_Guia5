package com.senati.eti.modelo;

public class Calculadora {
	// Definición de los atributos
	private float numero1;
	private float numero2;
	
	// Obtener y Establecer el valor del atributo
	// Getters an Setter
	public float getNumero1() {
		return this.numero1;
	}
	
	public void setNumero1(float n1) {
		this.numero1 = n1;		
	}
	
	public float getNumero2(){
		return this.numero2;
	}
	
	public void setNumero2(float n2) {
		this.numero1 = n2;
	}
	
	// Métodos Constructores (Polimorfismo)
	public Calculadora(){
		
	}
	
	public Calculadora(float n1, float n2){
		this.numero1 = n1;
		this.numero2 = n2;		
	}
	
	// Métodos Solicitados
	public float Suma() {
		return this.numero1 + this.numero2;
	}
	
	public float Resta() {
		return this.numero1 - this.numero2;
	}
	
	public float Producto() {
		return this.numero1 * this.numero2;
	}
	
	public float Division() {
		float r = 0;
		if(this.numero2 != 0)
			r = this.numero1 / this.numero2;
		
		return r;
	}
	
	public float RestoEntero() {
		float r = 0;
		
		if (this.numero2 != 0)
			r = this.numero1 % this.numero2;
		return r;
	}

	//Método para hallar el mayor de los números
	public float Mayor() {
		float m = this.numero1;
		
		if (this.numero2 > this.numero1)
			m = this.numero2;
		return m;
	}
	
	public float Menor() {
		float m = this.numero1;
		
		if (this.numero2 < this.numero1)
			m = this.numero2;
		return m;
	}
}


