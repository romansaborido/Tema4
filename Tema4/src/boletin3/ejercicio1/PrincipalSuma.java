package boletin3.ejercicio1;

import java.util.Scanner;

public class PrincipalSuma {

	public static void main(String[] args) {
		
		// Creamos las variables enteras numero1 y numero2 para almacenar los dos numeros enteros que introduzca el usuario
		int numero1Int;
		int numero2Int;
		
		// Creamos las variables doubles numero1 y numero2 para almacenar los dos numeros decimales que introduzca el usuario
		double numero1Double;
		double numero2Double;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		System.out.println("SUMA DOS NÚMEROS ENTEROS" + "\n");
		
		// Pedimos al usuario que introduzca el numero1
		System.out.println("Introduzca el primer numero entero");
		numero1Int = reader.nextInt();
		
		// Pedimos al usuario que introduzca el numero2
		System.out.println("Introduzca el segundo numero entero");
		numero2Int = reader.nextInt();
		
		// Llamamos a la funcion sumar e imprimimos el resultado
		System.out.println("Resultado -> " + Suma.sumar(numero1Int,numero2Int));
		
		// Salto de linea x2
		System.out.println("\n");
		
		System.out.println("SUMA DOS NÚMEROS DECIMALES" + "\n");
		
		// Pedimos al usuario que introduzca el numero1
		System.out.println("Introduzca el primer numero decimal");
		numero1Double = reader.nextDouble();
		
		// Pedimos al usuario que introduzca el numero2
		System.out.println("Introduzca el segundo numero decimal");
		numero2Double = reader.nextDouble();
		
		// Llamamos a la funcion sumar
		System.out.println("Resultado -> " + Suma.sumar(numero1Double,numero2Double));
		
		// Cerramos el scanner
		reader.close();
	}

}
