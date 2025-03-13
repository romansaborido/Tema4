package boletin4.ejercicio1;

public class Hora {

	// Atributo que representa la hora 
	private int hora;
	
	// Atributo que representa los minutos
	private int minutos;
	
	// Atributo que representa los segundos
	private int segundos;
	
	
	/**
	 * Constructor clase Hora
	 * @param hora Numero entero que representa la hora
	 * @param minutos Numero entero que representa los minutos
	 * @param segundos Numero entero que representa los segundos
	 */
	public Hora(int hora, int minutos, int segundos) {
		
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
		
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}
	
	
	/**
	 * Getter hora
	 * @return Hora
	 */
	public int getHora() {
		return this.hora;
	}
	
	/**
	 * Getter minutos
	 * @return Minutos
	 */
	public int getMinutos() {
		return this.minutos;
	}
	
	/**
	 * Getter segundos
	 * @return Segundos
	 */
	public int getSegundos() {
		return this.segundos;
	}
	
	
	/**
	 * Setter hora
	 * @param minutos Tiene que estar entre 0 y 23
	 * @return True si la hora se ha modificado correctamente, false si no se ha podido modificar
	 */
	public boolean setHora(int hora) {
		
		boolean res = false;
		
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			res = true;
		}
		
		return res;
	}
	
	
	/**
	 * Setter minutos
	 * @param minutos Tiene que estar entre 0 y 59
	 * @return True si los minutos se han modificado correctamente, false si no se han podido modificar
	 */
	public boolean setMinutos(int minutos) {
		
		boolean res = false;
		
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
		
		return res;
	}
	
	
	/**
	 * Setter segundos
	 * @param segundos Tiene que estar entre 0 y 59
	 * @return True si los segundos se han modificado correctamente, false si no se han podido modificar
	 */
	public boolean setSegundos(int segundos) {
		
		boolean res = false;
		
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
		
		return res;
	}
	
	
	/**
	 * Incrementa la hora un segundo
	 */
	public void inc() {
		
		this.segundos++;
		
		if (this.segundos == 60) {
			this.segundos = 0;
			this.minutos++;
		}
			if (this.minutos == 60) {
				this.minutos = 0;
				this.segundos = 0;
				this.hora++;
				
				if (this.hora == 60) {
					this.hora = 0;
					this.minutos = 0;
					this.segundos = 0;
				}
			}
	}
	
	
	/**
	 * Imprime la hora formato 24 horas
	 */
	public String toString() {
		
		String res = "";
		
		if (this.hora / 10 < 1) {
			res += "0" + this.hora + ":";
		} else {
			res += this.hora + ":";
		}
		
		if (this.minutos / 10 < 1) {
			res += "0" + this.minutos + ":";
		} else {
			res += this.minutos + ":";
		}
		
		if (this.segundos / 10 < 1) {
			res += "0" + this.segundos;
		} else {
			res += this.segundos;
		}
		
		return res;
	}
}
