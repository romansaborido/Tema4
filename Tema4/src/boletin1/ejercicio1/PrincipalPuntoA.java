package boletin1.ejercicio1;

public class PrincipalPuntoA {

	public static void main(String[] args) {
		
		// Instanciamos el primer objeto punto llamado punto1
		PuntoA punto1 = new PuntoA();
		
		// Instanciamos el segundo objeto punto llamado punto2
		PuntoA punto2 = new PuntoA();
		
		// Instanciamos el tercer objeto punto llamado punto3
		PuntoA punto3 = new PuntoA();
		
		// Establecemos las coordenadas de punto1
		punto1.x = 5;
		punto1.y = 0;
		
		// Establecemos las coordenadas de punto2
		punto2.x = 10;
		punto2.y = 10;
		
		// Establecemos las coordenadas de punto3
		punto3.x = -3;
		punto3.y = 7;
		
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 1 -> (" + punto1.x + "," + punto1.y + ")");
		
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 2 -> (" + punto2.x + "," + punto2.y + ")");
				
		// Imprimimos las coordenadas de punto1
		System.out.println("Punto 3 -> (" + punto3.x + "," + punto3.y + ")" + "\n");
		
		// Modificamos las coordenadas utilizando operadores
		punto1.x += 5;
		punto1.y = 0;
		punto2.x = punto2.x % 2;
		punto2.y = 10 * 10;
		punto3.x = -3 - 8;
		punto3.y = 7 / punto1.x;
		
		// Volvemos a imprimir las coordenadas
		System.out.println("Punto 1 -> (" + punto1.x + "," + punto1.y + ")");
		System.out.println("Punto 2 -> (" + punto2.x + "," + punto2.y + ")");
		System.out.println("Punto 3 -> (" + punto3.x + "," + punto3.y + ")");
	}

}
