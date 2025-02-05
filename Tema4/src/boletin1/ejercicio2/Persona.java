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
}
