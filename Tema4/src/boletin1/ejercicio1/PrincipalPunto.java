package boletin1.ejercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrincipalPunto {

	public static void main(String[] args) {
		
		// Creamos la variable x para almacenar la coordenada de X que introduzca el usuario
		int x;
		
		// Creamos la variable y para almacenar la coordenada de Y que introduzca el usuario
		int y;
		
		// Declaramos el primer objeto punto llamado punto1
		Punto punto1 = null;
		
		// Declaramos el segundo objeto punto llamado punto2
		Punto punto2 = null;
		
		// Declaramos el tercer objeto punto llamado punto3
		Punto punto3 = null;
		
		// Creamos un objeto DecimalFormat con el patrón para un decimal
        DecimalFormat df = new DecimalFormat("#.#");
		
		// Creamos la variable distancia para almacenar el resultado del metodo distancia
		double distancia;
		
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
				punto1 = new Punto(x, y);
			} else if (i == 2) {
				punto2 = new Punto(x, y);
			} else {
				punto3 = new Punto(x, y);
			}
		}
		
		
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 1 -> (" + punto1.getX() + "," + punto1.getY() + ")");
		
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 2 -> (" + punto2.getX() + "," + punto2.getY() + ")");
				
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 3 -> (" + punto3.getX() + "," + punto3.getY() + ")" + "\n");
		
		// Probamos el metodo toString
		System.out.println("Posicion punto1 -> " + punto1.toString());
		
		// Probamos el metodo distancia
		distancia = punto1.distancia(punto2);
		System.out.println("Distancia entre punto1 y punto2 -> " + df.format(distancia));
		
		// Probamos el metodo desplaza
		punto3.desplaza(7, -2);
		System.out.println("Punto 3 desplazado -> " + punto3);
		
		// Probamos el metodo setXY
		punto3.setXY(100,4);
		System.out.println("Posicion de punto3 modificada -> " + punto3);
		
		
		// Cerramos el scanner
		reader.close();
	}
	
}
