package boletin1.ejercicio4;

public class PrincipalArtículo {

	public static void main(String[] args) {
		
		// Instanciamos un objeto de la clase articulo
		Artículo art1 = new Artículo();
		
		// Creamos la variable PVP para almacenar el precio con IVA
		double pvp;
		
		// Asignamos valores al articulo
		art1.nombre = "Cepillo de dientes";
		art1.precio = 3.99;
		
		// Calculamos el precio con iva
		pvp = Math.round(((art1.precio + (art1.precio * art1.IVA / 100)) * 10.0) / 10.0);
		
		// Mostramos los datos del articulo
		System.out.println(art1.nombre + " - " + "Precio: " + art1.precio  + "€ " + " - " + "IVA: " + art1.IVA + "% - " + "PVP: " + pvp + "€");
		
		// Cambiamos el precio
		art1.precio = 5.99;
		
		// Calculamos de nuevo el precio con iva
		pvp = Math.round(((art1.precio + (art1.precio * art1.IVA / 100)) * 10.0) / 10.0);
		
		// Mostramos de nuevo los datos del articulo
		System.out.println(art1.nombre + " - " + "Precio: " + art1.precio  + "€ " + " - " + "IVA: " + art1.IVA + "% - " + "PVP: " + pvp + "€");
	}

}
