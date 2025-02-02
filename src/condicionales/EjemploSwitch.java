package condicionales;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		/**
		 * Esta estructura permite multiples caminos a una sola condicion.
		 * Lo que se evalua debe de ser una valor simple.
		 * Se edjcuta por medio de un conjunto den sentencias "Case", hasta 
		 * que se ejecute la ultima linea representada por "break"
		 */
	
		//Declaracion de variables
		int dia;
		String nombreDia;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingrese un numero del 1 al 7: ");
		dia = teclado.nextInt(); //Lee por teclado el dia de la semana
		
		switch (dia) {
		   case 1: nombreDia = "Lunes";
		   	break;
		   case 2: nombreDia = "Martes";
		   	break;
		   case 3: nombreDia = "Miercoles";
		   	break;
		   case 4: nombreDia = "Jueves";
		   	break;
		   case 5: nombreDia = "Viernes";
		   	break;
		   case 6: nombreDia = "Sabado";
		   	break;
		   
		   
		
		}
		
	}

}
