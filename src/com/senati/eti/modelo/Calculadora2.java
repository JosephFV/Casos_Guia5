package com.senati.eti.modelo;

public class Calculadora2 {
	private float numero1;
	private float numero2;
	
	public float getNumero1() {
		return numero1;
	}
	
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	
	public float getNumero2() {
		return numero2;
	}
	
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}

	public Calculadora2() {
		super();
	}

	public Calculadora2(float numero1, float numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	// Métodos Solicitados
	public float Operar(int opc) {
		float rp = 0;
		
		switch (opc) {
			case 1:
				rp = this.numero1 + this.numero2;
				break;
			case 2:
				rp = this.numero1 - this.numero2;
				break;
			case 3:
				rp = this.numero1 * this.numero2;
				break;
			case 4:
				rp = this.numero1 / this.numero2;
				break;
			case 5:
				rp = this.numero1 % this.numero2;
			case 6:				
				if (this.numero2 > this.numero1)
					rp = this.numero2;
					break;
			case 7:
				if (this.numero1 > this.numero2)
					rp = this.numero1;
					break;
				
			case 8:				
				if (this.numero1 < this.numero2)
					rp = this.numero1;
					break;
			case 9:
				if(this.numero2 < this.numero1)
					rp = this.numero2;
					break;
				
				
		}
		return rp;
		
		
	
	}
	
	

}
