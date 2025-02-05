package boletin1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// Declaramos la primera persona llamada per1
		Persona per1 = null;

		// Declaramos la primera persona llamada per2
		Persona per2 = null;

		// Creamos las variables correspondientes a los atributos
		String dni;
		String nombre;
		String apellidos;
		int edad;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un bucle para pedir los atributos de los objetos al usuario
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
				per1 = new Persona(dni, nombre, apellidos, edad);
			} else {
				per2 = new Persona(dni, nombre, apellidos, edad);
			}
		}
		
		// Modificamos los datos de las dos personas
		for (int i = 1 ; i <= 2 ; i++) {
			
			// Controlamos la persona que estamos modificando
			Persona persona = (i == 1) ? per1 : per2;
			
			// Indicamos la persona que estamos modificando
			System.out.println("Modifica los datos de PERSONA " + i);
			
			// Pedimos al usuario que modifique el nombre
			System.out.print("NOMBRE: ");
			nombre = reader.nextLine();
			persona.setNombre(nombre);
			
			// Pedimos al usuario que modifique los apellidos
			System.out.print("APELLIDOS: ");
			apellidos = reader.nextLine();
			persona.setApellidos(apellidos);
			
			// Pedimos al usuario que modifique la edad
			System.out.print("EDAD: ");
			edad = reader.nextInt();
			persona.setEdad(edad);	
			
			// Limpiamos el buffer del scanner
			reader.nextLine();
			
			// Salto de linea
			System.out.println();
		}
		
		// Mostramos los datos de las dos personas
		for (int i = 1 ; i <= 2 ; i++) {
			
			// Controlamos la persona de la cual estamos mostrando los datos
			Persona persona = (i == 1) ? per1 : per2;
			
			// Mostramos los datos
			System.out.print("PERSONA " + i + " -> " + persona.getNombre() + " " + persona.getApellidos() + " con DNI " + persona.getDni());
			if (persona.getEdad() >= 18) {
				System.out.print(" es mayor de edad" + "\n");
			} else {
				System.out.print(" es menor de edad" + "\n");
			}
		}
		// Cerramos el scanner
		reader.close();

	}

}
