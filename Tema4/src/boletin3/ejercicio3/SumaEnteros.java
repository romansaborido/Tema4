package boletin3.ejercicio3;

public class SumaEnteros {
	
	/**
	 * Calcula la suma de todos los numeros anteriores del numero pasado por parametro
	 * @param numero 
	 * @return Numero entero que es el resultado de la suma de todos los numeros anteriores del numero pasado por parametro
	 */
	public static int sumaEnteros(int numero) {
		
		// Creamos la variable resultado
		int res;
		
		// Si el numero es 1 devolvemos 1
		if (numero == 1) {
			res = 1;
			
		// Si no hemos llegado al caso base seguimos sumando el numero anterior
		} else {
			res = numero + sumaEnteros(numero - 1);
		}
		
		// Devolvemos el resultado
		return res;
	}
	
	
	public static int sumaEnteros(int numero1, int numero2) {
		
		// Creamos la variable resultado
		int res = 0;
		
		// Creamos la variable numeroBase y numero para almacenar el numero mas pequeño y el mas grande
		int numeroBase = (numero1 < numero2) ? numero1 : numero2;
		int numero = (numero1 > numero2) ? numero1 : numero2;
			
		// Si llegamos al caso base devolvemos el numero base
		if (numero == numeroBase) {
			res = numeroBase;
			
		// Si no hemos llegado al case base seguimos sumando el numero anterior
		} else {
			res = numero + sumaEnteros(numero - 1);
		}
		
		// Devolvemos el resultado
		return res;
	}
	
}
