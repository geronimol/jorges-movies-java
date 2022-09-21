package Interfaz;

import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import Jorge.Pelicula;
import Jorge.Lista;

public class PantallaInicio extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Label mensajeAgrega;
	private Label mensajeAreaPelis;
	private TextField cajaAgrega;
	private Button botonGuardar;
	private Button botonEliminar;
	private Button botonCancelar; 
	private Panel panelBotones;
	private Panel panelDatos;
	private TextArea AreaTexto;
	private Lista listapelis=new Lista();
	
	public PantallaInicio(String titulo){
		super(titulo);
		this.setLayout(new BorderLayout());
		cargarPanelBotones();
		cargarPanelDatos();
		cargarOyentesBotones();
		this.add(panelDatos,BorderLayout.CENTER);
		this.add(panelBotones,BorderLayout.SOUTH); 
		cargarAreaPeliculas();
		
	}
	
	public void cargarAreaPeliculas(){
		listapelis.Cargar();
		for(Iterator<Pelicula> it=listapelis.listiterator() ; it.hasNext();) {
			Pelicula peli = (Pelicula)it.next();
			AreaTexto.append(peli.getNombre()+ "\n");}
	}
	
	private void cargarPanelDatos()
	{
	panelDatos =new Panel();
	panelDatos.setLayout(new GridLayout(3,2));
	this.mensajeAgrega =new Label("Ingresa nombre de la película");
	this.mensajeAreaPelis=new Label("Listado de películas vistas por Jorge!");
	this.cajaAgrega =new TextField();
	this.AreaTexto=new TextArea();
	panelDatos.add(mensajeAreaPelis);
	panelDatos.add(AreaTexto);
	panelDatos.add(mensajeAgrega);
	panelDatos.add(cajaAgrega);
	}
	private void cargarPanelBotones()
	{
	botonGuardar =new Button("Guardar");
	botonEliminar=new Button("Eliminar");
	botonCancelar =new Button("Salir");
	panelBotones =new Panel();
	panelBotones.add(botonGuardar);
	panelBotones.add(botonEliminar);
	panelBotones.add(botonCancelar);
	}
	
	private void cargarOyentesBotones()
	{
	botonGuardar.addMouseListener(new MouseAdapter()
	{
		public void mouseClicked(MouseEvent e)
	
	{
		botonGuardarClick();
	}
	});
	
	botonEliminar.addMouseListener(new MouseAdapter()
	{
		public void mouseClicked(MouseEvent e)
	
	{
		botonEliminarClick();
	}
	});
	
	botonCancelar.addMouseListener(new MouseAdapter()
	{
		public void mouseClicked(MouseEvent e)
	{
	botonCancelarClick();
	}
	}); 
} 

private void botonGuardarClick()
{
	AreaTexto.setText("");
	listapelis.AgregarPelis(new Pelicula(this.cajaAgrega.getText()));
	listapelis.Guardar();
	cargarAreaPeliculas();
}
private void botonEliminarClick()
{
	AreaTexto.setText("");
	listapelis.EliminarPelis(new Pelicula(this.cajaAgrega.getText()));
	listapelis.Guardar();
	cargarAreaPeliculas();
}
private void botonCancelarClick()
{
	System.exit(0);
}
} 