package boletin3.ejercicio1;

public class Suma {
	
	/**
	 * Suma los dos numeros enteros pasados por parametros
	 * @param numero1
	 * @param numero2
	 * @return Resultado de sumar los dos numeros enteros
	 */
	static public int sumar(int numero1, int numero2) {
		
		// Creamos la variable a devolver llamada resultado
		int resultado;
		
		// Realizamos la suma de los dos numeros y los almacenamos en resultado
		resultado = numero1 + numero2;
		
		// Devolvemos el resultado de la suma
		return resultado;
	}
	
	
	/**
	 * Suma los dos numeros decimales pasados por parametros
	 * @param numero1
	 * @param numero2
	 * @return Resultado de sumar los dos numeros decimales
	 */
	static public double sumar(double numero1, double numero2) {
		
		// Creamos la variable a devolver llamada resultado
		double resultado;
				
		// Realizamos la suma de los dos numeros y los almacenamos en resultado
		resultado = numero1 + numero2;
				
		// Devolvemos el resultado de la suma
		return resultado;
	}
	
}
