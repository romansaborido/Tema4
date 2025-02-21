package boletin3.ejercicio6;

public class FuncionesMatematicas {
	
	public static int sumatorio(int numero) {
		
		// Creamos la variable resultado
		int res = 0;
		
		// Si el numero es 1 devolvemos 1
		if (numero == 1) {
			res = 1;
		
		// Si no hemos llegado al caso base seguimos sumando el numero anterior
		} else {
			res += numero + sumatorio(numero-1);
		}
		
		// Devolvemos el resultado
		return res;
	}
	
	
	public static double potencia(double a, int n) {
		
		// Creamos la variable resultado
		double res = 0;
		
		// Si el elevado es 0 devolvemos 1
		if (n == 0) {
			res = 1;
		
		// Si no hemos llegado al caso base multiplicamos de nuevo
		} else {
			res += a * potencia(a, n-1);
		}
		
		// Devolvemos el resultado
		return res;
	}
	
	
	public static int serieFibonacci(int numero) {
		
		// Creamos la variable resultado
		int res = 0;
		
		// Si el numero es 0 o 1 devolvemos 1
		if (numero == 0 || numero == 1) {
			res = 1;
			
		// Si no hemos llegado al caso base seguimos sumando los dos numeros anterioes
		} else {
			res += numero + serieFibonacci(numero-1) + serieFibonacci(numero-2);
		}
		
		// Devolvemos el resultado
		return res;
	}
}
