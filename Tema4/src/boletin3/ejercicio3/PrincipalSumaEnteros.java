package boletin3.ejercicio3;

import java.util.Scanner;

public class PrincipalSumaEnteros {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero que introduzca el usuario
		int numero;
		
		// Creamos la variable numero2 para almacenar el otro numero que introduzca el usuario
		int numero2;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		System.out.println("SUMA DE TODOS LOS NÚMEROS ANTERIORES" + "\n");
		
		// Pedimos al usuario que introduzca el numero
		System.out.println("Introduzca un numero");
		numero = reader.nextInt();
		
		// Llamamos a la funcion e imprimimos su resultado
		System.out.println("Resultado -> " + SumaEnteros.sumaEnteros(numero));
		
		// Salto de linea x2
		System.out.println("\n");
		
		System.out.println("SUMA DE TODOS LOS NÚMEROS DEL RANGO" + "\n");
		
		// Pedimos al usuario que introduzca los dos numeros del rango
		do {
			// Pedimos al usuario que introduzca el primer numero
			System.out.println("Introduzca el primer número");
			numero = reader.nextInt();
			
			// Pedimos al usuario que introduzca el otro numero
			System.out.println("Introduzca el segundo número");
			numero2 = reader.nextInt();
		
		// Si los numeros son iguales volvemos a preguntar
		} while (numero == numero2);
		
		
		// Llamamos a la funcion e imprimimos su resultado
		System.out.println("Resultado -> " + SumaEnteros.sumaEnteros(numero, numero2));
		
		// Cerramos el scanner
		reader.close();
	}

}
