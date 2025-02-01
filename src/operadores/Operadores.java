package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner teclado = new Scanner(System.in);
		double num1, num2, suma, resta, multiplicacion, division;
			
		System.out.println("Ingrese el primer numero a operar: ");
		num1 = teclado.nextDouble();
		
		System.out.println("Ingrese el segundo numero a operar:");
		num2 = teclado.nextDouble();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		
		System.out.println("El resultado es: " + suma);
		System.out.println("El resultado es: " + resta);
		System.out.println("El resultado es: " + multiplicacion);
		System.out.println("El resultado es: " + division);
		
	}

}
