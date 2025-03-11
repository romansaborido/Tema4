package crud.ejercicio2;

import java.util.Scanner;

public class PrincipalArtículo {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean res;
		
		int opcion;
		
		String nombre;
		double precio;
		int cantidad;
		
		do {
			
			// Pintamos el menu
			menu();
			
			// Pedimos al usuario que introduzca una opcion
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			// Limpiamos el buffer del scanner
			reader.nextLine();
			
			switch (opcion) {
				
				case 1 -> {
					// Llamamos al metodo listado
					GESTISIMAL.listado();
				}
				case 2 -> {
					// Creamos el articulo a añadir y lo almacenamos
					Artículo a = crearArtículo();
					
					// Añadimos el articulo
					res = GESTISIMAL.alta(a);
					
					if (res) {
						System.out.println("El articulo se ha añadido correctamente");
					} else {
						System.out.println("El articulo no se ha podido añadir");
					}
				}
				case 3 -> {
					// Pedimos al usuario que introduzca el nombre del articulo a eliminar
					System.out.println("Introduzca el nombre del articulo a eliminar");
					nombre = reader.nextLine();
					
					// Eliminamos el articulo indicado
					res = GESTISIMAL.baja(nombre);
					
					if (res) {
						System.out.println("El articulo se ha eliminado correctamente");
					} else {
						System.out.println("El articulo no se ha podido eliminar");
					}
				}
				case 4 -> {
					// Pedimos al usuario que introduzca el nombre del articulo a eliminar
					System.out.println("Introduzca el nombre del articulo a eliminar");
					nombre = reader.nextLine();
					
					// Pedimos al usuario que introduzca el precio del articulo
					System.out.println("Introduzca el nuevo precio del articulo");
					precio = reader.nextDouble();
					
					// Modificamos el articulo indicado
					res = GESTISIMAL.modificacion(precio, nombre);
					
					if (res) {
						System.out.println("El precio se ha modificado correctamente");
					} else {
						System.out.println("El precio no se ha podido modificar");
					}
				}
				case 5 -> {
					// Pedimos al usuario que introduzca el nombre del articulo a reponer
					System.out.println("Introduzca el nombre del articulo a reponer");
					nombre = reader.nextLine();
					
					// Pedimos al usuario que introduzca la cantidad a almacenar
					System.out.println("Introduzca la cantidad a almacenar");
					cantidad = reader.nextInt();
					
					// Modificamos el stock del producto
					res = GESTISIMAL.entradaDeMercancia(cantidad, nombre);
					
					if (res) {
						System.out.println("El stock se ha incrementado correctamente");
					} else {
						System.out.println("El stock no se ha podido incrementar");
					}
				}
				case 6 -> {
					// Pedimos al usuario que introduzca el nombre del articulo para exportar stock
					System.out.println("Introduzca el nombre del articulo para exportar stock");
					nombre = reader.nextLine();
					
					// Pedimos al usuario que introduzca la cantidad a exportar
					System.out.println("Introduzca la cantidad a exportar");
					cantidad = reader.nextInt();
					
					// Modificamos el stock del producto
					res = GESTISIMAL.salidaDeMercancia(cantidad, nombre);
					
					if (res) {
						System.out.println("El stock ha disminuido correctamente");
					} else {
						System.out.println("El stock no se ha podido disminuir");
					}
				}
				case 7 -> {
					System.out.println("Fin del programa");
				}
			}
			
			
			
			
		} while (opcion != 7);

	}
	
	static void menu() {
		System.out.println("GESTISIMAL" + "\n");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir" + "\n");
	}
	
	static Artículo crearArtículo() {
		
		String nombre;
		double precio;
		int stock;
		
		System.out.println("Introduzca el nombre del articulo");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca el precio del articulo");
		precio = reader.nextDouble();
		
		System.out.println("Introduzca el stock del articulo");
		stock = reader.nextInt();
			
		Artículo a = new Artículo(nombre, precio, stock);
		
		return a;
	}

}
