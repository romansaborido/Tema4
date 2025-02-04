package boletin1.ejercicio1;

import java.util.Scanner;

public class PrincipalPuntoB {

	public static void main(String[] args) {
		
		// Creamos la variable x para almacenar la coordenada de X que introduzca el usuario
		int x;
		
		// Creamos la variable y para almacenar la coordenada de Y que introduzca el usuario
		int y;
		
		// Creamos el primer objeto punto llamado punto1
		PuntoB punto1 = null;
		
		// Creamos el segundo objeto punto llamado punto2
		PuntoB punto2 = null;
		
		// Creamos el tercer objeto punto llamado punto3
		PuntoB punto3 = null;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Instanciamos los tres puntos
		for (int i = 1 ; i <= 3 ; i++) {
			
			// Mostramos el punto al que estamos asignando los atributos
			System.out.println("PUNTO " + i);
			
			// Pedimos al usuario que introduzca la coordenada X
			System.out.println("Introduzca la coordenada X");
			x = reader.nextInt();
						
			// Pedimos al usuario que introduzca la coordenada Y
			System.out.println("Introduzca la coordenada Y");
			y = reader.nextInt();	
			
			// Salto de linea
			System.out.println();
			
			// Creamos el objeto
			if (i == 1) {
				punto1 = new PuntoB(x, y);
			} else if (i == 2) {
				punto2 = new PuntoB(x, y);
			} else {
				punto3 = new PuntoB(x, y);
			}
		}
				
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 1 -> (" + punto1.x + "," + punto1.y + ")");
		
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 2 -> (" + punto2.x + "," + punto2.y + ")");
				
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 3 -> (" + punto3.x + "," + punto3.y + ")" + "\n");
		
		// Cerramos el scanner
		reader.close();
	}
	
}
