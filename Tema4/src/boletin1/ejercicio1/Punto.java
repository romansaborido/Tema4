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
	
	/**
	 * Método para cambiar las dos coordenadas del punto
	 * @param x Nueva coordenada horizontal
	 * @param y Nueva coordenada vertical
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Método para desplazar la posicion del punto
	 * @param dx Coordenadas a desplazar horizontalmente
	 * @param dy Coordenadas a desplazar verticalmente
	 */
	public void desplaza(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}
	
	public double distancia(Punto p) {
	
		double coordenadaDistancia = 0.0;
		
		double thisCoordenada;
		double pCoordenada;
		
		
		return coordenadaDistancia;
		
	}
}
