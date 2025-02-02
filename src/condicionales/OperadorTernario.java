package condicionales;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		//Programa que dependiendo del promedio de un alumno,  diga si aprobó o no una materia
		
		// Declaracion de variables
		double promedio;
		String condicionFinal;
		
		//Pedirle al usuario que ingrese el promedio por teclado
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el promedio del alumno: ");
		promedio = teclado.nextDouble();
		
		condicionFinal = (promedio >= 6)?"Aprobado":"Desaprobado";
		
		System.out.println("La condicion final del alumno es: " + condicionFinal + ".");
		

	}

}
