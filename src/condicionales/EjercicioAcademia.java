package condicionales;

import java.util.Scanner;

public class EjercicioAcademia {

	public static void main(String[] args) {
		/** Una academia desea informar a sus alumnos los dias y horarios de sus clases.
		 * Para ello, decidio la creacion de una aplicacion que, a apartir del ingreso
		 * de la edad del alumno, le informe en que dias y hiorarios los alumnos tienen clases.
		 * Como informacion, la academia proporciona los siguientes datos rfespecto a los grupos y los diferentes horarios:
		 * 
		 * - Kinder (4 a 6 años): Lunes y miercoles de 16 a 17
		 * - Primer año (7 a 8): Martes y jueves de 16:30 a 17:30
		 * - Segundo año (9 a 10): Martes y jueves de 17:30 a 19
		 * - Tercer año (11 a 13): Lunes y miercoles de 17 a 18:30
		 * 
		 * Realizar progra,a solicitado por el instituro, donde a partir del ingreso de la EDAD del alumno,
		 * el sistema informe por pantalla los dias y horarios de cursada.
		 */

		//Declaracion de variables
		int edad;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("******* BIENVENIDO A LA ACADEMIA *******");
		System.out.println("Ingrese la edad del alumno del cual desea saber su horario de clases: ");
		
		edad = teclado.nextInt();
		
		if (edad >= 4 && edad <=6) {
			System.out.println("El horario de KINDER es de Lunes y Miercoles de 16 a 17.");
		}
		else {
			if (edad >= 7 && edad <= 8) {
				System.out.println("El horario de 1er Año es de Martes y jueves de 16:30 a 17:30.");
			}
			else {
				if (edad >= 9 && edad <= 10) {
					System.out.println("El horario de 2do Año es de Martes y jueves de 17:30 a 19.");
				}
				else {
					if (edad >= 11 && edad <= 13) {
						System.out.println("El horario de 3er Año es de Lunes y miercoles de 17 a 18:30.");
					}
					else {
						System.out.println("Ingresó una edad que no corresponde.");
					}
				}
			}
		}
	}
}
