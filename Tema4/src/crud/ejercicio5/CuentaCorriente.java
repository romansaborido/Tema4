package crud.ejercicio5;

import java.util.Objects;

public class CuentaCorriente {
    
    /** Número de identificación del titular de la cuenta */
    private String dni;
    
    /** Saldo actual de la cuenta */
    private int saldo;
    
    /** Nacionalidad del titular de la cuenta */
    private String nacionalidad;
    
    /** Nombre del titular de la cuenta */
    private String nombre;
    
    /**
     * Constructor que inicializa una cuenta con solo el DNI
     * @param dni El DNI del titular de la cuenta (debe ser válido: 9 caracteres)
     */
    public CuentaCorriente(String dni) {
        
        // Verificamos que el DNI no sea null, no esté vacío y tenga exactamente 9 caracteres
        if (dni != null && !dni.isBlank() && dni.length() == 9) {
            this.dni = dni;
        }
    }
    
    /**
     * Constructor que inicializa todos los atributos de la cuenta
     * @param dni El DNI del titular de la cuenta (debe ser válido: 9 caracteres)
     * @param saldo El saldo inicial de la cuenta (debe ser mayor que 0)
     * @param nacionalidad La nacionalidad del titular
     * @param nombre El nombre del titular
     */
    public CuentaCorriente(String dni, int saldo, String nacionalidad, String nombre) {
        
        // Verificamos que el DNI sea válido
        if (dni != null && !dni.isBlank() && dni.length() == 9) {
            this.dni = dni;
        }
        
        // Verificamos que el saldo sea mayor que cero
        if (saldo > 0) {
            this.saldo = saldo;
        }
        
        // Verificamos que la nacionalidad no sea null ni esté vacía
        if (nacionalidad != null && !nacionalidad.isBlank()) {
            this.nacionalidad = nacionalidad;
        }
        
        // Verificamos que el nombre no sea null ni esté vacío
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }
    
    /**
     * Obtiene el DNI de la cuenta
     * @return El DNI del titular de la cuenta
     */
    public String getDni() {
        return this.dni;
    }
    
    /**
     * Obtiene el saldo actual de la cuenta
     * @return El saldo actual de la cuenta
     */
    public int getSaldo() {
        return this.saldo;
    }
    
    /**
     * Obtiene la nacionalidad del titular de la cuenta
     * @return La nacionalidad del titular
     */
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    /**
     * Obtiene el nombre del titular de la cuenta
     * @return El nombre del titular de la cuenta
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Establece un nuevo saldo para la cuenta
     * @param saldo El nuevo saldo para la cuenta (debe ser mayor o igual a 0)
     * @return true si el saldo fue actualizado correctamente, false si no
     */
    public boolean setSaldo(int saldo) {
        
        boolean res = false;
        
        // Solo actualizamos el saldo si es mayor o igual a cero
        if (saldo >= 0) {
            this.saldo = saldo;
            res = true;
        }
        
        return res;
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta
     * @param cantidad La cantidad de dinero a ingresar (debe ser positiva)
     * @return true si el ingreso fue exitoso, false si no
     */
    public boolean ingresarDinero(int cantidad) {
        
        // Creamos un booleano y lo inicializamos a false
        boolean res = false;
        
        // Solo permitimos el ingreso si la cantidad es positiva
        if (cantidad > 0) {
            this.saldo = this.saldo + cantidad;
            res = true;
        }
        
        return res;
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta
     * @param cantidad La cantidad de dinero a retirar (debe ser menor o igual al saldo actual)
     * @return true si la retirada fue exitosa, false si no
     */
    public boolean sacarDinero(int cantidad) {
        
        // Creamos un booleano y lo inicializamos a false
        boolean res = false;

        // Solo permitimos la retirada si hay suficiente saldo en la cuenta
        if (cantidad <= this.saldo) {
            this.saldo = this.saldo - cantidad;
            res = true;
        }

        return res;
    }
    
    /**
     * Compara dos objetos CuentaCorriente para ver si son iguales
     * Dos cuentas se consideran iguales si tienen el mismo DNI
     * @param obj El objeto con el que comparar
     * @return true si las cuentas tienen el mismo DNI, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        
        boolean res = false;
        
        // Comprobamos que el objeto sea una instancia de CuentaCorriente
        if (obj instanceof CuentaCorriente) {
            CuentaCorriente cuenta = (CuentaCorriente) obj;
            
            // Comparamos los DNIs de ambas cuentas
            if (this.dni.equals(cuenta.dni)) {
                res = true;
            }
        }
        
        return res;
    }
    
    /**
     * Calcula el código hash de la cuenta basado en el DNI
     * @return El código hash basado en el DNI de la cuenta
     */
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}

