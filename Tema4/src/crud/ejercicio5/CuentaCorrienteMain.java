package crud.ejercicio5;

import java.util.Scanner;

public class CuentaCorrienteMain {

	// Creamos el scanner
	static Scanner reader = new Scanner(System.in);
	
	// Creamos la variable dni para almacenar el dni que introduzca el usuario
	static String dni;
	
	public static void main(String[] args) {
		
		// Creamos un objeto CuentaCorriente llamado cuenta
		CuentaCorriente cuenta;
		
		// Creamos la variable respuesta para almacenar la respuesta del usuario
		String respuesta;
		
		// Pedimos al usuario que introduzca su dni
		System.out.println("BUENAS!" + "\n" + "Introduzca su DNI");
		dni = reader.nextLine();
		
		// Buscamos la cuenta
		cuenta = CuentaCorrienteCRUD.buscarCuenta(dni);
		
		// Si el usuario tiene una cuenta en BBVA
		if (cuenta != null) {
			
			// Imprimimos el menu
			main(cuenta);
			
		// Si el usuario no tiene una cuenta BBVA
		} else {
			
			// Preguntamos al usuario si quiere crearse una cuenta
			System.out.println("No tienes cuenta BBVA. ¿Quieres crearte una? (si/no)");
			respuesta = reader.nextLine();
			
			// Si responde si 
			if (respuesta.equalsIgnoreCase("si")) {
				
				// Creamos la cuenta
				cuenta = crearCuenta();
				
				// Añadimos la cuenta al conjunto
				if (CuentaCorrienteCRUD.añadirCuenta(cuenta)) {
					
					// Indicamos al usuario que la cuenta se ha añadido correctamente
					System.out.println("La cuenta se ha añadido correctamente en el sistema");
					
					// Imprimimos el menu
					main(cuenta);
					
				} else {
					System.out.println("La cuenta no se ha podido añadir");
				}
			
			// Si responde no
			} else {
				System.out.println("Vuelva cuando necesite! Gracias");
			}
		}
		
		// Cerramos el scanner
		reader.close();
	}

	
	

	private static void main(CuentaCorriente cuenta) {
		
		// Creamos la variable opcion para almacenar la opcion que introduzca el usuario
		int opcion;
		
		// Creamos la variable cantidad para almacenar la cantidad de dinero que introduzca el usuario
		int cantidad;
		
		// Mientras que el usuario no seleccione la opcion 3
		do {
			
			// Pintamos el menu
			menu();
			
			// Pedimos al usuario que introduzca una opcion
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();
			
			// Dependiendo de la opcion que introduzca el usuario
			switch (opcion) {
			
				// Ingresar dinero
				case 1 -> {
					
					// Pedimos al usuario que introduzca la cantidad de dinero a ingresar
					System.out.println("Introduzca la cantidad de dinero a ingresar");
					cantidad = reader.nextInt();
					
					// Ingresamos el dinero
					if (cuenta.ingresarDinero(cantidad)) {
						System.out.println("El dinero se ha ingresado correctamente -> +" + cantidad + " €");
					} else {
						System.out.println("El dinero no se ha podido ingresar");
					}
				}
				
				// Retirar dinero
				case 2 -> {
					
					// Pedimos al usuario que introduzca la cantidad de dinero a retirar
					System.out.println("Introduzca la cantidad de dinero a retirar");
					cantidad = reader.nextInt();
					
					// Retirar dinero
					if (cuenta.sacarDinero(cantidad)) {
						System.out.println("El dinero se ha retirado correctamente -> -" + cantidad + " €");
					} else {
						System.out.println("El dinero no se ha podido retirar");
					}
				}
				
				// Consultar saldo
				case 3 -> {
					System.out.println("Saldo -> " + cuenta.getSaldo());
				}
				
				// Darse de baja
				case 4 -> {
					
					// Eliminamos la cuenta
					if (CuentaCorrienteCRUD.eliminarCuenta(cuenta)) {
						System.out.println("La cuenta se ha eliminado correctamente");
					} else {
						System.out.println("La cuenta no se ha podido eliminar. Retira todo tu dinero antes de eliminar la cuenta");
					}
				}
				
				// Salir
				case 5 -> {
					System.out.println("Gracias por elegir BBVA!");
				}
				
				// Opcion no valida
				default -> {
					System.out.println("Introduzca una opcion valida");
				}
			}
		} while (opcion != 5);
	}
	
	
	private static void menu() {
		System.out.println("BIENVENIDO A TU CUENTA BBVA");
		System.out.println("---------------------------");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Retirar dinero");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Darse de baja");
		System.out.println("5. Salir");
	}
	
	
	private static CuentaCorriente crearCuenta() {
		
		// Creamos estas variables para almacenar los valores de los atributos de la cuenta
		int saldo;
		String nacionalidad;
		String nombre;
		
		// Pedimos al usuario que introduzca el nombre
		System.out.println("Introduzca su nombre y apellidos");
		nombre = reader.nextLine();
		
		// Pedimos al usuario que introduzca su nacionalidad
		System.out.println("Introduzca su nacionalidad");
		nacionalidad = reader.nextLine();
		
		// Pedimos al usuario que introduzca el saldo inicial
		System.out.println("Introduzca el saldo inicial");
		saldo = reader.nextInt();
		
		// Creamos la cuenta
		CuentaCorriente cuenta = new CuentaCorriente(dni, saldo, nacionalidad, nombre);
		
		// Devolvemos la cuenta
		return cuenta;
	}

	
}
