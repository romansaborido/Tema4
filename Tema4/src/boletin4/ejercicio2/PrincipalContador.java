package boletin4.ejercicio2;

import java.util.Scanner;

public class PrincipalContador {

    public static void main(String[] args) {
        
        // Creamos el scanner
        Scanner reader = new Scanner(System.in);
        
        // Variable para controlar el bucle del menú
        int opcion;
        
        // Variable para almacenar el valor del contador
        int valor;
        
        // Damos la bienvenida al usuario
        System.out.println("BIENVENIDO AL CONTADOR POSITIVO!" + "\n" + "------------------");
        
        // Pedimos al usuario que introduzca el valor del contador
        System.out.println("Introduzca el valor del contador");
        valor = reader.nextInt();
        
        // Creamos el contador
        Contador contador = new Contador(valor);
        
        // Mientras que el usuario no introduzca la opcion 3
        do {
        	
            // Pintamos el menu
            menu();
            
            // Pedimos al usuario que seleccione una opcion
            System.out.print("Selecciona una opción: ");
            opcion = reader.nextInt();
            
            // Dependiendo de la opcion que elija el usuario
            switch (opcion) {
            
            	// Incrementar contador
                case 1 -> {
                	
                    // Incrementamos el contador
                    contador.incrementar();
                    
                    // Mostramos el valor actual
                    System.out.println("Contador incrementado. Valor actual: " + contador.getCont());
                }
                
                // Decrementar contador
                case 2 -> {
                	
                    // Decrementamos el contador
                    contador.decrementar();
                    
                    // Mostramos el valor actual
                    System.out.println("Contador decrementado. Valor actual: " + contador.getCont());
            	}
                    
                // Salir
                case 3 -> {
                    System.out.println("Saliste del menú. ¡Hasta luego!");
                }
                
                // Opcion no valida
                default -> {
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 3.");
                }
            }
        } while (opcion != 3);
        
        // Cerramos el scanner
        reader.close();
    }

	private static void menu() {
		System.out.println("\n" + "--- Menú ---");
		System.out.println("1. Incrementar contador");
		System.out.println("2. Decrementar contador");
		System.out.println("3. Salir");
	}
}
