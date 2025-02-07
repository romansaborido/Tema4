package boletin1.ejercicio4;

public class PrincipalArtículo {

	public static void main(String[] args) {
		
		// Declaramos un objeto de la clase articulo
		Artículo art1;
		
		// Creamos la variable PVP para almacenar el precio con IVA
		double pvp;
		
		// Asignamos el nombre y el precio al articulo
		String nombre = "Cepillo de dientes";
		double precio = 3.99;
		int cuantosQuedan = 0;
		
		// Creamos el articulo
		art1 = new Artículo(nombre, precio, cuantosQuedan);
		
		// Calculamos el precio con iva
		pvp = Math.round(((art1.getPrecio() + (art1.getPrecio() * Artículo.IVA / 100)) * 10.0) / 10.0);
		
		// Mostramos los datos del articulo
		System.out.println(art1.getNombre() + " - " + "Precio: " + art1.getPrecio()  + "€ " + " - " + "IVA: " + Artículo.IVA + "% - " + "PVP: " + pvp + "€");
		
		// Cambiamos el precio
		art1.setPrecio(5.99);
		
		// Calculamos de nuevo el precio con iva
		pvp = Math.round(((art1.getPrecio() + (art1.getPrecio() * Artículo.IVA / 100)) * 10.0) / 10.0);
		
		// Mostramos de nuevo los datos del articulo
		System.out.println(art1.getNombre() + " - " + "Precio: " + art1.getPrecio()  + "€ " + " - " + "IVA: " + Artículo.IVA + "% - " + "PVP: " + pvp + "€");
	}

}
