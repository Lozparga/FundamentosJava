package condicionales;

import java.util.Scanner;

public class EjericioMerceriaParteDos {

	public static void main(String[] args) {
		
		/** PARTE 2
		 * Solicitar, ademas de la cantidad de paquetes, 
		 * el costo total que suma la compra en USD y asi aplicar a las siguientes promociones:
		 * - Si el monto total es inferior a 100 USD: No hay promociones. Informar cuantos USD mas necesita 
		 * para poder entrar a una promocion.
		 * - Si el monto supera los 100 USD pero es menor a los 300: Informar que posee en un 
		 * descuento del 5% sobre el total. Especificart cuanto seria el nuevo monto total con descuento.
		 * - Si el monto supera los 300 USD: Informar que posee un descuento del 10%. Especificar cuanto 
		 * seria el nuevo monto total con descuento. 
		 */
		
		
		int cantidadPaquete;
		double montoTotal, diferencia, descuento, totalConDescuento;
		
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de paquetes a comprar: ");
		cantidadPaquete = teclado.nextInt();
		
		
		//Evaluar los casos
		if (cantidadPaquete < 5) {
			System.out.println("No se permiten compras minoristas.");
		}
		else {
				System.out.println("Ingrese el monto total de la compra: ");
				teclado = new Scanner(System.in);
				montoTotal = teclado.nextDouble();
			
				if (cantidadPaquete >= 5 && cantidadPaquete <= 15) {
					System.out.println("El costo del envio es de $10 USD. ¡Gracias por su compra!");
					montoTotal = montoTotal + 10; // o se puede usar: montoTotal
					
					
				}
				else {
					System.out.println("No tiene costo de envio. ¡Muchas gracias por su compra!");
			}
				
				if (montoTotal < 100) {
					diferencia = 100 - montoTotal;
					
					System.out.println("El monto es menor a 100, por lo cual no tienes promocion. Necesiat comprar: "+ diferencia + "USD para entrar a una promo");
				}
				else {
					if (montoTotal >= 100 && montoTotal <= 300) {
						descuento = montoTotal * 0.05; 
						totalConDescuento = montoTotal - descuento;
						System.out.println("Por su compra tiene un descuento del 5% que equivale a: " + descuento + 
							". El monto total con descuento es de: " + totalConDescuento);
					}
					else {
						descuento = montoTotal * 0.10; 
						totalConDescuento = montoTotal - descuento;
						System.out.println("Por su compra tiene un descuento del 10% que equivale a: " + descuento + 
							". El monto total con descuento es de: " + totalConDescuento);
					
				}
					
			}
		} 
		
	}

}


