package boletin1.ejercicio1;

public class Punto {
	
	// Creamos el atributo x para representar la posicion vertical
	private int x;
		
	// Creamos el atributo x para representar la posicion horizontal
	private int y;
	
	/**
	 * Constructor con todos los atributos 
	 * @param x
	 * @param y
	 */
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Devuelve la coordenada horizontal X
	 * @return
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Devuelve la coordenada vertical Y
	 * @return
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Modifica la coordenada horizontal X
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Modifica la coordenada vertical Y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
}
