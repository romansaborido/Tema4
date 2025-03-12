package crud.ejercicio3;

public class Pizza {
    
    // Definimos los valores posibles para estado
    enum Estado {
        PEDIDA, SERVIDA
    }
    
    // Definimos los valores posibles para tipo
    enum Tipo {
        MARGARITA, CUATROQUESOS, FUNGHI
    }
    
    // Definimos los valores posibles para tamaño
    enum Tamaño {
        MEDIANA, FAMILIAR
    }
    
    // Creamos el atributo codigo para almacenar el código de la pizza
    private int codigo;
    
    // Creamos el atributo tamaño para almacenar el tamaño de la pizza
    private Tamaño tamaño = Tamaño.MEDIANA;
    
    // Creamos el atributo tipo para almacenar el tipo de la pizza
    private Tipo tipo = Tipo.MARGARITA;
    
    // Creamos el atributo estado para almacenar el estado de la pizza
    private Estado estado = Estado.PEDIDA;
    
    
    
    /**
     * Constructor a partir del código de la pizza, del tamaño y del tipo de la pizza.
     * @param codigo Tiene que ser mayor que 0.
     * @param tamaño Tiene que ser MEDIANA o FAMILIAR.
     * @param tipo Tiene que ser MARGARITA, CUATROQUESOS o FUNGHI.
     */
    public Pizza(int codigo, String tamaño, String tipo) {
        
        if (codigo > 0) {
            this.codigo = codigo;
        }
        
        switch (tamaño.toUpperCase()) {
            case "MEDIANA", "FAMILIAR" -> this.tamaño = Tamaño.valueOf(tamaño.toUpperCase());
        }
        
        switch (tipo.toUpperCase()) {
            case "MARGARITA", "CUATROQUESOS", "FUNGHI" -> this.tipo = Tipo.valueOf(tipo.toUpperCase());
        }
    }

    
    
    /**
     * Getter para obtener el código de la pizza
     * @return Código de la pizza
     */
    public int getCodigo() {
        return this.codigo;
    }


    /**
     * Getter para obtener el tamaño de la pizza
     * @return Tamaño de la pizza (MEDIANA o FAMILIAR)
     */
    public Tamaño getTamaño() {
        return this.tamaño;
    }

    /**
     * Setter para modificar el tamaño de la pizza
     * @param tamaño Tamaño de la pizza, puede ser MEDIANA o FAMILIAR
     */
    public boolean setTamaño(String tamaño) {
    	
    	boolean res = false;
    	
    	switch (tamaño) {
        	case "MEDIANA", "FAMILIAR" -> {
        		this.tamaño = Tamaño.valueOf(tamaño);
        		res = true;
        	}
        }
        	
    	return res;
    }

    
    /**
     * Getter para obtener el tipo de la pizza
     * @return Tipo de la pizza (MARGARITA, CUATROQUESOS o FUNGHI)
     */
    public Tipo getTipo() {
        return this.tipo;
    }

    /**
     * Setter para modificar el tipo de la pizza
     * @param tipo Tipo de la pizza, puede ser MARGARITA, CUATROQUESOS o FUNGHI
     */
    public boolean setTipo(String tipo) {
    	
    	boolean res = false;
    	
    	switch (tipo) {
        	case "MARGARITA", "CUATROQUESOS", "FUNGHI" -> {
        		this.tipo = Tipo.valueOf(tipo);
        		res = true;
        	}
        }
        	
    	return res;
    }

    
    /**
     * Getter para obtener el estado de la pizza
     * @return Estado de la pizza (PEDIDA o SERVIDA)
     */
    public Estado getEstado() {
        return this.estado;
    }

    /**
     * Setter para modificar el estado de la pizza
     * @param estado Estado de la pizza, puede ser PEDIDA o SERVIDA
     */
    public boolean setEstado(String estado) {
    	
    	boolean res = false;
    	
    	switch (estado) {
        	case "PEDIDA", "SERVIDA" -> {
        		this.estado = Estado.valueOf(estado);
        		res = true;
        	}
        }
        	
    	return res;
    }

    
    
    @Override
    public String toString() {
    	
    	String pizza = "";
    	
    	pizza += "PIZZA " + this.codigo + "\n" + 
    	"Tamaño -> " + this.tamaño + "\n" + 
    	"Tipo -> " + this.tipo + "\n" + 
    	"Estado -> " + this.estado;
    	
        return pizza;
    }

    
    @Override
    public boolean equals(Object obj) {
    	
    	boolean sonIguales = false;
    	
    	Pizza otraPizza = (Pizza) obj;
    	
        if (this.codigo == otraPizza.codigo) {
        	sonIguales = true;
        }
        
        return sonIguales;
    }

    /**
     * Método hashCode necesario cuando se sobrescribe equals
     * @return Código hash de la pizza basado en su código
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(this.codigo);
    }
}

	


	
	

	


