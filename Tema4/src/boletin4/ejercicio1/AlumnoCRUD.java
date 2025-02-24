package boletin4.ejercicio1;

import java.util.ArrayList;

public class AlumnoCRUD {

	// Creamos la lista alumnos para almacenar todos los alumnos del centro
	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	
	/**
	 * Imprime todos los alumnos que se encuentran almacenados en la lista
	 */
	public static void listarAlumnos() {

		for (Alumno a : alumnos) {
			System.out.println(a);
			System.out.println("----------");
		}
	}
	
	
	/**
	 * Busca el alumno a partir del nombre indicado por el usuario
	 * @param nombreAlumno Nombre del alumno a buscar
	 * @return Objeto buscado
	 */
	public static Alumno buscarAlumno(String nombreAlumno) {
		
		// Creamos el objeto para almacenar el resultado de la busqueda
		Alumno a = null;
		
		// Buscamos en alumnos el alumno que tiene el nombre que el usuario ha indicado
		for (Alumno aBusqueda : alumnos) {
			
			// Si coincide el nombre
			if (aBusqueda.getNombre().equalsIgnoreCase(nombreAlumno)) {
				
				// Almacenamos el objeto
				a = aBusqueda;
			}
		}
		
		// Devolvemos el objeto
		return a;
	}
	
	
	/**
	 * Si el alumno no existe lo añade a la lista
	 * @param nombreAlumno Nombre del alumno introducido por el usuario
	 * @param nota Nota del alumno introducida por el usuario
	 * @return True si se ha añadido el alumno, false si no se ha añadido
	 */
	public static boolean añadirAlumno(String nombreAlumno, double nota) {
		
		// Creamos el booleano res para indicar el resultado de la operacion
		boolean res = false;
		
		// Buscamos el alumno que el usuario quiere añadir
		Alumno a = null;
		a = buscarAlumno(nombreAlumno);
	
		// Si el alumno no existe
		if(a == null) {
			
			// Creamos el objeto con los parametros recibidos
			Alumno alumno = new Alumno(nombreAlumno, nota);
			
			// Añadimos el alumno a la lista
			alumnos.add(alumno);
			
			// Cambios el resultado a true porque el alumno se ha añadido correctamente
			res = true;
		}
		
		// Devolvemos el resultado
		return res;
	}

	
	/**
	 * Si el alumno existe en la lista modifica la nota introducida por el usuario
	 * @param nombreAlumno Nombre del alumno indicado por el usuario
	 * @param nota Nota media nueva del alumno indicada por el usuario
	 * @return True si se ha modificado el alumno, false si no se ha modificado
 	 */
	public static boolean modificarAlumno(String nombreAlumno, double nota) {

		// Creamos el booleano res para indicar el resultado de la operacion
		boolean res = false;

		// Buscamos el usuario que el alumno quiere modificar
		Alumno a = null;
		a = buscarAlumno(nombreAlumno);

		// Si hemos encontrado el alumno
		if (a != null) {

			// Modificamos su nota
			a.setNotaMedia(nota);

			// Cambios el resultado a true porque el alumno se ha modificado correctamente
			res = true;
		}

		// Devolvemos el resultado
		return res;
	}
	
	
	/**
	 * Si el alumno existe en la lista lo borra
	 * @param nombreAlumno Nombre del alumno indicado por el usuario
	 * @return True si se ha borrado, false si no se ha borrado
	 */
	public static boolean borrarAlumno(String nombreAlumno) {
		
		// Creamos el booleano resultado para almacenar el resultado de la operacion
		boolean res = false;
		
		// Buscamos si existe el alumno que el usuario quiere borrar
		Alumno a = null; 
		a = buscarAlumno(nombreAlumno);
		
		// Si hemos encontrado el alumno
		if (a != null) {
			
			// Eliminamos el alumno de la lista
			alumnos.remove(a);
			
			// Cambiamos el resultado
			res = true;
		}
		
		// Devolvemos el resultado
		return res;
	}
}
