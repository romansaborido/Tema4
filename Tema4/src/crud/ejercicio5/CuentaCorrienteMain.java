package crud.ejercicio5;

import java.util.Scanner;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		
		// Creamos la variable opcion para almacenar la opcion que introduzca el usuario
		int opcion;
		
		// Creamos la variable dni para almacenar el dni que introduzca el usuario
		String dni;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca su dni
		System.out.println("DNI -> ");
		dni = reader.nextLine();
		
		// Buscamos la cuenta
		CuentaCorrienteCRUD.buscarCuenta(dni);
		
		
		// Mientras que el usuario no introduzca la opcion 3
		//do {
			
			
			
		//} while (opcion != 3);

	}
	
	private static void menu() {
		System.out.println("BIENVENIDO A TU CUENTA BBVA");
		System.out.println("---------------------------");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Retirar dinero");
	}

}
