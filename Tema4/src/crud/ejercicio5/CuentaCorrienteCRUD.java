package crud.ejercicio5;

import java.util.HashSet;

public class CuentaCorrienteCRUD {

	// Creamos un conjunto para almacenar las cuentas de los usuarios
	HashSet<CuentaCorriente> cuentas = new HashSet<>();
	
	
	public boolean ingresarDinero(String dni, int cantidad) {
		
		boolean res = false;
		
		CuentaCorriente cuenta = buscarCuenta(dni);
		
		if (cuenta != null) {
			
			
			
			
			
		}
		
		return res;
	}
	
	public CuentaCorriente buscarCuenta(String dni) {
		
		CuentaCorriente cuenta = null;
		
		for (CuentaCorriente c : cuentas) {

			if (dni == c.getDni()) {
				cuenta = c;
			}
		}
		
		return cuenta;
	}
}
