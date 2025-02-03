package boletin1.ejercicio3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		// Instanciamos el primer rectangulo llamado rectangulo1
		Rectangulo rectangulo1 = new Rectangulo();
		
		// Instanciamos el segundo rectangulo llamado rectangulo2
		Rectangulo rectangulo2 = new Rectangulo();
		
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
		
		// Mostramos las propiedades del primer rectangulo
		System.out.println("RECTANGULO 1");
		System.out.println("Coordenadas -> " + "(" + rectangulo1.x1 + "," + rectangulo1.y1 + ")" + " " + "(" + rectangulo1.x2 + "," + rectangulo1.y2 + ")");
		System.out.println("Perímetro -> ");
		

	}

}
