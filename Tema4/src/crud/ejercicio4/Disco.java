package crud.ejercicio4;

import java.util.Objects;

public class Disco {
	
	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}
	
	private int codigo;
	
	private String autor;
	
	private String titulo;
	
	private double duracion;
	
	private Genero genero;
	
	
	public Disco(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}
	
	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (duracion > 0) {
			this.duracion = duracion;
		}
		compruebaGenero(genero);
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	
	public void setAutor(String autor) {
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}
	
	
	private void compruebaGenero(String genero) {
		if (genero != null) {
			switch (genero) {
				case "POP", "ROCK", "JAZZ", "BLUES" -> this.genero = Genero.valueOf(genero);
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Código: " + this.codigo + "\n" + 
			   "Título: " + this.titulo + "\n" + 
			   "Autor: " + this.autor + "\n" +
			   "Duración: " + this.duracion + "\n" +
			   "Género: " + this.genero;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		Disco disco = (Disco) obj;
		if (this.codigo == disco.codigo) {
			res = true;
		}
		return res;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
	
}
