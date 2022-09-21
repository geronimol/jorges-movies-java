package Jorge;

import Interfaz.PantallaInicio;

public class Jorge{
	
	public static void main(String[] args){
		
		 PantallaInicio pantalla =new PantallaInicio("Películas de Jorge");
		 pantalla.pack();
		 pantalla.setVisible(true); 
		 /*Lista listapelis=new Lista();
		 listapelis.AgregarPelis(new Pelicula("Tron"));
		 listapelis.AgregarPelis(new Pelicula("Tron 2"));
		 listapelis.EliminarPelis(new Pelicula("Tron"));
		 listapelis.Guardar();
		 listapelis.Cargar();
		 listapelis.MostrarPeliculas();*/
	}
}