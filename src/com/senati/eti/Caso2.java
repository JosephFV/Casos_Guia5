package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.modelo.Calculadora2;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer Número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo Número: ");
		float n2 = sc.nextFloat();
		
		Calculadora2 calc = new Calculadora2(n1, n2);
		
		calc.setNumero1(n1);
		calc.setNumero2(n2);
		
		System.out.println("\n----------------------------");
		System.out.println(">>>> NÚMEROS INGRESADOS <<<<");
		System.out.println("----------------------------");
		System.out.println("Número 1: " + calc.getNumero1());
		System.out.println("Número 2: " + calc.getNumero2());
		System.out.println("\n--------------------");
		System.out.println(">>>> RESULTADOS <<<<");
		System.out.println("--------------------");
		System.out.println("1. Suma........: " + calc.Operar(1));
		System.out.println("2. Resta.......: " + calc.Operar(2));
		System.out.println("3. Producto....: " + calc.Operar(3));
		if (calc.getNumero2() == 0) {
			System.out.println("4. División...: No es posible");
		}
		else {
			System.out.println("4. División...: " + calc.Operar(4));
			System.out.println("5. Resto entero: " + calc.Operar(5));
		}
		if (calc.getNumero1() > calc.getNumero2()) {
			System.out.println("6. Mayor......: " + calc.Operar(7));
		}
		else {
			System.out.println("6. Mayor.....: " + calc.Operar(6));
		}
		if (calc.getNumero1() < calc.getNumero2()) {
			System.out.println("7. Menor.....: " + calc.Operar(9));
		}
		else
			System.out.println("7. Menor.....: " + calc.Operar(8));
	}

	}


