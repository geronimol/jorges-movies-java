package Jorge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Serializa{
	public static void GuardaPelis(TreeSet<Pelicula> args){
		try{
			FileOutputStream fout = new FileOutputStream("Peliculas.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fout);
			outStream.writeObject(args);
			outStream.flush();
			outStream.close();
		}
		catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static TreeSet<Pelicula> CargaPelis() {
		try {
			FileInputStream fin = new FileInputStream("Peliculas.ser");
			ObjectInputStream inStream = new ObjectInputStream(fin);
			@SuppressWarnings("unchecked")
			TreeSet<Pelicula> Obj = (TreeSet<Pelicula>) inStream.readObject();
			inStream.close();
			return Obj;
		}
		catch (Exception e) {			
			System.out.println("Error: " + e.getMessage());
			return null;
		}

	}
	
	
}