package boletin1.ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class PrincipalRectanguloA {

	public static void main(String[] args) {
		
		// Instanciamos el primer rectangulo llamado rectangulo1
		RectanguloA rectangulo1 = new RectanguloA();
		
		// Instanciamos el segundo rectangulo llamado rectangulo2
		RectanguloA rectangulo2 = new RectanguloA();
		
		// Creamos la variable longitudX para almacenar la longitud horizontal
		int longitudX;
		
		// Creamos la variable longitudY para almacenar la longitud vertical
		int longitudY;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos la clase random para generar coordenadas aleatoriamente
		Random rand = new Random();
		
		// Establecemos las coordenadas del rectangulo1
		rectangulo1.x1 = 0;
		rectangulo1.y1 = 0;
		rectangulo1.x2 = 5;
		rectangulo1.y2 = 5;
		
		// Establecemos las coordenadas del rectangulo2
		rectangulo2.x1 = 7;
		rectangulo2.y1 = 9;
		rectangulo2.x2 = 2;
		rectangulo2.y2 = 3;
		
		// Mostramos las propiedades de los dos rectangulos dos veces
		for (int i = 0 ; i < 2  ; i++) {
			
			// Mostramos las propiedades de los rectangulos
			for (int j = 1 ; j <= 2 ; j++) {
				
				// Controlamos los turnos
				RectanguloA rectangulo = (j == 1) ? rectangulo1 : rectangulo2;
				
				// Mostramos el nombre del rectangulo
				System.out.println("RECTANGULO " + j);
				
				// Mostramos las coordenadas
				System.out.println("Coordenadas -> " + "(" + rectangulo.x1 + "," + rectangulo.y1 + ")" + " " + "(" + rectangulo.x2 + "," + rectangulo.y2 + ")");
				
				// Calculamos la longitud de los lados
				longitudX = rectangulo.x1 > rectangulo.x2 ? rectangulo.x1 - rectangulo.x2 : rectangulo.x2 - rectangulo.x1;
				longitudY = rectangulo.y1 > rectangulo.y2 ? rectangulo.y1 - rectangulo.y2 : rectangulo.y2 - rectangulo.y1;
				
				// Mostramos el perimetro
				System.out.println("Perímetro -> " + (longitudX + longitudY));
				
				// Mostramos el area 
				System.out.println("Área -> " + (longitudX * longitudY));
				
				// Salto de linea
				System.out.println();
			}
			
			if (i == 0) {
				// Pulse enter para mostrar de nuevo los datos con posiciones aleatorias
				System.out.println("Pulse enter para mostrar de nuevo los datos con posiciones aleatorias");
				reader.nextLine();
			}
			
			// Cambiamos aleatoriamente las coordenadas de los rectangulos
			rectangulo1.x1 = rand.nextInt(0,11);
			rectangulo1.y1 = rand.nextInt(0,11);
			rectangulo1.x2 = rand.nextInt(0,11);
			rectangulo1.y2 = rand.nextInt(0,11);
			rectangulo2.x1 = rand.nextInt(0,11);
			rectangulo2.y1 = rand.nextInt(0,11);
			rectangulo2.x2 = rand.nextInt(0,11);
			rectangulo2.y2 = rand.nextInt(0,11);
		}
		
		// Cerramos el scanner
		reader.close();
		

	}

}
