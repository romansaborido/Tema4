package boletin1.ejercicio3;


import java.util.Scanner;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		// Instanciamos el primer rectangulo llamado rectangulo1
		Rectangulo rectangulo1 = null;
		
		// Instanciamos el segundo rectangulo llamado rectangulo2
		Rectangulo rectangulo2 = null;
		
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
		
		// Pedimos al usuario que introduzca los atributos de los rectangulos
		for (int i = 1 ; i <= 2 ; i++) {
			
			// Datos del rectangulo:
			System.out.println("RECTANGULO " + i);
			
			// Pedimos al usuario que introduzca la primera coordenada horizontal
			System.out.println("Introduzca la coordenada X1");
			x1 = reader.nextInt();
			
			// Pedimos al usuario que introduzca la segunda coordenada horizontal
			System.out.println("Introduzca la coordenada X2");
			x2 = reader.nextInt();
			
			// Pedimos al usuario que introduzca la primera coordenada vertical
			System.out.println("Introduzca la coordenada Y1");
			y1 = reader.nextInt();
			
			// Pedimos al usuario que introduzca la segunda coordenada vertical
			System.out.println("Introduzca la coordenada Y2");
			y2 = reader.nextInt();
			
			// Creamos el objeto
			if (i == 1) {
				rectangulo1 = new Rectangulo(x1,x2,y1,y2);
			} else {
				rectangulo2 = new Rectangulo(x1,x2,y1,y2);
			}
			
			// Salto de linea
			System.out.println();
		}
			
//		// Modificamos los atributos de los rectangulos
//		for (int i = 1 ; i <= 2 ; i++) {
//			
//			// Controlamos que objeto estamos modificando
//			Rectangulo rectangulo = (i == 1) ? rectangulo1 : rectangulo2;
//			
//			// Mostramos que objeto estamos modificando
//			System.out.println("RECTANGULO " + i);
//			
//			// Pedimos al usuario que modifique la coordenada X1
//			System.out.println("Modifica la coordenada X1");
//			x1 = reader.nextInt();
//			rectangulo.setX1(x1);
//			
//			// Pedimos al usuario que modifique la coordenada X2
//			System.out.println("Modifica la coordenada X2");
//			x2 = reader.nextInt();
//			rectangulo.setX2(x2);
//			
//			// Pedimos al usuario que modifique la coordenada Y1
//			System.out.println("Modifica la coordenada Y1");
//			y1 = reader.nextInt();
//			rectangulo.setY1(y1);
//			
//			// Pedimos al usuario que modifique la coordenada Y2
//			System.out.println("Modifica la coordenada Y2");
//			y2 = reader.nextInt();
//			rectangulo.setY2(y2);
//			
//			// Salto de linea
//			System.out.println();
//		}
		
		
		// Mostramos las propiedades de los rectangulos
		for (int i = 1 ; i <= 2 ; i++) {
				
			// Controlamos los turnos
			Rectangulo rectangulo = (i == 1) ? rectangulo1 : rectangulo2;
				
			// Mostramos el nombre del rectangulo
			System.out.println("RECTANGULO " + i);
				
			// Mostramos las coordenadas
			System.out.println("Coordenadas -> " + "(" + rectangulo.getX1() + "," + rectangulo.getY1() + ")" + " " + "(" + rectangulo.getX2() + "," + rectangulo.getY2() + ")");
				
			// Mostramos el perimetro usando el metodo getPerimetro
			System.out.println("Perímetro -> "  + rectangulo.getPerimetro());
			
			// Mostramos el area usando el metodo getArea
			System.out.println("Área -> " + rectangulo.getArea());
				
			// Salto de linea
			System.out.println();
		}
		
		// Probamos el metodo setX1Y1, setX2Y2 y toString
		System.out.println("RECTÁNGULO 1");
		rectangulo1.setX1Y1(10, 20);
		rectangulo1.setX2Y2(20, 40);
		System.out.println(rectangulo1.toString() + "\n");
		
		// Probamos el metodo setAll y toString
		System.out.println("RECTÁNGULO 2");
		rectangulo2.setAll(10, 20, 20, 40);
		System.out.println(rectangulo2.toString());
		
		// Cerramos el scanner
		reader.close();
		

	}

}
