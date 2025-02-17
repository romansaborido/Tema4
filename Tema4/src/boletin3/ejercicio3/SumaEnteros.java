package boletin3.ejercicio3;

public class SumaEnteros {
	
	public static int sumaEnteros(int numero) {
		
		int res;
		
		if (numero == 1) {
			res = 0;
		} else {
			res = sumaEnteros(numero - 1);
		}
		return res;
	}
	
}
