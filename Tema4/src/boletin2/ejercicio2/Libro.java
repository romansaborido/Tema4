package boletin2.ejercicio2;

public class Libro {
	
	// Creamos el atributo titulo para almacenar el titulo del usuario
	private String titulo;
	
	// Creamos el atributo autor para almacenar el nombre del autor del libro
	private String autor;
	
	// Creamos el atributo ejemplares para almacenar el numero de ejemplares del libro 
	private int ejemplares;
	
	// Creamos el atributo ejemplaresPrestados para almacenar el numero de ejemplares prestados del libro
	private int ejemplaresPrestados;
	
	// Creamos el atributo genero para almacenar el genero del libro
	private Genero genero = Genero.NARRATIVO;
	
	// Definimos los valores posibles para genero
	enum Genero {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}
	
	
	
	/**
	 * Constructor con titulo del libro y nombre del autor del libro
	 * @param titulo No puede ser nulo ni estar en blanco
	 * @param autor No puede ser nulo ni estar en blanco
	 */
	public Libro(String titulo, String autor) {
		
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}
	
	
	/**
	 * Constructor con titulo del libro, nombre del autor del libro, ejemplares y ejemplares prestados del libro
	 * @param titulo No puede ser nulo ni estar en blanco
	 * @param autor No puede ser nulo ni estar en blanco
	 * @param ejemplares Tiene que ser mayor que 0
	 * @param ejemplaresPrestados Tiene que ser menor o igual que el numero de ejemplares
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		
		if (ejemplaresPrestados >= ejemplares) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}
	
	
	/**
	 * Constructor con titulo del libro, nombre del autor del libro, ejemplares y ejemplares prestados del libro
	 * @param titulo No puede ser nulo ni estar en blanco
	 * @param autor No puede ser nulo ni estar en blanco
	 * @param ejemplares Tiene que ser mayor que 0
	 * @param ejemplaresPrestados Tiene que ser menor o igual que el numero de ejemplares y mayor o igual que 0
	 * @param genero Tiene que tener alguno de los siguientes valores: "narrativo", "lirico", "dramatico", "didactico" o "poetico"
	 */
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados, String genero) {
		
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
		
		if (ejemplaresPrestados >= ejemplares && ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
		
		switch (genero) {
			case "NARRATIVO" -> {
				this.genero = Genero.NARRATIVO;
			}
			case "LIRICO" -> {
				this.genero = Genero.LIRICO;
			}
			case "DRAMATICO" -> {
				this.genero = Genero.DRAMATICO;
			}
			case "DIDACTICO" -> {
				this.genero = Genero.DIDACTICO;
			}
			case "POETICO" -> {
				this.genero = Genero.POETICO;
			}
		}
	}
	
	
	
	/**
	 * Getter para obtener el titulo del libro
	 * @return Titulo del libro
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	
	/**
	 * Getter para obtener el nombre del autor del libro
	 * @return Nombre del autor del libro
	 */
	public String getAutor() {
		return this.autor;
	}
	
	
	/**
	 * Getter para obtener el genero del libro
	 * @return Genero del libro
	 */
	public Genero getGenero() {
		return this.genero;
	}
	
	
	/**
	 * Getter para obtener el numero de ejemplares del libro
	 * @return Numero de ejemplares del libro que dispone
	 */
	public int getEjemplares() {
		return this.ejemplares;
	}
	
	/**
	 * Setter para modificar el numero de ejemplares del libro
	 * @param ejemplares Tiene que ser mayor que 0
	 */
	public void setEjemplares(int ejemplares) {
		
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
	}
	
	
	/**
	 * Getter para obtener el numero de ejemplares prestados del libro
	 * @return Numero de ejemplares que tenemos prestados del libro
	 */
	public int getEjemplaresPrestados() {
		return this.ejemplaresPrestados;
	}
	
	/**
	 * Setter para modificar el numero de ejemplares prestados del libro
	 * @param ejemplaresPrestados Tiene que ser menor o igual que el numero de ejemplares y mayor o igual que 0
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		
		if (ejemplaresPrestados >= ejemplares && ejemplaresPrestados >= 0) {
			this.ejemplaresPrestados = ejemplaresPrestados;
		}
	}
	
	
	
	/**
	 * Incrementa el atributo ejemplaresPrestados cada vez que se realice un prestamo
	 * @param nEjemplaresPrestados Tiene que ser menor o igual que los ejemplares disponibles y mayor que 0
	 * @return True si es posible prestar la cantidad de libros indicada, false si no lo es
	 */
	public boolean prestamo(int ejemplaresPrestar) {
		
		boolean esPosible = false;
		
		int ejemplaresDisponibles = this.ejemplares - this.ejemplaresPrestados;
		
		if (ejemplaresPrestar <= ejemplaresDisponibles && ejemplaresPrestar > 0) {
			this.ejemplaresPrestados += ejemplaresPrestar;
			esPosible = true;
		}
		
		return esPosible;
	}
	
	
	/**
	 * Decrementa el atributo ejemplaresPrestados cada vez que se devuelvan libros
	 * @param ejemplaresDevolver Tiene que ser menor o igual que los ejemplares prestados y mayor que 0
	 * @return True si es posible devolver la cantidad de libros indicada, false si no lo es
	 */
	public boolean devolucion(int ejemplaresDevolver) {
		
		boolean esPosible = false;
		
		if (ejemplaresDevolver <= this.ejemplaresPrestados && ejemplaresDevolver > 0) {
			this.ejemplaresPrestados -= ejemplaresDevolver;
			esPosible = true;
		}
		
		return esPosible;
	}
	
	
	
	@Override
	public String toString() {
		
		String libro = "";
		
		libro += this.titulo.toUpperCase() + "\n" + 
		"Autor -> " + this.autor + "\n" +
		"Genero -> " + this.genero + "\n" +
		"Ejemplares -> " + this.ejemplares + "\n" + 
		"Ejemplares prestados -> " + this.ejemplaresPrestados + "\n";
		
		return libro;
	}
	
	
	@ Override
	public boolean equals(Object objeto) {
		
		boolean sonIguales = false;
		
		Libro otroLibro = (Libro) objeto;
		
		if (this.titulo.equalsIgnoreCase(otroLibro.titulo) && this.autor.equalsIgnoreCase(otroLibro.autor)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
	
	
}
