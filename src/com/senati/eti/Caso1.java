package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.modelo.Calculadora;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Primer N�mero: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Segundo N�mero: ");
		float n2 = sc.nextFloat();
		
		calc.setNumero1(n1);
		calc.setNumero2(n2);
		
		System.out.println("\n----------------------------");
		System.out.println(">>>> N�MEROS INGRESADOS <<<<");
		System.out.println("----------------------------");
		System.out.println("N�mero 1: " + calc.getNumero1());
		System.out.println("N�mero 2: " + calc.getNumero2());
		System.out.println("\n--------------------");
		System.out.println(">>>> RESULTADOS <<<<");
		System.out.println("--------------------");
		System.out.println("1. Suma........: " + calc.Suma());
		System.out.println("2. Resta.......: " + calc.Resta());
		System.out.println("3. Producto....: " + calc.Producto());
		if (calc.getNumero2() == 0) {
			System.out.println("4. Divisi�n...: No es posible");
		}
		else {
			System.out.println("4. Divisi�n...: " + calc.Division());
			System.out.println("5. Resto entero: " + calc.RestoEntero());
		}
		System.out.println("6. Mayor........: " + calc.Mayor());
		System.out.println("7. Menor........: " + calc.Menor());
	}
		

}
