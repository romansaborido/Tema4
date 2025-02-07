package boletin1.ejercicio4;

public class Artículo {

	// Creamos el atributo nombre para almacenar el nombre del articulo
	private String nombre;
	
	// Creamos el atributo precio para almacenar el precio sin IVA del articulo
	private double precio;
	
	// Creamos el atributo IVA para almacenar el IVA del articulo (siempre sera el mismo)
	public static final double IVA = 21;
	
	// Creamos el atributo cuantosQuedan para almacenar el stock del articulo
	private int cuantosQuedan;
	
	
	/**
	 * Constructor con todos los atributos
	 * @param nombre. No puede ser null o blanco
	 * @param precio. Tiene que ser mayor que 0
	 * @param cuantosQuedan. Tiene que ser mayor o igual que 0
	 */
	public Artículo(String nombre, double precio, int cuantosQuedan) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}


	public String getNombre() {
		return nombre;
	}


	double getPrecio() {
		return precio;
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCuantosQuedan() {
		return cuantosQuedan;
	}


	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
	
	
	
	
}
