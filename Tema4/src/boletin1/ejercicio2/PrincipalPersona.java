package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// Instanciamos la primera persona llamada per1
		Persona per1 = new Persona();

		// Instanciamos la primera persona llamada per2
		Persona per2 = new Persona();

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un bucle for para controlar el turno de entrada
		for (int i = 1; i <= 2; i++) {

			// Controlamos la persona que estamos modificando
			Persona persona = (i == 1) ? per1 : per2;

			// Pedimos al usuario que introduzca los datos de la primera persona
			System.out.println("Introduzca los datos de PERSONA " + i);

			// Pedimos el dni
			System.out.print("DNI: ");
			persona.dni = reader.nextLine();

			// Pedimos el nombre
			System.out.print("NOMBRE: ");
			persona.nombre = reader.nextLine();

			// Pedimos los apellidos
			System.out.print("APELLIDOS: ");
			persona.apellidos = reader.nextLine();

			// Pedimos la edad
			System.out.print("EDAD: ");
			persona.edad = reader.nextInt();
			
			// Limpiamos el buffer del scanner
			reader.nextLine();

			// Imprimimos el objeto
			System.out.print(persona.nombre + " " + persona.apellidos + " con DNI " + persona.dni + " ");
			
			if (persona.edad >= 18) {
				System.out.println("es mayor de edad" + "\n");
			} else {
				System.out.println("no es mayor de edad" + "\n");
			}
		}
		
		// Cerramos el scanner
		reader.close();

	}

}
