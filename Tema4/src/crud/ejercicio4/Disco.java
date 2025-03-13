package crud.ejercicio4;

import java.util.Objects;

public class Disco {
	
	/**
	 * Enumeración que define los géneros musicales posibles para un disco
	 */
	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}
	
	/** Código único del disco */
	private int codigo;
	
	/** Autor del disco */
	private String autor;
	
	/** Título del disco */
	private String titulo;
	
	/** Duración del disco en minutos */
	private double duracion;
	
	/** Género musical del disco */
	private Genero genero;
	
	/**
	 * Constructor que inicializa el disco solo con el código
	 * @param codigo El código único del disco (debe ser mayor a 0)
	 */
	public Disco(int codigo) {
		
		// Verificamos que el código sea válido (mayor que 0)
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}
	
	/**
	 * Constructor que inicializa todos los atributos del disco
	 * @param codigo El código único del disco (debe ser mayor a 0)
	 * @param autor El autor del disco (no debe ser null ni vacío)
	 * @param titulo El título del disco (no debe ser null ni vacío)
	 * @param duracion La duración del disco en minutos (debe ser mayor que 0)
	 * @param genero El género musical del disco (debe ser uno de los valores válidos: "POP", "ROCK", "JAZZ", "BLUES")
	 */
	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		
		// Verificamos que el código sea válido
		if (codigo > 0) {
			this.codigo = codigo;
		}
		
		// Verificamos que el autor no sea null ni vacío
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		
		// Verificamos que el título no sea null ni vacío
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
		// Verificamos que la duración sea válida (mayor a 0)
		if (duracion > 0) {
			this.duracion = duracion;
		}
		
		// Llamamos al método para comprobar y asignar el género
		compruebaGenero(genero);
	}
	
	/**
	 * Obtiene el código único del disco
	 * @return El código del disco
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Obtiene el autor del disco
	 * @return El autor del disco
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Obtiene el título del disco
	 * @return El título del disco
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Obtiene la duración del disco
	 * @return La duración del disco en minutos
	 */
	public double getDuracion() {
		return duracion;
	}
	
	/**
	 * Obtiene el género musical del disco
	 * @return El género musical del disco
	 */
	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * Modifica el autor del disco
	 * @param autor El nuevo autor del disco (no debe ser null ni vacío)
	 */
	public void setAutor(String autor) {
		
		// Verificamos que el autor no sea null ni vacío
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}
	
	/**
	 * Comprueba y asigna el género del disco a partir de una cadena de texto
	 * Si el género proporcionado no es válido, no se asigna ningún género
	 * @param genero El género como cadena de texto (debe ser uno de los valores válidos: "POP", "ROCK", "JAZZ", "BLUES")
	 */
	private void compruebaGenero(String genero) {
		
		// Verificamos que el género no sea null
		if (genero != null) {
			
			// Asignamos el género si coincide con alguna de las opciones disponibles en el enum
			switch (genero) {
				case "POP", "ROCK", "JAZZ", "BLUES" -> this.genero = Genero.valueOf(genero);
			}
		}
	}
	
	/**
	 * Representa el disco como una cadena de texto con todos sus atributos
	 * @return Una cadena con la información del disco (código, título, autor, duración y género)
	 */
	@Override
	public String toString() {
		return "Código: " + this.codigo + "\n" + 
			   "Título: " + this.titulo + "\n" + 
			   "Autor: " + this.autor + "\n" +
			   "Duración: " + this.duracion + "\n" +
			   "Género: " + this.genero;
	}
	
	/**
	 * Compara dos discos para ver si son iguales. Dos discos son iguales si tienen el mismo código
	 * @param obj El objeto con el que comparar
	 * @return true si los discos tienen el mismo código, false en caso contrario
	 */
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		
		// Comprobamos que el objeto sea una instancia de Disco antes de hacer el casting
		if (obj instanceof Disco) {
			Disco disco = (Disco) obj;
			
			// Comparamos los códigos de ambos discos
			if (this.codigo == disco.codigo) {
				res = true;
			}
		}
		return res;
	}
	
	/**
	 * Calcula el código hash del disco basado en el código único
	 * @return El código hash del disco
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
}


