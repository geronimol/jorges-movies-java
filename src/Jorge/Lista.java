package Jorge;

import java.util.*;

public class Lista{
	private TreeSet<Pelicula> listapelis;
	
	public Lista(){
		listapelis=new TreeSet<Pelicula>();
	}
	
	
	public void AgregarPelis(Pelicula peli){
		
		listapelis.add(peli);
	}
	
	public void EliminarPelis(Pelicula peli){
		if (listapelis.contains(peli))
			listapelis.remove(peli);
	}
	
	public void MostrarPeliculas(){
		for (Iterator<Pelicula> it= listapelis.iterator(); it.hasNext();){
			Pelicula peli = (Pelicula)it.next();
			System.out.println(peli.getNombre());
		}
	}

	public void Guardar(){
		Serializa.GuardaPelis(listapelis);
		
	}
	public void Cargar(){
		listapelis=Serializa.CargaPelis();
	}


	public Iterator<Pelicula> listiterator() {
		// TODO Auto-generated method stub
		return listapelis.iterator();
	}
}