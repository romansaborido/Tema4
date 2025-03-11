package crud.ejercicio2;

import java.util.HashSet;

public class GESTISIMAL {
	
	// Creamos el conjunto articulos para almacenar todos los articulos
	private static HashSet<Artículo> articulos = new HashSet<Artículo>();
	
	
	
	/**
	 * Imprime todos los objetos almacenados en el conjunto
	 */
	public static void listado() {
		for (Artículo a : articulos) {
			System.out.println(a);
			System.out.println();
		}
	}
	
	
	/**
	 * Añade un objeto que recibe por parametro al conjunto
	 * @param obj
	 * @return True si se ha añadido correctamente, false si no se ha podido añadir
	 */
	public static boolean alta (Object obj) {
		
		boolean res;
		
		Artículo articulo = (Artículo) obj;
		
		res = articulos.add(articulo);
		 
		return res;
	}
	
	
	/**
	 * Elimina un objeto del conjunto indicado por el nombre del mismo recibido por parametro
	 * @param nombre
	 * @return True si se ha eliminado correctamente, false si no se ha podido eliminar
	 */
	public static boolean baja (String nombre) {
		
		boolean res;
		
		Artículo a = null;
		
		for (Artículo busqueda : articulos) {
			
			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				a = busqueda;
			}
		}
		
		res = articulos.remove(a);
		
		return res;
	}
	
	
	/**
	 * Modifica un objeto del conjunto indicado por el nombre del mismo recibido por parametro
	 * @param precio
	 * @param nombre
	 * @return True si se ha modificado correctamente, false si no se ha podido modificar
	 */
	public static boolean modificacion (double precio, String nombre) {
		
		boolean res = false;
		
		Artículo a = null;
		
		for (Artículo busqueda : articulos) {
			
			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				a = busqueda;
				res = true;
			}
		}
		
		a.setPrecio(precio);
		
		return res;
	}
	
	
	/**
	 * Modifica el stock de un objeto del conjunto indicado por el nombre del mismo recibido por parametro
	 * @param cantidad
	 * @param nombre
	 * @return True si ha sido posible incrementar el stock, false si no se ha podido modificar correctamente
	 */
	public static boolean entradaDeMercancia(int cantidad, String nombre) {
		
		boolean res = false;
		
		int stock;
			
		Artículo a = null;
			
		for (Artículo busqueda : articulos) {
				
			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				a = busqueda;
			}
		}
		
		stock = a.getCuantosQuedan();
		
		if (cantidad > 0) {
			
			stock += cantidad;
			
			a.setCuantosQuedan(stock);
			
			res = true;
		}
			
		return res;
	}
	
	
	/**
	 * Modifica el stock de un objeto del conjunto indicado por el nombre del mismo recibido por parametro
	 * @param cantidad
	 * @param nombre
	 * @return True si ha sido posible decrementar el stock, false si no se ha podido modificar correctamente
	 */
	public static boolean salidaDeMercancia(int cantidad, String nombre) {

		boolean res = false;

		int stock;

		Artículo a = null;

		for (Artículo busqueda : articulos) {

			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				a = busqueda;
			}
		}

		stock = a.getCuantosQuedan();

		if (cantidad <= stock) {
			stock -= cantidad;
			a.setCuantosQuedan(stock);
			res = true;
		}

		return res;
	}
	
	
	
	
	
	
}
