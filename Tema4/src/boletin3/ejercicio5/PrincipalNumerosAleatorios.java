package boletin3.ejercicio5;

import java.util.Scanner;

public class PrincipalNumerosAleatorios {

	public static void main(String[] args) {
		
		// Creamos la variable numero para almacenar el numero de numeros aleatorios a generar
		int numero;
		
		// Creamos la variable min para almacenar el numero minimo del rango de los numeros aleatorios
		int min;
		
		// Creamos la variable max para almacenar el numero maximo del rango de los numeros aleatorios
		int max;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero de numeros aleatorios que quiere generar
		System.out.println("Introduzca el número de numeros aleatorios a generar");
		numero = reader.nextInt();
		
		// Pedimos al usuario que introduzca el numero minimo del rango 
		System.out.println("Introduzca el número mínimo que quieres que se genere");
		min = reader.nextInt();
		
		// Pedimos al usuario que introduzca el numero maximo del rango
		System.out.println("Introduzca el número máximo que quieres generar");
		max = reader.nextInt();
		
		// Salto de linea
		System.out.println();
		
		// Utilizamos la primera funcion
		System.out.println(NumerosAleatorios.numerosAleatorios(numero));
		
		// Utilizamos la segunda funcion
		System.out.println(NumerosAleatorios.numerosAleatorios(numero, max));
		
		// Utilizamos la tercera funcion
		System.out.println(NumerosAleatorios.numerosAleatorios(numero, max, min));
		
		// Cerramos el scanner
		reader.close();
	}

}
