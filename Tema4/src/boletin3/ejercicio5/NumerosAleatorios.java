package boletin3.ejercicio5;

import java.util.Random;

public class NumerosAleatorios {
	
	public static String numerosAleatorios(int numero) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos la variable resultado
		String res = "";
		
		// Generamos los numeros aleatorios y los concatenamos al resultado
		for (int i = 0 ; i < numero ; i++) {
			res += rand.nextInt(0,2) + " ";
		}
		
		// Devolvemos el resultado
		return res;
	}
	
	
	public static String numerosAleatorios(int numero, int max) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos la variable resultado
		String res = "";
		
		// Generamos los numeros aleatorios y los concatenamos al resultado
		for (int i = 0 ; i < numero ; i++) {
			res += rand.nextInt(0,max) + " ";
		}
		
		// Devolvemos el resultado
		return res;
	}
	
	
	public static String numerosAleatorios(int numero, int max, int min) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos la variable resultado
		String res = "";
		
		// Generamos los numeros aleatorios y los concatenamos al resultado
		for (int i = 0 ; i < numero ; i++) {
			res += rand.nextInt(min,max) + " ";
		}
		
		// Devolvemos el resultado
		return res;
	}
	
}
