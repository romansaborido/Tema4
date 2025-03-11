package crud.ejercicio1;

public class Alumno {
	
	// Creamos el atributo nombre para almacenar el nombre del alumno
	private String nombre;
	
	// Creamos el atributo notaMedia para almacenar la nota media del alumno
	private double notaMedia;
	
	
	
	/**
	 * Constructor a partir del nombre del alumno y de la nota media del alumno
	 * @param nombre No puede ser null ni estar en blanco
	 * @param notaMedia Tiene que ser mayor o igual que 0 y menor o igual que 10
	 */
	public Alumno(String nombre, double notaMedia) {
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	
	
	
	/**
	 * Getter para obtener el nombre del alumno
	 * @return Nombre del alumno
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Setter para modificar el nombre del alumno
	 * @param nombre No puede ser null ni estar en blanco
	 */
	public void setNombre(String nombre) {
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	
	/**
	 * Getter para obtener la nota media del alumno
	 * @return Nota media del alumno
	 */
	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	/**
	 * Setter para modificar la nota media del alumno
	 * @param nota Tiene que estar entre 0 y 10
	 */
	public void setNotaMedia(double nota) {
		
		if (nota >= 0 && nota <= 10) {
			this.notaMedia = nota;
		}
	}
	
	
	
	@Override
	public String toString() {
		
		String alumno = "";
		
		alumno += this.nombre + " " + this.notaMedia;
		
		return alumno;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = false;
		
		Alumno otroAlumno = (Alumno) obj;
		
		if (this.nombre.equalsIgnoreCase(otroAlumno.nombre)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
}
