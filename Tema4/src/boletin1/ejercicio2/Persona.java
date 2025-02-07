package boletin1.ejercicio2;

public class Persona {
	
	// Creamos el atributo dni para almacenar el dni de la persona
	private String dni;
	
	// Creamos el atributo nombre para almacenar el nombre de la persona
	private String nombre;
	
	// Creamos el atributo apellidos para almacenar los apellidos de la persona
	private String apellidos;
	
	// Creamos el atributo edad para almacenar la edad de la persona
	private int edad;
	
	
	/**
	 * Constructor con todos los atributos
	 * @param dni. No puede ser null o blanco y tiene que tener 9 caracteres
	 * @param nombre. No puede ser null o blanco
	 * @param apellidos. No puede ser null o blanco
	 * @param edad. Tiene que ser mayor que 0
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}
	
	
	/**
	 * Devuelve el dni de la persona
	 * @return
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Devuelve el nombre de la persona
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve los apellidos de la persona
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Devuelve la edad de la persona
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	
	
	/**
	 * Modifica el nombre de la persona
	 * @param nombre. Comprobamos que no este a null o en blanco
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Modifica los apellidos de la persona
	 * @param apellidos. Comprobamos que no este a null o en blanco
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}
	
	/**
	 * Modifica la edad de la persona
	 * @param edad. Comprobamos que la edad sea mayor que 0
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}
	
	
	/**
	 * Muestra si la persona es mayor de edad o es menor de edad
	 * @return Booleano true si es mayor de edad, false si es menor de edad
	 */
	public boolean esMayorEdad() {
		
		boolean esMayorEdad = false;
		
		if (this.edad >= 18) {
			esMayorEdad = true;
		}
		
		return esMayorEdad;
	}
	
	/**
	 * Muestra si la persona esta jubilada o no
	 * @return Booleano true si tiene 65 años o mas, false si tiene menos de 65
	 */
	public boolean esJubilado() {
		
		boolean esJubilado = false;
		
		if (this.edad >= 65) {
			esJubilado = true;
		}
		
		return esJubilado;
	}
	
	/**
	 * Devuelve la diferencia de edad de una persona y otra
	 * @param p Objeto persona llamado p
	 * @return Diferencia de edad
	 */
	public int diferenciaEdad(Persona p) {
		
		int diferenciaEdad = 0;
		
		if (this.edad != p.edad) {
			
			int edadMasGrande = this.edad > p.edad ? this.edad : p.edad;
			int edadMasPequeña = this.edad < p.edad ? this.edad : p.edad;
			
			diferenciaEdad = edadMasGrande - edadMasPequeña;
		}
		
		return diferenciaEdad;
	}
	
	/**
	 * Devuelve una cadena con la informacion del objeto
	 */
	public String toString() {
		String toString = "DNI: " + this.dni + "\n";
		toString += "NOMBRE: " + this.nombre + "\n";
		toString += "APELLIDOS: " + this.apellidos + "\n";
		toString += "EDAD: " + this.edad + "\n";
		
		return toString;
	}
}
