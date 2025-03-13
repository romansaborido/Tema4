package crud.ejercicio5;

import java.util.HashSet;

public class CuentaCorrienteCRUD {

	// Creamos un conjunto para almacenar las cuentas de los usuarios
	HashSet<CuentaCorriente> cuentas = new HashSet<>();
	
	
	/**
	 * Busca una cuenta corriente a partir de un dni y aumenta el sueldo la cantidad indicada
	 * @param dni Dni del titular de la cuenta
	 * @param cantidad Cantidad de dinero a ingresar. Tiene que ser mayor que 0
	 * @return True si se ha podido ingresar el dinero, false si no se ha podido
	 */
	public boolean ingresarDinero(CuentaCorriente cuenta, int cantidad) {
		
		// Creamos un booleano y lo inicializamos a false
		boolean res = false;
			
		// Obtenemos el saldo de la cuenta
		int saldo = cuenta.getSaldo();
		
		// Ingresamos el dinero
		if (cantidad > 0) {
			res = cuenta.setSaldo(saldo + cantidad);
		}
		
		return res;
	}
	
	
	
	/**
	 * Busca una cuenta corriente a partir de un dni y decrementa el sueldo la cantidad indicada
	 * @param dni Dni del titular de la cuenta
	 * @param cantidad Cantidad de dinero a retirar. Tiene que ser menor o igual al saldo actual
	 * @return True si se ha podido retirar el dinero, false si no se ha podido
	 */
	public boolean sacarDinero(CuentaCorriente cuenta, int cantidad) {
		
		// Creamos un booleano y lo inicializamos a false
		boolean res = false;
		
		// Creamos una variable saldo para almacenar el saldo de la cuenta
		int saldo;
		
		// CORREGIR
		
		// Si la cuenta se ha encontrado
		if (cuenta != null) {
			
			// Obtenemos el saldo de la cuenta
			saldo = cuenta.getSaldo();
			
			// Ingresamos el dinero
			if (cantidad <= saldo) 
				res = cuenta.setSaldo(saldo - cantidad);
		}
		
		return res;
	}
	
	
	/**
	 * Busca una cuenta corriente a partir del dni del titular de la cuenta
	 * @param dni Dni del titular de la cuenta
	 * @return Cuenta existente si se ha encontrado o cuenta a null si no se ha encontrado
	 */
	public CuentaCorriente buscarCuenta(String dni) {
		
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
