package boletin4.ejercicio1;

import java.util.Scanner;

public class HoraMain {

	// Creamos el scanner
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Creamos la variable opcion para almacenar la opcion que seleccione el usuario
		int opcion;
		
		// Creamos estas variables para almacenar los valores de la hora
		int hora;
		int minutos;
		int segundos;
		
		// Damos la bienvenida
		System.out.println("BIENVENIDO A LA ZONA HORARIA" + "\n");
		
		// Creamos la hora
		Hora h1 = crearHora();
		
		// Mientras que el usuario no presione el 2
		do {
			
			// Imprimimos el menu
			menu(h1);
			
			// Pedimos al usuario que introduzca una opcion
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			// Dependiendo de la opcion que introduzca el usuario
			switch (opcion) {
			
				// Incrementar hora
				case 1 -> {
					
					// Incrementamos la hora
					h1.inc();
				}
				
				// Modificar hora
				case 2 -> {
					
					// Pedimos al usuario que introduzca la hora
					hora = hora();
					
					// Modificamos la hora
					if (h1.setHora(hora)) {
						System.out.println("La hora se ha modificado correctamente" + "\n");
					} else {
						System.out.println("La hora no se ha podido modificar" + "\n");
					}
				}
				
				// Modificar minutos
				case 3 -> {
					
					// Pedimos al usuario que introduzca los minutos
					minutos = minutos();
					
					// Modificamos los minutos
					if (h1.setMinutos(minutos)) {
						System.out.println("Los minutos se han modificado correctamente" + "\n");
					} else {
						System.out.println("Los minutos no se han podido modificar" + "\n");
					}
				}
				
				// Modificar segundos
				case 4 -> {
					
					// Pedimos al usuario que introduzca los segundos
					segundos = segundos();
					
					// Modificamos los segundos
					if (h1.setSegundos(segundos)) {
						System.out.println("Los segundos se han modificado correctamente" + "\n");
					} else {
						System.out.println("Los segundos no se han podido modificar" + "\n");
					}
				}
				
				// Salir
				case 5 -> {
					System.out.println("Fin del programa");
				}
				
				// Opcion no valida
				default -> {
					System.out.println("Introduzca una opción válida");
				}
			}
		} while (opcion != 5);
		
		
		// Cerramos el scanner
		reader.close();
	}
	
	
	
	private static void menu(Hora hora) {
		System.out.println("\n" + hora + "\n" + "--------");
		System.out.println("1. Incrementar hora");
		System.out.println("2. Modificar hora");
		System.out.println("3. Modificar minutos");
		System.out.println("4. Modificar segundos");
		System.out.println("5. Salir");
	}
	
	
	private static Hora crearHora() {
		
		// Creamos estas variables para almacenar los valores de la hora que introduzca el usuario
		int hora;
		int minutos;
		int segundos;
		
		// Pedimos la hora al usuario y la almacenamos
		hora = hora();
		
		// Pedimos los minutos al usuario y los almacenamos
		minutos = minutos();
		
		// Pedimos los segundos al usuario y los almacenamos
		segundos = segundos();
		
		// Creamos la hora
		Hora h1 = new Hora(hora, minutos, segundos);
		
		// Devolvemos la hora
		return h1;
		
	}


	private static int segundos() {
		
		// Creamos la variable segundos
		int segundos;
		
		// Pedimos al usuario que introduzca los segundos
		System.out.println("Introduzca los segundos");
		segundos = reader.nextInt();
		
		// Devolvemos los segundos
		return segundos;
	}


	private static int minutos() {
		
		// Creamos la variable minutos
		int minutos;
		
		// Pedimos al usuario que introduzca los minutos
		System.out.println("Introduzca los minutos");
		minutos = reader.nextInt();
		
		// Devolvemos los minutos
		return minutos;
	}


	private static int hora() {
		
		// Creamos la variable hora
		int hora;
		
		// Pedimos al usuario que introduzca la hora
		System.out.println("Introduzca la hora");
		hora = reader.nextInt();
		
		// Devolvemos la hora
		return hora;
	}

}
