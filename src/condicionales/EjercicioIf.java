package condicionales;

import java.util.Scanner;

public class EjercicioIf {

	public static void main(String[] args) {
		
		int edad;
		Scanner  teclado = new Scanner(System.in);
	
		System.out.println("Ingrese la edad: ");
		edad = teclado.nextInt();
		
		if (edad > 18) {
			System.out.println("¡Eres mayor de edad! Felicitaciones");
			}
		else {
			if (edad == 18) {
				System.out.println("Tienes exactamente 18 años");
			}
			else {
				System.out.println("No puedes acceder. Eres menor de edad :(");
			}
		System.out.println("Fin del programa");
		
		
		}
		
	}

}
