package boletin3.ejercicio6;

import java.util.Scanner;

public class PrincipalFuncionesMatematicas {

	public static void main(String[] args) {
		
		int numero;
		double a = 2;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		numero = reader.nextInt();
		
		System.out.println(FuncionesMatematicas.sumatorio(numero));
		System.out.println(FuncionesMatematicas.potencia(a,numero));
		System.out.println(FuncionesMatematicas.serieFibonacci(numero));
		
		reader.close();
	}

}
