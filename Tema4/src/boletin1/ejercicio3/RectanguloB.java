package boletin1.ejercicio3;

public class RectanguloB {
	
	// Creamos el atributo x1 para almacenar la primera posicion vertical
	int x1;
	
	// Creamos el atributo x2 para almacenar la segunda posicion vertical
	int x2;
	
	// Creamos el atributo y1 para almacenar la primera posicion horizontal
	int y1;
	
	// Creamos el atributo y2 para almacenar la segunda posicion horizontal
	int y2;
	
	/**
	 * Constructor con todos los atributos
	 * @param x1
	 * @param x2
	 * @param x3
	 * @param x4
	 */
	public RectanguloB(int x1, int x2, int y1, int y2) {
		
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
}
