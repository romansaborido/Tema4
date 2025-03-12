package crud.ejercicio4;

import java.util.HashSet;

public class DiscoCRUD {

	private static HashSet<Disco> discos = new HashSet<>();
	
	
	public static void listado() {
		for (Disco disco : discos) {
			System.out.println(disco);
			System.out.println("--------------------");
		}
	}
	
	public static boolean añadir(Disco disco) {
		return discos.add(disco);
	}
	
	
	public static boolean borrar(Disco disco) {
		return discos.remove(disco);
	}
	
	
}
