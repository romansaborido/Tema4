package boletin4.ejercicio4;

public class Fraccion {
    
	/**
	 * Numerador de la fracción
	 */
    private int numerador;
    
    /**
     * Denominador de la fracción
     */
    private int denominador;

    
    
    /**
     * Constructor que crea una fracción con un numerador y denominador especificados
     * @param numerador El numerador de la fracción
     * @param denominador El denominador de la fracción
     */
    public Fraccion(int numerador, int denominador) {
        
        if (denominador != 0) {
            this.denominador = denominador;
        }
        
        this.numerador = numerador;
        
        simplifica();
    }

    
    
    /**
     * Obtiene el numerador de la fracción
     * @return El numerador de la fracción
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Establece un nuevo numerador para la fracción
     * @param numerador El nuevo numerador
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplifica();
    }

    /**
     * Obtiene el denominador de la fracción
     * @return El denominador de la fracción
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Establece un nuevo denominador para la fracción
     * @param denominador El nuevo denominador
     */
    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
            simplifica();
        }
    }

    
    
    /**
     * Simplifica la fracción dividiendo el numerador y el denominador por su MCD
     */
    private void simplifica() {
        
        int mcd = gcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;

        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    
    /**
     * Calcula el máximo común divisor de dos números
     * @param a El primer número
     * @param b El segundo número
     * @return El máximo común divisor de a y b
     */
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    /**
     * Suma la fracción actual con otra fracción y devuelve el resultado como una nueva fracción
     * @param otra La fracción con la que se va a sumar
     * @return Una nueva fracción que es el resultado de la suma
     */
    public Fraccion suma(Fraccion otra) {
        
        int numeradorResultado = this.numerador * otra.denominador + this.denominador * otra.numerador;
        
        int denominadorResultado = this.denominador * otra.denominador;
        
        Fraccion resultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return resultado;
    }

    
    /**
     * Resta la fracción actual con otra fracción y devuelve el resultado como una nueva fracción
     * @param otra La fracción que se va a restar
     * @return Una nueva fracción que es el resultado de la resta
     */
    public Fraccion resta(Fraccion otra) {
        
        int numeradorResultado = this.numerador * otra.denominador - this.denominador * otra.numerador;
        
        int denominadorResultado = this.denominador * otra.denominador;
        
        Fraccion resultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return resultado;
    }

    
    /**
     * Multiplica la fracción actual con otra fracción y devuelve el resultado como una nueva fracción
     * @param otra La fracción con la que se va a multiplicar
     * @return Una nueva fracción que es el resultado de la multiplicación
     */
    public Fraccion multiplica(Fraccion otra) {
        
        int numeradorResultado = this.numerador * otra.numerador;
        
        int denominadorResultado = this.denominador * otra.denominador;
        
        Fraccion resultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return resultado;
    }

    
    /**
     * Divide la fracción actual por otra fracción y devuelve el resultado como una nueva fracción
     * @param otra La fracción por la que se va a dividir
     * @return Una nueva fracción que es el resultado de la división
     */
    public Fraccion divide(Fraccion otra) {
        
        if (otra.numerador == 0) {
            System.out.println("No se puede dividir entre 0");
        }
        
        int numeradorResultado = this.numerador * otra.denominador;
        
        int denominadorResultado = this.denominador * otra.numerador;
        
        Fraccion resultado = new Fraccion(numeradorResultado, denominadorResultado);
        
        return resultado;
    }

    
    
    /**
     * Representa la fracción como una cadena en formato numerador/denominador
     * @return La representación de la fracción como una cadena
     */
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}


