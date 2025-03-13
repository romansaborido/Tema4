package crud.ejercicio4;

import java.util.HashSet;


public class DiscoCRUD {

	/** Conjunto de discos almacenados */
	private static HashSet<Disco> discos = new HashSet<>();
	
	/**
	 * Muestra todos los discos almacenados en el conjunto
	 * Recorre todos los discos y los imprime en consola con un separador
	 */
	public static void listado() {
		
		// Recorremos cada disco en el conjunto
		for (Disco disco : discos) {
			
			// Imprimimos la información del disco
			System.out.println(disco);
			
			// Imprimimos un separador entre discos
			System.out.println("--------------------");
		}
	}
	
	/**
	 * Añade un disco al conjunto de discos
	 * @param disco El disco que se desea añadir
	 * @return true si el disco se añadió correctamente, false si ya existía en el conjunto
	 */
	public static boolean añadir(Disco disco) {
		
		// Añadimos el disco al conjunto y devolvemos el resultado de la operación
		return discos.add(disco);
	}
	
	/**
	 * Elimina un disco del conjunto de discos
	 * @param disco El disco que se desea eliminar
	 * @return true si el disco se eliminó correctamente, false si el disco no se encontraba en el conjunto
	 */
	public static boolean borrar(Disco disco) {
		
		// Eliminamos el disco del conjunto y devolvemos el resultado de la operación
		return discos.remove(disco);
	}
}

