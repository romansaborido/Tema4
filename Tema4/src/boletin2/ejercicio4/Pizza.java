package boletin2.ejercicio4;

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
	
	// Creamos el atributo codigo para almacenar el codigo de la pizza
	private int codigo;
	
	// Creamos el atributo tamaño para almacenar el tamaño de la pizza
	private Tamaño tamaño = Tamaño.MEDIANA;
		
	// Creamos el atributo tipo para almacenar el tipo de la pizza
	private Tipo tipo = Tipo.MARGARITA;
	
	// Creamos el atributo estado para almacenar el estado de la pizza
	private Estado estado = Estado.PEDIDA;
	
	
	
	/**
	 * Constructor a partir del codigo de la pizza, del tamaño y del tipo de la pizza
	 * @param codigo Tiene que ser mayor que 0
	 * @param tamaño Tiene que ser mediana o familiar
	 * @param tipo Tiene que ser margarita, cuatroquesos o funghi
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		
		if (codigo > 0) {
			this.codigo = codigo;
		}
		
		switch (tamaño) {
			case "MEDIANA", "FAMILIAR" -> this.tamaño = Tamaño.valueOf(tamaño); 
		}
		
		switch (tipo) {
			case "MARGARITA", "CUATROQUESOS", "FUNGHI" -> this.tipo = Tipo.valueOf(tipo); 
		}
	}
	
	
	
	public int getCodigo() {
		return this.codigo;
	}
	
	
	
	
}
	


	
	

	


