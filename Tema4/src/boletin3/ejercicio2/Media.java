package boletin3.ejercicio2;

public class Media {
	
	/**
	 * Calcula la media de los dos numeros enteros pasados por parametros
	 * @param numero1
	 * @param numero2
	 * @return Media de los dos numeros enteros
	 */
	public static int media(int numero1, int numero2) {
		
		// Creamos la variable media a devolver
		int media;
		
		// Calculamos la media de los dos numeros enteros
		media = (numero1 + numero2) / 2;
		
		// Devolvemos la media de los dos numeros
		return media;
	}
	
	
	/**
	 * Calcula la media de los dos numeros decimales pasados por parametros
	 * @param numero1
	 * @param numero2
	 * @return Media de los dos numeros decimales
	 */
	public static double media(double numero1, double numero2) {
		
		// Creamos la variable media a devolver
		double media;
		
		// Calculamos la media de los dos numeros decimales
		media = (numero1 + numero2) / 2;
		
		// Devolvemos la media de los dos numeros
		return media;
	}
	
}
