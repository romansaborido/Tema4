package boletin2.ejercicio1;

public class CuentaCorriente {

	// Creamos el atributo dni para almacenar el dni del titular de la cuenta
	private String dni;

	// Creamos el atributo nombre para almacenar el nombre del titular de la cuenta
	private String nombre;

	// Creamos el atributo saldo para almacenar el saldo que contiene la cuenta
	private int saldo;

	// Creamos el atributo nacionalidad para almacenar la nacionalidad del titularde la cuenta
	private String nacionalidad;

	
	
	/**
	 * Crea el objeto partiendo del dni del titular de la cuenta y un saldo inicial
	 * @param dni. No puede ser nulo ni estar en blanco. Tiene que tener 9 caracteres
	 * @param saldoInicial. Tiene que ser mayor o igual a 1
	 */
	public CuentaCorriente(String dni, int saldoInicial) {

		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		
		if (saldoInicial >= 1) {
			this.saldo = saldoInicial;
		}
	}

	
	/**
	 * Crea el objeto partiendo del dni del titular de la cuenta, su nombre y un saldo inicial
	 * @param dni. No puede ser nulo ni estar en blanco. Tiene que tener 9 caracteres
	 * @param nombre. No puede ser nulo ni estar en blanco
	 * @param saldoInicial. Tiene que ser mayor o igual a 1
	 */
	public CuentaCorriente(String dni, String nombre, int saldoInicial) {

		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}

		if (saldoInicial >= 1) {
			this.saldo = saldoInicial;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	
	/**
	 * Crea el objeto utilizando todos los atributos posibles
	 * @param dni. No puede ser nulo ni estar en blanco. Tiene que tener 9 caracteres
	 * @param nombre. No puede ser nulo ni estar en blanco
	 * @param saldoInicial. Tiene que ser mayor o igual a 1
	 * @param nacionalidad. Tiene que ser "Española" o "Extranjera"
	 */
	public CuentaCorriente(String dni, String nombre, int saldoInicial, String nacionalidad) {

		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}

		if (saldoInicial >= 1) {
			this.saldo = saldoInicial;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (nacionalidad.equalsIgnoreCase("española") || nacionalidad.equalsIgnoreCase("extranjera")) {
			this.nacionalidad = nacionalidad;
		}
	}

	
	
	/**
	 * Devuelve el dni del titular de la cuenta
	 * @return Dni del titular de la cuenta
	 */
	public String getDni() {

		return this.dni;

	}

	
	/**
	 * Devuelve el nombre del titular de la cuenta
	 * @return Nombre del titular de la cuenta
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Modifica el nombre del titular de la cuenta
	 * @param nombre. No puede ser nulo ni estar en blanco
	 */
	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	
	/**
	 * Devuelve la nacionalidad del titular de la cuenta
	 * @return Española o Extranjera
	 */
	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * Modifica la nacionalidad del titular de la cuenta
	 * @param nacionalidad. Tiene que ser "española" o "extranjera"
	 */
	public void setNacionalidad(String nacionalidad) {

		if (nacionalidad.equalsIgnoreCase("española") || nacionalidad.equalsIgnoreCase("extranjera")) {
			this.nacionalidad = nacionalidad;
		}
	}

	
	/**
	 * Obtiene el saldo que hay en la cuenta
	 * @return Saldo que hay en la cuenta
	 */
	public int getSaldo() {
		return this.saldo;
	}

	
	
	/**
	 * Metodo para retirar dinero de la cuenta
	 * @param cantidad. Tiene que ser menor o igual que el saldo que hay en la cuenta
	 * @return Devuelve true si se puede retirar el dinero, false si no se puede
	 */
	public boolean sacarDinero(int cantidad) {

		boolean esPosible = false;

		// Si disponemos de la cantidad que queremos retirar
		if (this.saldo >= cantidad) {
			this.saldo -= cantidad;
			esPosible = true;
		}
		
		return esPosible;

	}

	
	/**
	 * Metodo para ingresar dinero a la cuenta
	 * @param cantidad. Tiene que ser positiva
	 * @return Devuelve true si se puede ingresar el dinero, false si no se puede
	 */
	public boolean ingresarDinero(int cantidad) {

		boolean esPosible = false;

		// Si la cantidad que queremos ingresar es mayor que 0
		if (cantidad > 0) {
			this.saldo += cantidad;
			esPosible = true;
		}

		return esPosible;
	}
	

	/**
	 * Metodo toString que devuelve los atributos de la cuentaCorriente
	 */
	@Override
	public String toString() {

		String cuentaCorriente = "";

		// Convertimos el objeto en cadena
		cuentaCorriente += "Cuenta de " + this.nombre + " con DNI " + this.dni + " de nacionalidad " + this.nacionalidad
		+ "\n" +
		"Saldo -> " + this.saldo;
		
		return cuentaCorriente;
	}

	
	/**
	 * Metodo equals que determina si una cuenta es igual que otra si el dni y el nombre son los mismos
	 */
	@Override
	public boolean equals(Object obj) {

		boolean sonIguales = false;

		CuentaCorriente otraCuenta = (CuentaCorriente) obj;

		// Si el dni y el nombre son iguales
		if (this.dni == otraCuenta.dni && this.nombre == otraCuenta.nombre) {
			sonIguales = true;
		}
		
		return sonIguales;
	}

}
