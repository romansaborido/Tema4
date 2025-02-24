package boletin4.ejercicio2;

import java.util.HashSet;

public class GESTISIMAL {
	
	// Creamos el conjunto articulos para almacenar todos los articulos
	private static HashSet<Artículo> articulos = new HashSet<Artículo>();
	
	public static void listado() {
		
		for (Artículo a : articulos) {
			System.out.println(a);
			System.out.println();
		}
	}
}
