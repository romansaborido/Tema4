package boletin4.ejercicio1;

import java.util.Scanner;

public class PrincipalAlumno {
	
	// Creamos el scanner
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Creamos la variable opcion para almacenar la opcion introducida por el usuario
		int opcion = 0;
		
		// Creamos la variable nombre para almacenar el nombre del alumno que introduzca el usuario
		String nombre;
		
		// Creamos el booleano res para almacenar los resultados de las funciones
		boolean res = false;
		
		// Creamos la variable nota para almacenar la nota del alumno que introduzca el usuario
		double nota;
		
		do {
			
			// Pintamos el menu
			menu();
			
			// Pedimos al usuario que introduzca una opcion
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			// Limpiamos el buffer del scanner
			reader.nextLine();
			
			// Acciones del menu
			switch (opcion) {
				
				// Opcion 1
				case 1 -> {
					
					// Imprimimos todos los alumnos que se encuentran en la lista
					AlumnoCRUD.listarAlumnos();
					
				}
				// Opcion 2
				case 2 -> {
					
					// Pedimos al usuario que introduzca el nombre del alumno
					nombre = nombre();
					
					// Pedimos al usuario que introduzca la nota del alumno
					nota = nota();
					
					// Añadimos el usuario a la lista
					res = AlumnoCRUD.añadirAlumno(nombre, nota);
					
					// Si se ha añadido correctamente
					if (res) {
						System.out.println("El alumno se ha añadido correctamente" + "\n");
						
					// Si el usuario no se ha podido añadir
					} else {
						System.err.println("El alumno no se ha podido añadir" + "\n");
					}

				}
				// Opcion 3
				case 3 -> {
					
					// Pedimos al usuario que introduzca el nombre del alumno
					nombre = nombre();
					
					// Pedimos al usuario que introduzca la nota del alumno
					nota = nota();
					
					// Modificamos la nota del alumno
					res = AlumnoCRUD.modificarAlumno(nombre, nota);
					
					// Si se ha modificado correctamente
					if (res) {
						System.out.println("La nota del alumno se ha modificado correctamente" + "\n");
					
					// Si no se ha podido modificar
					} else {
						System.out.println("El alumno no se ha podido modificar" + "\n");
					}
					
				}
				// Opcion 4
				case 4 -> {
					
					// Pedimos al usuario que introduzca el nombre del alumno
					nombre = nombre();
					
					// Borramos el alumno
					res = AlumnoCRUD.borrarAlumno(nombre);
					
					// Si el alumno se ha borrado correctamente
					if (res) {
						System.out.println("El alumno se ha eliminado correctamente" + "\n");
					
					// Si el alumno no se ha podido eliminar
					} else {
						System.out.println("El alumno no se ha podido eliminar" + "\n");
					}
				
				}
				// Opcion 5
				case 5 -> {
					System.out.println("Fin del programa" + "\n");
				}
				// Opcion no valida
				default -> {
					System.out.println("Introduzca una opción válida" + "\n");
				}
			}
		
		// Mientras que el usuario no introduzca la opcion 5 no saldra del menu
		} while (opcion != 5); 
			
		

	}
	
	
	static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("----------");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir" + "\n");
	}
	
	
	static String nombre() {
		
		// Creamos la variable nombreAlumno
		String nombreAlumno;
		
		// Pedimos al usuario que introduzca el nombre del alumno
		System.out.println("Introduzca el nombre del alumno");
		nombreAlumno = reader.nextLine();
		
		// Devolvemos el nombre que ha introducido el usuario
		return nombreAlumno;
	}
	
	
	static double nota() {
		
		// Creamos la variable nota
		double nota;
		
		// Pedimos al usuario que introduzca la nota del alumno
		System.out.println("Introduzca la nota del alumno");
		nota = reader.nextInt();
		
		// Devolvemos la nota que ha introducido el usuario
		return nota;
	}

}
