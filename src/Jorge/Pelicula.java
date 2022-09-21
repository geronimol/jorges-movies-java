package Jorge;

import java.io.Serializable;

public class Pelicula implements Comparable<Object>,Serializable {
	private String nombre;
	private static final long serialVersionUID = 1L;
	
	public Pelicula(String nom){
		nombre=nom;
		}
	
	public String getNombre(){
		return nombre;
	}
	
	public void Mostrar(){
		System.out.println(nombre);
	}
	
	public int compareTo( Object objeto ) {

		Pelicula peli = (Pelicula)objeto;
		String nombreObjeto = peli.nombre.toLowerCase();
		String nombreThis = this.nombre.toLowerCase();

		int compNombre=nombreThis.compareTo( nombreObjeto);
		return compNombre;
		
	}
		
}