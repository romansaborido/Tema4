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
	
	
	/**
	 * Elimina una cuenta corriente del conjunto de cuentas
	 * @param cuenta Cuenta del titular que quiere darse de baja
	 * @return True si la cuenta se ha eliminado correctamente, false si no se ha podido eliminar
	 */
	static public boolean eliminarCuenta(CuentaCorriente cuenta) {
		
		// Creamos el booleano res y lo inicializamos a false
		boolean res = false;
		
		// Si hay dinero en la cuenta
		if (cuenta.getSaldo() == 0) {
			res = cuentas.remove(cuenta);
		}
		
		// Devolvemos el booleano
		return res;
	}
	
	
	/**
	 * Añade una cuenta corriente del conjunto de cuentas
	 * @param cuenta Cuenta del titular que quiere darse de alta
	 * @return True si la cuenta se ha añadido correctamente, false si no se ha podido añadir
	 */
	static public boolean añadirCuenta(CuentaCorriente cuenta) {
		return cuentas.add(cuenta);
	}
	
	
}

