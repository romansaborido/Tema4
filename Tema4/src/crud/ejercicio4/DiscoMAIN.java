package crud.ejercicio4;

import java.util.Scanner;

public class DiscoMAIN {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;
		int codigo;
		
		do {
			
			menu();
			
			System.out.print("Introduzca una opción: " + "\n");
			opcion = reader.nextInt();
			
			switch (opcion) {
				case 1 -> {
					DiscoCRUD.listado();
				}
				case 2 -> {
					Disco disco = creaDisco();
					if (DiscoCRUD.añadir(disco)) {
						System.out.println("El disco se ha añadido correctamente" + "\n");
					} else {
						System.out.println("El disco no se ha podido añadir" + "\n");
					}
				}
				case 3 -> {
					codigo = codigo();
					Disco disco = new Disco(codigo);
					if (DiscoCRUD.borrar(disco)) {
						System.out.println("El disco se ha eliminado correctamente" + "\n");
					} else {
						System.out.println("El disco no se ha podido eliminar" + "\n");
					}
				}
				case 4 -> {
					System.out.println("Fin del programa" + "\n");
				}
			}
			
		} while (opcion != 4);
	}
	
	
	static void menu() {
		System.out.println("\n" + "--------------------");
		System.out.println("COLECCIÓN DE DISCOS");
		System.out.println("--------------------");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Borrar");
		System.out.println("4. Salir" + "\n");
	}
	
	
	static Disco creaDisco() {
		
		Disco disco = null;
		
		int codigo;
		String autor;
		String titulo;
		double duracion;
		String genero;
		
		codigo = codigo();
		
		System.out.println("Introduzca el autor");
		autor = reader.nextLine();
		
		System.out.println("Introduzca el título");
		titulo = reader.nextLine();
		
		System.out.println("Introduzca la duración");
		duracion = reader.nextDouble();
		reader.nextLine();
		
		System.out.println("Introduzca el género");
		genero = reader.nextLine();
		
		disco = new Disco(codigo, autor, titulo, duracion, genero);
		
		return disco;
	}


	static int codigo() {
		
		int codigo;
		
		System.out.println("Introduzca el código");
		codigo = reader.nextInt();
		reader.nextLine();
		
		return codigo;
	}
	
	
	

}
