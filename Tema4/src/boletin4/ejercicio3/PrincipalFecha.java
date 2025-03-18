package boletin4.ejercicio3;

import java.util.Scanner;

public class PrincipalFecha {

    // Creamos el scanner
    static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Variable para almacenar la opcion que introduzca el usuario
        int opcion;
        
        // Damos la bienvenida al usuario
        System.out.println("Bienvenido a FECHAR.io" + "\n");
        
        // Creamos la fecha usando el método creaFecha
        Fecha fecha = creaFecha();
        
        // Si la fecha es válida (no es cero)
        if (fecha.getAño() != 0 && fecha.getDia() != 0 && fecha.getMes() != 0) {
                
            // Mientras que el usuario no elija la opción 3 (salir)
            do {
                
                // Imprimimos el menú con las opciones
                menu(fecha);
                
                // Solicitamos al usuario que introduzca una opción
                System.out.println("Introduzca una opcion");
                opcion = reader.nextInt();
                
                // Ejecutamos el caso según la opción seleccionada
                switch (opcion) {
                
                	// Año bisiesto
                    case 1 -> {
                    	
                        // Verificamos si el año es bisiesto y mostramos el resultado
                        if (fecha.esBisiesto()) {
                            System.out.println("El año de la fecha que has introducido !ES BISIESTO¡");
                        } else {
                            System.out.println("El año de la fecha que has introducido no es bisiesto");
                        }
                    }
                    
                    // Incrementa fecha
                    case 2 -> {
                    	
                        // Llamamos al método para incrementar el día de la fecha
                        fecha.diaSiguiente();
                    }
                    
                    // Salir
                    case 3 -> {
                    	
                        // Mensaje de salida cuando el usuario elige terminar el programa
                        System.out.println("Fin del programa");
                    }
                }
            } while (opcion != 3);
            
        // Si la fecha no es válida, mostramos un mensaje de error
        } else {
            System.err.println("La fecha que has introducido no es valida. Comprueba los dias del mes dependiendo del año");
        }
    }
    
    
    
    /**
     * Imprime el menú con las opciones disponibles
     * 
     * @param fecha El objeto Fecha actual, que se muestra en la interfaz del menú
     */
    private static void menu(Fecha fecha) {
    	
        // Mostramos la fecha actual y las opciones disponibles
        System.out.println("\n" + fecha + "\n" + "--------");
        System.out.println("1. ¿Es bisiesto?");
        System.out.println("2. Dia siguiente");
        System.out.println("3. Salir");
    }
    
    
    /**
     * Crea un objeto Fecha a partir de los datos proporcionados por el usuario
     * 
     * @return Un objeto Fecha con la fecha proporcionada
     */
    private static Fecha creaFecha() {
        
        // Variables para almacenar día, mes y año
        int dia;
        int mes;
        int año;
        
        // Pedimos al usuario que ingrese el día
        System.out.println("Introduzca el dia");
        dia = reader.nextInt();
        
        // Pedimos al usuario que ingrese el mes
        System.out.println("Introduzca el mes");
        mes = reader.nextInt();
        
        // Pedimos al usuario que ingrese el año
        System.out.println("Introduzca el año");
        año = reader.nextInt();
        
        // Creamos un objeto Fecha con los datos ingresados
        Fecha fecha = new Fecha(año, mes, dia);
        
        // Devolvemos el objeto Fecha creado
        return fecha;
    }
}

