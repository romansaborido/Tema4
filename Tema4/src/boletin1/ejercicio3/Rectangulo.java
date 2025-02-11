package boletin1.ejercicio3;

public class Rectangulo {
	
	// Creamos el atributo x1 para almacenar la primera posicion vertical
	private int x1;
	
	// Creamos el atributo x2 para almacenar la segunda posicion vertical
	private int x2;
	
	// Creamos el atributo y1 para almacenar la primera posicion horizontal
	private int y1;
	
	// Creamos el atributo y2 para almacenar la segunda posicion horizontal
	private int y2;
	
	
	/**
	 * Constructor con todos los atributos
	 * @param x1. No puede ser mayor que x2
	 * @param x2. No puede ser menor que x1
	 * @param y1. No puede ser mayor que y2
	 * @param y2. No puede ser menor que y1
	 */
	public Rectangulo(int x1, int x2, int y1, int y2) {
		
		// Comprobamos si las coordenadas son validas
		if (x2 > x1 && y2 > y1) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		
		// Si las coordenadas no son validas asignamos los valores por defecto
		} else {
			this.x1 = 0;
			this.x2 = 1;
			this.y1 = 0;
			this.y2 = 1;
		}
	}
	
	
	/**
	 * Devuelve la primera coordenada horizontal X1
	 * @return
	 */
	public int getX1() {
		return x1;
	}
	
	/**
	 * Devuelve la segunda coordenada horizontal X2
	 * @return
	 */
	public int getX2() {
		return x2;
	}
	
	/**
	 * Devuelve la primera coordenada vertical Y1
	 * @return
	 */
	public int getY1() {
		return y1;
	}
	
	/**
	 * Devuelve la segunda coordenada vertical Y2
	 * @return
	 */
	public int getY2() {
		return y2;
	}
	
	
	/**
	 * Modifica la primera coordenada horizontal
	 * @param x1. Tiene que ser menor que x2
	 */
	public void setX1(int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}
	}
	
	/**
	 * Modifica la segunda coordenada horizontal
	 * @param x2. Tiene que ser mayor que x1
	 */
	public void setX2(int x2) {
		if (x2 > x1) {
			this.x2 = x2;
		}
	}
	
	/**
	 * Modifica la primera coordenada vertical
	 * @param y1. Tiene que ser menor que y2
	 */
	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}
	
	/**
	 * Modifica la segunda coordenada vertical
	 * @param y2. Tiene que ser mayor que y1
	 */
	public void setY2(int y2) {
		if (y2 > y1) {
			this.y2 = y2;
		}
	}
	
	
	
	/**
	 * Modifica las coordenadas horizontales
	 * @param x1. Primera coordenada horizontal
	 * @param x2. Segunda coordenada horizontal
	 */
	public void setX1Y1(int x1, int x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
	
	
	/**
	 * Modifica las coordenadas verticales
	 * @param y1. Primera coordenada vertical
	 * @param y2. Segunda coordenada vertical
	 */
	public void setX2Y2(int y1, int y2) {
		this.y1 = y1;
		this.y2 = y2;
	}
	
	
	/**
	 * Modifica todas las coordenadas del rectangulo
	 * @param x1. Primera coordenada horizontal
	 * @param x2. Segunda coordenada horizontal
	 * @param y1. Primera coordenada vertical
	 * @param y2. Segunda coordenada vertical
	 */
	public void setAll(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	
	/**
	 * Devuelve el perimetro del rectangulo
	 * @return Entero que representa el perimetro del rectangulo
	 */
	public int getPerimetro() {
		
		int perimetro;
		
		// Calculamos la longitud de los lados
		int longitudX = this.x1 > this.x2 ? this.x1 - this.x2 : this.x2 - this.x1;
		int longitudY = this.y1 > this.y2 ? this.y1 - this.y2 : this.y2 - this.y1;
		
		// Calculamos el perimetro
		perimetro = longitudX + longitudY;
		
		return perimetro;
	}
	
	
	/**
	 * Devuelve el area del rectangulo 
	 * @return Entero que representa el area del rectangulo
	 */
	public int getArea() {
		
		int area = 0;
		
		// Calculamos la longitud de los lados
		int longitudX = this.x1 > this.x2 ? this.x1 - this.x2 : this.x2 - this.x1;
		int longitudY = this.y1 > this.y2 ? this.y1 - this.y2 : this.y2 - this.y1;
		
		// Calculamos el area
		area = longitudX * longitudY;
		
		return area;
	}
	
	@Override
	public String toString() {

		String rectangulo = "";
		
		// Convertimos las coordenadas a String
		rectangulo += "Coordenada 1 -> " + "(" + this.x1 + "," + this.y1 + ")" + "\n" +
		"Coordenada 2 -> " + "(" + this.x2 + "," + this.y2 + ")";
		
		return rectangulo;
	}
	
	
}
