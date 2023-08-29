package edu.aed.cap10agenda;
public class Persona {
	private String Nombre;
	private int Edad;
	private char Genero;
	
	public Persona()
	{}
	public Persona(String n,int e, char g){
		this.Nombre=n;
		this.Edad=e;
		this.Genero=g;
		}
	public Persona(String n){
		this.Nombre=n;
	}	
	public String obtenNombre()
	{
		return Nombre;
	}
	public void estableceNombre(String nombre)
	{Nombre=nombre;}
	public void estableceEdad(int edad)
	{Edad=edad;}
	public void estableceGenero(char genero)
	{Genero=genero;}
	
	public void obtenerDatos()
	{System.out.println("Nombre:"+ Nombre+"\t"+"Edad:"+Edad+"\t"+"Genero:"+Genero);
	}
	
	public String toString()
	{	return "Nombre:"+ Nombre+"\t"+"Edad:"+Edad+"\t"+"Genero:"+Genero;
	}
	public boolean equals(Object o ) {
    return ((Persona)o).Nombre.equals(Nombre) ;
  	}  	
	
}
