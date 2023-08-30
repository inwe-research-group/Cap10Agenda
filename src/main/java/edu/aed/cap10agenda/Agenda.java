package edu.aed.cap10agenda;
/*Esta es una prueba chuwi*/
import java.util.*;
public class Agenda {
    /*hp*/
	public static final boolean ERROR= false;
	public static final boolean CORRECTO= true;
	public static final String SEPARADOR= "\n";
	LinkedList<Persona> personas;
	
	public Agenda() {
		personas=new LinkedList<>();
		
	}	
	public boolean  Agregar(LinkedList<Persona> per){
		return personas.addAll(per);
	}
	
	public Boolean Agregar(Persona per){
		return personas.add(per);
	}
	
	public boolean Buscar(Persona per){	
		boolean r;	
		if (personas.isEmpty())
			return ERROR;
		else 
		{	//r=personas.contains(per.obtenNombre());			
			r=personas.contains(per);
			return r;
		}
			
	}
	public void Eliminar(LinkedList<Persona> ListaPer)
	{
		//los elementos a eliminar son ubicados en la lista principal
		for(Persona per: ListaPer )
		{
			personas.remove(per);
			
		}
	}
	
	public Boolean Eliminar(Persona per)
	{		if (personas.isEmpty())
				return ERROR;
			return personas.remove(per);
	}
	
	public Boolean Modificar(Persona perOrigen,Persona perDestino)
	{	//1.-ubicar la persona en la lista
		//2.- si existe entonces modificar sus datos o reemplazar?
		if (Buscar(perOrigen))
		{	if (Eliminar(perOrigen))
			{	return Agregar(perDestino);}
			else{return ERROR;}
		}
		else{return ERROR;}
	}
	public Boolean  Modificar(int pos,Persona per)
	{	//1.-ubicar la persona en la lista
		//2.- si existe entonces modificar sus datos o reemplazar?
		if (pos>=0 && pos<=personas.size())
		{	personas.set(pos,per);
			return CORRECTO;		
		}
		else 
			return ERROR;
	}
	
	public String verLista()
	{
		StringBuilder result=new StringBuilder("");
		for(Persona per : personas)
		{
			result.append(per.toString()).append(SEPARADOR);
		}
		return result.toString();
	}
}
