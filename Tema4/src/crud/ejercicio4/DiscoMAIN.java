package crud.ejercicio4;

import java.util.Scanner;

public class DiscoMAIN {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;
		int codigo;
		
		do {
			// Llamamos al método para mostrar el menú
			menu();
			
			// Pedimos al usuario que ingrese una opción
			System.out.print("Introduzca una opción: " + "\n");
			opcion = reader.nextInt();
			
			// Usamos un switch para realizar diferentes acciones según la opción
			switch (opcion) {
			
				// Opción 1: Listar los discos
				case 1 -> {
					DiscoCRUD.listado();
				}
				
				// Opción 2: Crear un nuevo disco y añadirlo
				case 2 -> {
					
					// Llamamos al método para crear un disco
					Disco disco = creaDisco();
					
					// Intentamos añadir el disco al conjunto
					if (DiscoCRUD.añadir(disco)) {
						System.out.println("El disco se ha añadido correctamente" + "\n");
					} else {
						System.out.println("El disco no se ha podido añadir" + "\n");
					}
				}
				
				// Opción 3: Borrar un disco por código
				case 3 -> {
					
					// Pedimos al usuario que ingrese el código del disco a eliminar
					codigo = codigo();
					
					// Creamos el disco unicamente con el codigo
					Disco disco = new Disco(codigo);
					
					// Intentamos borrar el disco del conjunto
					if (DiscoCRUD.borrar(disco)) {
						System.out.println("El disco se ha eliminado correctamente" + "\n");
					} else {
						System.out.println("El disco no se ha podido eliminar" + "\n");
					}
				}
				// Opción 4: Salir del programa
				case 4 -> {
					System.out.println("Fin del programa" + "\n");
				}
			}
			
		} while (opcion != 4);
	}
	
	
	// Método para mostrar el menú con las opciones disponibles
	static void menu() {
		System.out.println("\n" + "--------------------");
		System.out.println("COLECCIÓN DE DISCOS");
		System.out.println("--------------------");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Borrar");
		System.out.println("4. Salir" + "\n");
	}
	
	
	// Método para crear un nuevo disco pidiendo datos al usuario
	static Disco creaDisco() {
		
		Disco disco = null;
		
		int codigo;
		String autor;
		String titulo;
		double duracion;
		String genero;
		
		// Llamamos al método para pedir el código del disco
		codigo = codigo();
		
		// Pedimos al usuario que ingrese el autor del disco
		System.out.println("Introduzca el autor");
		autor = reader.nextLine();
		
		// Pedimos al usuario que ingrese el título del disco
		System.out.println("Introduzca el título");
		titulo = reader.nextLine();
		
		// Pedimos al usuario que ingrese la duración del disco
		System.out.println("Introduzca la duración");
		duracion = reader.nextDouble();
		reader.nextLine(); // Limpiamos el buffer del scanner
		
		// Pedimos al usuario que ingrese el género del disco
		System.out.println("Introduzca el género");
		genero = reader.nextLine();
		
		// Creamos un objeto Disco con los datos proporcionados
		disco = new Disco(codigo, autor, titulo, duracion, genero);
		
		return disco;
	}

	// Método para pedir el código de un disco
	static int codigo() {
		
		int codigo;
		
		// Pedimos al usuario que ingrese el código del disco
		System.out.println("Introduzca el código");
		codigo = reader.nextInt();
		reader.nextLine(); // Limpiamos el buffer del scanner
		
		return codigo;
	}
}
