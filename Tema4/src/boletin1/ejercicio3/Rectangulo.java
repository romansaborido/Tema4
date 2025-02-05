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
}
