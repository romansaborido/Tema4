package crud.ejercicio5;

import java.util.HashSet;

public class CuentaCorrienteCRUD {

	// Creamos un conjunto para almacenar las cuentas de los usuarios
	private static HashSet<CuentaCorriente> cuentas = new HashSet<>();
	
	
	/**
	 * Busca una cuenta corriente a partir del dni del titular de la cuenta
	 * @param dni Dni del titular de la cuenta
	 * @return Cuenta existente si se ha encontrado o cuenta a null si no se ha encontrado
	 */
	public static CuentaCorriente buscarCuenta(String dni) {
		
		// Creamos una cuenta corriente y la inicializamos a null
		CuentaCorriente cuenta = null;
		
		// Recorremos las cuentas
		for (CuentaCorriente c : cuentas) {
			
			// Si el dni del titular de la cuenta es igual que el dni pasado por parámetro
			if (dni == c.getDni()) {
				
				// Obtenemos la cuenta
				cuenta = c;
			}
		}
		
		// Devolvemos la cuenta
		return cuenta;
	}
}
