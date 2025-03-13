package boletin3.ejercicio6;

import java.util.Scanner;

public class PrincipalFuncionesMatematicas {

    public static void main(String[] args) {
        
        // Declaramos una variable para almacenar el número introducido por el usuario
        int numero;
        
        // Declaramos una variable de tipo doble y la inicializamos con el valor 2
        double a = 2;
        
        // Creamos el scanner
        Scanner reader = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca un numero
        System.out.println("Introduzca un numero");
        numero = reader.nextInt();
        
        // Llamada al método 'sumatorio' y mostramos su resultado
        System.out.println(FuncionesMatematicas.sumatorio(numero));
        
        // Llamada al método 'potencia' y mostramos su resultado
        System.out.println(FuncionesMatematicas.potencia(a, numero));
        
        // Llamada al método 'serieFibonacci' y mostramos su resultado
        System.out.println(FuncionesMatematicas.serieFibonacci(numero));
        
        // Cerramos el scanner
        reader.close();
    }

}

