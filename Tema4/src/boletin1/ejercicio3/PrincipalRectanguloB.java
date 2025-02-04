package boletin1.ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class PrincipalRectanguloB {

	public static void main(String[] args) {
		
		// Instanciamos el primer rectangulo llamado rectangulo1
		RectanguloB rectangulo1;
		
		// Instanciamos el segundo rectangulo llamado rectangulo2
		RectanguloB rectangulo2;
		
		// Creamos la variable longitudX para almacenar la longitud horizontal
		int longitudX;
		
		// Creamos la variable longitudY para almacenar la longitud vertical
		int longitudY;
		
		// Creamos la variable x1 para almacenar la primera coordenada horizontal
		int x1;
		
		// Creamos la variable x2 para almacenar la segunda coordenada horizontal
		int x2;
		
		// Creamos la variable y1 para almacenar la primera coordenada vertical
		int y1;
		
		// Creamos la variable y2 para almacenar la segunda coordenada vertical
		int y2;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
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
			
			// Mostramos las propiedades de los rectangulos
			for (int j = 1 ; j <= 2 ; j++) {
				
				// Controlamos los turnos
				RectanguloB rectangulo = (j == 1) ? rectangulo1 : rectangulo2;
				
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
			
		// Cerramos el scanner
		reader.close();
		

	}

}
