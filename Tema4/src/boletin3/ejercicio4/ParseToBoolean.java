package boletin3.ejercicio4;

public class ParseToBoolean {
	
	/**
	 * Pasa a booleano el valor 0 o 1
	 * @param numero Tiene que ser 0 o 1
	 * @return False si el numero es 0, true si el numero es 1
	 */
	public static boolean parseToBoolean(int numero) {
		
		// Creamos el booleano a devolver y lo inicializamos a false
		boolean parseToBoolean = false;
		
		// Si el numero es 0 devuelve false, si es 1 devuelve true
		parseToBoolean = (numero == 0) ? false : true; 
		
		// Devolvemos el resultado del booleano
		return parseToBoolean;
	}
	
	
	/**
	 * Pasa a booleano la cadena true o false
	 * @param cadena Tiene que ser "true" o "false"
	 * @return False si la cadena es "false", true si la cadena es "true"
	 */
	public static boolean parseToBoolean(String cadena) {
		
		// Creamos el booleano a devolver y lo inicializamos a false
		boolean parseToBoolean = false;
		
		// Si la cadena es "false" devuelve false, si es "true" devuelve true
		parseToBoolean = (cadena.equalsIgnoreCase("false")) ? false : true; 
		
		// Devolvemos el resultado del booleano
		return parseToBoolean;
	}
	
	
}
