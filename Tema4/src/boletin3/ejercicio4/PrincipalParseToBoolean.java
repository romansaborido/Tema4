package boletin3.ejercicio4;

import java.util.Scanner;

public class PrincipalParseToBoolean {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable palabra para almacenar la palabra que introduzca el usuario
		String cadena;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduza un 0 o un 1
		do {
			System.out.println("ParseToBoolean NUMERO. Introduzca 0 o 1");
			numero = reader.nextInt();
		} while (numero != 0 && numero != 1);
		
		// Llamamos a la funcion e imprimimos su resultado
		System.out.println(ParseToBoolean.parseToBoolean(numero));
		
		// Pedimos al usuario que introduzca "true" o "false"
		do {
			System.out.println("ParseToBoolean STRING. Introduzca 'true' o 'false'");
			cadena = reader.nextLine();
		} while (!cadena.equalsIgnoreCase("true") && !cadena.equalsIgnoreCase("false"));
		
		// Llamamos a la funcion e imprimimos su resultado
		System.out.println(ParseToBoolean.parseToBoolean(cadena));
		
		// Cerramos el scanner
		reader.close();

	}

}
