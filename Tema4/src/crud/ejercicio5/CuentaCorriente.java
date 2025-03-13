package crud.ejercicio5;

import java.util.Objects;

public class CuentaCorriente {
	
	private String dni;
	private int saldo;
	private String nacionalidad;
	private String nombre;
	
	
	public CuentaCorriente(String dni) {
		
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
	}
	
	
	public CuentaCorriente(String dni, int saldo, String nacionalidad, String nombre) {
		
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		
		if (saldo > 0) {
			this.saldo = saldo;
		}
		
		if (nacionalidad != null && !nacionalidad.isBlank()) {
			this.nacionalidad = nacionalidad;
		}
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	
	public String getDni() {
		return this.dni;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public boolean setSaldo(int saldo) {
		
		boolean res = false;
		
		if (saldo >= 0) {
			this.saldo = saldo;
			res = true;
		}
		
		return res;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		boolean res = false;
		
		CuentaCorriente cuenta = (CuentaCorriente) obj;
		
		if (this.dni == cuenta.dni) {
			res = true;
		}
		
		return res;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	
}
