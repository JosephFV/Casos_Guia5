package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

import com.senati.eti.modelo.Alumno;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Conjunto de datos de tipo alumno
		ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
		
		// Forma 1 de ingresar datos
		Alumno al1 = new Alumno();
		al1.setNombre("Joe");
		al1.setApellido("Castillo");
		al1.setGenero("M");
		al1.setEdad(25);
		
		// Forma 2 de ingresar datos
		Alumno al2 = new Alumno("Rosa", "Flores", "F", 15);
		
		// Forma 3 de ingresar datos
		
		String nom = "", ape = "", gen = "";
		int ed = 0;
		
		Alumno al3 = null;
		
		System.out.println("---------------------------");
		System.out.println(">>>> REGISTRO DE DATOS <<<<");
		System.out.println("---------------------------");
		System.out.print("Nombre..........: ");
		nom = sc.nextLine();
		System.out.print("Apellido........: ");
		ape = sc.nextLine();
		System.out.print("Género [M/F]....: ");
		gen = sc.nextLine();
		System.out.print("Edad [15-30]....: ");
		ed = sc.nextInt();
		
		al3 = new Alumno(nom, ape, gen, ed);
		
		// Agregar los objetos Alumno al Conjunto de datos de tipo Alumno
		arrAlumno.add(al1);
		arrAlumno.add(al2);
		arrAlumno.add(al3);
		
		// Impresión del Arraylist
		System.out.println("\n---------------------------");
		System.out.println(">>>> DATOS REGISTRADOS <<<<");
		System.out.println("---------------------------\n");
		
		String patron = "%-4s %-20s %-10s %-15s";
		
		System.out.println(String.format(patron, "---", "-------------------", "------", "------"));
		System.out.println(String.format(patron, " N ", "Nombres y Apellidos", "Género", "Estado"));
		System.out.println(String.format(patron, "---", "-------------------", "------", "------"));
		
		for (int x = 0; x < arrAlumno.size(); x++) {
			System.out.println(String.format(patron, (x + 1), arrAlumno.get(x).NombreCompleto(),
					arrAlumno.get(x).MostrarGenero(), arrAlumno.get(x).MostrarEstado()));
			
		}
		
	}

}
