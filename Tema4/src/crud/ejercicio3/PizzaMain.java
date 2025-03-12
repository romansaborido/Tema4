package crud.ejercicio3;

import java.util.Scanner;

public class PizzaMain {

	// Creamos el scanner
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Creamos una variable opcion para almacenar la opcion que introduzca el usuario
		char opcion;
		
		// Creamos una variable codigo para almacenar el codigo de la pizza
		int codigo;
		
		// Creamos un objeto pizza tipo Pizza
		Pizza pizza;
		
		// Mientras que el usuario no seleccione la opcion d
		do {
			
			// Imprimimos el menu
			menu();
			
			// Pedimos al usuario que introduzca una opcion
			System.out.println("Introduzca una opcion");
			opcion = reader.next().charAt(0);
			
			// Dependiendo de la opcion que seleccione el usuario
			switch (opcion) {
				
				// Listado de pizzas
				case 'a' -> {
					
					// Listamos las pizzas
					PizzaCRUD.listado();
				}
				
				// Nuevo pedido
				case 'b' -> {
					
					// Creamos y almacenamos la pizza
					pizza = creaPizza();
					
					// Añadimos la pizza
					if (PizzaCRUD.nuevoPedido(pizza)) {
						System.out.println("El pedido se ha añadido correctamente");
					} else {
						System.out.println("El pedido no se ha podido añadir");
					}
				}
				
				// Pizza servida
				case 'c' -> {
					
					// Pedimos al usuario que introduzca el codigo y lo almacenamos
					codigo = codigo();
					
					// Cambiamos el estado de la pizza
					if (PizzaCRUD.pizzaServida(codigo)) {
						System.out.println("La pizza se ha servido correctamente");
					} else {
						System.out.println("La pizza no se ha podido servir");
					}
				}
				
				// Salir
				case 'd' -> {
					System.out.println("Fin del programa");
				}
				
				// Opcion no valida
				default -> {
					System.out.println("Introduzca una opcion válida");
				}
			}
		} while (opcion != 'd');

	}
	
	
	private static void menu() {
		System.out.println("a. Listado de pizzas");
		System.out.println("b. Nuevo pedido");
		System.out.println("c. Pizza servida");
		System.out.println("d. Salir");
	}
	
	
	private static Pizza creaPizza() {
		
		// Creamos estas variables para almacenar los valores de los atributos de la pizza
		int codigo;
		String tamaño;
		String tipo;
		
		// Pedimos al usuario que introduzca el codigo de la pizza y lo almacenamos
		codigo = codigo();
		
		// Pedimos al usuario que introduzca el tamaño de la pizza
		System.out.println("Introduzca el tamaño de la pizza");
		tamaño = reader.nextLine().toUpperCase();
		
		// Pedimos al usuario que introduzca el tipo de la pizza
		System.out.println("Introduzca el tipo de la pizza");
		tipo = reader.nextLine().toUpperCase();
		
		// Creamos la pizza
		Pizza pizza = new Pizza(codigo, tamaño, tipo);
		
		// Devolvemos la pizza
		return pizza;
	}


	private static int codigo() {
		
		// Creamos esta variable para almacenar el codigo de la pizza que introduzca el usuario
		int codigo;
		
		// Pedimos al usuario que introduzca el codigo de la pizza
		System.out.println("Introduzca el codigo de la pizza");
		codigo = reader.nextInt();
		reader.nextLine();
		
		// Devolvemos el codigo que el usuario ha introducido
		return codigo;
	}

}
