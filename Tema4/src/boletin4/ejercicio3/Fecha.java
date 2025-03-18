package boletin4.ejercicio3;

public class Fecha {
    
	/**
	 * Dia del mes
	 */
    private int dia;
    
    /**
     * Mes del año
     */
    private int mes;
    
    /**
     * Año
     */
    private int año;
    
    
    
    /**
     * Constructor de la clase Fecha. Valida la fecha antes de asignar los valores a año, mes y día
     * 
     * @param año El año de la fecha.
     * @param mes El mes de la fecha (1-12)
     * @param dia El día de la fecha (1-31)
     */
    public Fecha(int año, int mes, int dia) {
        
        if (fechaCorrecta(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        }
    }
    
    
    
    /**
     * Obtiene el día de la fecha
     * 
     * @return El día de la fecha
     */
    public int getDia() {
        return this.dia;
    }
    
    /**
     * Obtiene el mes de la fecha
     * 
     * @return El mes de la fecha
     */
    public int getMes() {
        return this.mes;
    }
    
    /**
     * Obtiene el año de la fecha
     * 
     * @return El año de la fecha
     */
    public int getAño() {
        return this.año;
    }
    
    /**
     * Establece el día de la fecha
     * 
     * @param dia El nuevo día de la fecha
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Establece el mes de la fecha
     * 
     * @param mes El nuevo mes de la fecha (1-12)
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Establece el año de la fecha
     * 
     * @param año El nuevo año de la fecha
     */
    public void setAño(int año) {
        this.año = año;
    }

    
    
    /**
     * Verifica si el año de la fecha es bisiesto o no
     * 
     * @return true si el año es bisiesto, false en caso contrario
     */
    public boolean esBisiesto() {
        
        boolean res = false;
        
        if ((this.año % 4 == 0 && this.año % 100 != 0) || (this.año % 400 == 0)) {
            res = true;
        }
        
        return res;
    }
    
    
    /**
     * Verifica si la fecha proporcionada es válida
     * 
     * @param año El año de la fecha
     * @param mes El mes de la fecha (1-12)
     * @param dia El día de la fecha (1-31)
     * @return true si la fecha es válida, false en caso contrario
     */
    private boolean fechaCorrecta(int año, int mes, int dia) {
        
        // Boolean que almacena el resultado
        boolean res = false;

        // Comprobamos los valores
        if ((año >= 1000 && año <= 3000) && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31)) {

            // Si el año es bisiesto
            if (this.esBisiesto()) {
                
                // Comprobamos los días del mes para un año bisiesto
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        if (dia <= 31) {
                            res = true;
                        }
                    }
                    case 2 -> {
                        if (dia <= 29) {
                            res = true;
                        }
                    }
                    default -> {
                        if (dia <= 30) {
                            res = true;
                        }
                    }
                }
                
            // Si el año no es bisiesto
            } else {
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        if (dia <= 31) {
                            res = true;
                        }
                    }
                    case 2 -> {
                        if (dia <= 28) {
                            res = true;
                        }
                    }
                    default -> {
                        if (dia <= 30) {
                            res = true;
                        }
                    }
                }
            }
        }

        // Devolvemos el resultado
        return res;
    }

    
    /**
     * Incrementa el día de la fecha al siguiente día. Si el día excede el número de días válidos del mes,
     * se ajusta el mes y el año correctamente
     */
    public void diaSiguiente() {
        
        // Incrementamos el dia
        this.dia++;
        
        // Si la fecha no es correcta
        if (!fechaCorrecta(this.año, this.mes, this.dia)) {
            this.dia = 1;
            this.mes++;
            if (this.mes == 13) {
                this.mes = 1;
                this.año++;
            }
        }
    }
    
    
    
    /**
     * Devuelve la fecha en formato de cadena (DD-MM-AAAA)
     * 
     * @return La fecha en formato de cadena
     */
    @Override
    public String toString() {
        
        String fecha = "";
        
        if (dia / 10 < 1) {
            fecha += "0" + this.dia + "-";
        } else {
            fecha += this.dia + "-";
        }
        
        if (mes / 10 < 1) {
            fecha += "0" + this.mes + "-";
        } else {
            fecha += this.mes + "-";
        }
        
        fecha += this.año;
        
        return fecha;
    }
    
    
}

