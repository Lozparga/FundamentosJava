package condicionales;
import java.util.Scanner;

public class EjercicioMerceria {

	public static void main(String[] args) {
		/**
		 * Una merceria vende "Canutillos y mostacillas" al por mayor mediante su pagina web. 
		 * Como se trata de una merceria mayorista, solicita la cantidad de paquetes de cada venta
		 * y dependiendo de esta realiza los siguientes controles:
		 * 
		 * - Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que 
		 * no se permiten compras inferiores a 5 productos.
		 * - Si la cantidad de productos es mayor de 5 pero menor o igual a 15: Se debe emitir 
		 * un mensaje que el costo de envio es de $10 USD
		 * - Si la cantidad de productos es mayor a 15: Se debe emitir un mensaje de que el envio es gratuito.
		 * 
		 * Realizar el programa para llevar a cabo los 3 controles.
		 */

		int cantidadPaquete;
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de paquetes a comprar: ");
		cantidadPaquete = teclado.nextInt();
		
		//Evaluar los casos
		if (cantidadPaquete < 5) {
			System.out.println("No se permiten compras minoristas.");
		}
		else {
			if (cantidadPaquete >= 5 && cantidadPaquete <= 15) {
				System.out.println("El costo del envio es de $10 USD. ¡Gracias por su compra!");
			}
			else {
				System.out.println("No tiene costo de envio. ¡Muchas gracias por su compra!");
			}
		} 
	}
}
