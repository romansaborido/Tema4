package boletin4.ejercicio2;

import java.util.Objects;

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
	public double getPrecio() {
		return precio;
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
	 * Modifica la cantidad de stock del articulo
	 * @param cuantosQuedan. Nuevo stock del articulo
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
	
	/**
	 * Devuelve el precio de venta al publico con IVA incluido
	 * @return El precio con IVA incluido
	 */
	public double getPVP() {
		
		// El PVP se calcula como el precio + el IVA sobre el precio
		return precio + (precio * IVA / 100);
	}
	
	/**
	 * Devuelve el PVP con un descuento pasado como argumento
	 * @param descuento Porcentaje de descuento (0-100)
	 * @return El precio con IVA y descuento incluido
	 */
	public double getPVPDescuento(double descuento) {
		
		// El descuento es sobre el precio base (sin IVA)
		double precioConDescuento = precio - (precio * descuento / 100);
		
		// Luego calculamos el PVP con IVA sobre el precio con descuento
		return precioConDescuento + (precioConDescuento * IVA / 100);
	}
	
	/**
	 * Actualiza los atributos del objeto tras vender una cantidad 
	 * @param cantidad. Cantidad de artículos a vender
	 * @return Devuelve true si la venta es posible (hay suficiente stock), false en caso contrario
	 */
	public boolean vender(int cantidad) {
		
		boolean res = false;
		
		// Verificamos si hay suficiente stock
		if (cantidad <= cuantosQuedan) {
			
			// Actualizamos el stock
			cuantosQuedan -= cantidad;
			
			res = true;
		}
		
		// Si no hay suficiente stock, no se puede vender
		return res;
	}
	
	/**
	 * Actualiza los atributos del objeto tras almacenar una cantidad
	 * @param cantidad. Cantidad de artículos a almacenar
	 */
	public void almacenar(int cantidad) {
		
		// Añadimos la cantidad almacenada al stock
		cuantosQuedan += cantidad;
	}
	
	@Override
	public String toString() {
		
		// Devolvemos una representación del objeto con sus atributos
		return "Artículo: " + nombre + "\n" +
		       "Precio sin IVA: " + precio + "€\n" +
		       "Stock disponible: " + cuantosQuedan + " unidades\n" +
		       "PVP con IVA: " + getPVP() + "€";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
}

