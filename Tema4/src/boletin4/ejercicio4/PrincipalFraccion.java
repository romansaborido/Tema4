package boletin4.ejercicio4;

public class PrincipalFraccion {

	public static void main(String[] args) {
		
		// Creamos fracciones
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(1, 3);

        // Sumamos fracciones
        Fraccion f3 = f1.suma(f2);
        System.out.println("Suma: " + f3);  // 5/6

        // Restamos fracciones
        Fraccion f4 = f1.resta(f2);
        System.out.println("Resta: " + f4);  // 1/6

        // Multiplicamos fracciones
        Fraccion f5 = f1.multiplica(f2);
        System.out.println("Multiplicación: " + f5);  // 1/6

        // Dividimos fracciones
        Fraccion f6 = f1.divide(f2);
        System.out.println("División: " + f6);  // 3/2
	}
}
