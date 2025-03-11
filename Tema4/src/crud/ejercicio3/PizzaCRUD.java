package crud.ejercicio3;

import java.util.HashSet;

public class PizzaCRUD {
	
	// Creamos el conjunto pedidos para almacenar los pedidos de pizzas que se realizan en el dia
	private static HashSet<Pizza> pedidos = new HashSet<>();
	
	
	public static void listado() {
		
		// Recorremos el conjunto pedidos
		for (Pizza p : pedidos) {
			
			// Imprimimos la pizza
			System.out.println(p);
			
			// Imprimimos una linea separatoria
			System.out.println("------------");
		}
	}
	
	
	public static boolean nuevoPedido(Object o) {
		
		// Casteamos el objeto recibido a Pizza
		Pizza pizza = (Pizza) o;
		
		// Añadimos la pizza al conjunto
		return pedidos.add(pizza);
	}
	
	
	//public static boolean pizzaServida(String estado) {
		
		
		// Corregir clase Pizza
	//}
	
	
}
