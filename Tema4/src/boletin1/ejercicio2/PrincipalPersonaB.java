package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersonaB {

	public static void main(String[] args) {

		// Instanciamos la primera persona llamada per1
		PersonaB per1 = null;

		// Instanciamos la primera persona llamada per2
		PersonaB per2 = null;

		// Creamos las variables correspondientes a los atributos
		String dni;
		String nombre;
		String apellidos;
		int edad;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un bucle for para controlar el turno de entrada
		for (int i = 1; i <= 2; i++) {

			// Pedimos al usuario que introduzca los datos de la primera persona
			System.out.println("Introduzca los datos de PERSONA " + i);

			// Pedimos el dni
			System.out.print("DNI: ");
			dni = reader.nextLine();

			// Pedimos el nombre
			System.out.print("NOMBRE: ");
			nombre = reader.nextLine();

			// Pedimos los apellidos
			System.out.print("APELLIDOS: ");
			apellidos = reader.nextLine();

			// Pedimos la edad
			System.out.print("EDAD: ");
			edad = reader.nextInt();
			
			// Limpiamos el buffer del scanner
			reader.nextLine();
			
			// Salto de linea
			System.out.println();

			// Creamos el objeto
			if (i == 1) {
				per1 = new PersonaB(dni, nombre, apellidos, edad);
			} else {
				per2 = new PersonaB(dni, nombre, apellidos, edad);
			}

		}

		// Imprimimos la persona 1
		System.out.print(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " ");
		if (per1.edad >= 18) {
			System.out.println("es mayor de edad");
		} else {
			System.out.println("no es mayor de edad");
		}

		// Imprimimos la persona 2
		System.out.print(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " ");
		if (per1.edad >= 18) {
			System.out.println("es mayor de edad");
		} else {
			System.out.println("no es mayor de edad");
		}

		// Cerramos el scanner
		reader.close();

	}

}
