package boletin4.ejercicio2;

public class Contador {
    
    /**
     * El valor del contador
     */
    private int cont;
    
    /**
     * Constructor que inicializa el contador con un valor dado
     * 
     * @param cont El valor inicial del contador. Debe ser un número mayor o igual a cero
     */
    public Contador(int cont) {
        if (cont >= 0) {
            this.cont = cont;
        }
    }
    
    /**
     * Obtiene el valor actual del contador
     * 
     * @return El valor del contador
     */
    public int getCont() {
        return this.cont;
    }
    
    /**
     * Establece un nuevo valor al contador
     * 
     * @param cont El nuevo valor del contador. Debe ser un número mayor o igual a cero
     * @return True si el valor fue actualizado correctamente, false si el valor es negativo
     */
    public boolean setCont(int cont) {
        boolean res = false;
        if (cont >= 0) {
            this.cont = cont;
        }
        return res;
    }
    
    /**
     * Incrementa el valor del contador en 1
     */
    public void incrementar() {
        this.cont++;
    }
    
    /**
     * Decrementa el valor del contador en 1
     * Si el valor es menor que cero después de decrementar, se ajusta a cero
     */
    public void decrementar() {
        this.cont--;
        if (this.cont < 0) {
            this.cont = 0;
        }
    }
}

