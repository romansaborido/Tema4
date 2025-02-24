package boletin4.ejercicio2;

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

	
	
	/**
	 * Muestra el nombre del articulo
	 * @return Nombre del articulo
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Muestra el precio del articulo
	 * @return Precio del articulo
	 */
	double getPrecio() {
		return precio;
	}
	
	
	/**
	 * Modifica el nombre del articulo
	 * @param nombre. Nuevo nombre del articulo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Modifica el precio del articulo
	 * @param precio. Nuevo precio del articulo
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/**
	 * Muestra la cantidad de stock del articulo
	 * @return Stock del articulo
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}


	/**
	 * Muestra cuantos articulos quedan 
	 * @param cuantosQuedan. Numero de articulos que quedan disponibles
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
	
	
	/**
	 * Devuelve el precio de venta al publico con IVA incluido
	 * @return
	 */
	public double getPVP() {
		
		double pvp = 0.0;
		
		return pvp;
		
	}
	
	
	/**
	 * Devuelve el PVP con un descuento pasado como argumento
	 * @param descuento
	 * @return
	 */
	public double getPVPDescuento(double descuento) {
		
		double pvpDescuento = 0.0;
		
		return pvpDescuento;
		
	}
	
	
	/**
	 * Actualiza los atributos del objeto tras vender una cantidad 
	 * @return. Si es posible devolvera true, false en caso contrario
	 */
	public boolean vender(int cantidad) {
		
		boolean esPosible = false;
		
		return esPosible;
	}
	
	
	/**
	 * Actualiza los atributos del objeto tras almacenar una cantidad
	 * @param cantidad
	 */
	public void almacenar(int cantidad) {
		
	}
	
	
	@Override
	public String toString() {
		String articulo = "";
		
		return articulo;
	}
	
	
	
	
}
