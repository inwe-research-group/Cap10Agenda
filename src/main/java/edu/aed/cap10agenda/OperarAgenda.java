package edu.aed.cap10agenda;
import java.util.*;
public class OperarAgenda {	
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);		
		scr.useDelimiter("\n");
		
		Agenda miAgenda=new Agenda();
		Persona amigo;
		
		String nombres;
		int edad=0,i=1,opcion=2,pos=-1;
		char sexo='N';
		String Rpta="S";				
		String SEPARADOR="\n";
		
		//System.out.println("Agenda Electronica");		
		
		do			
		{	
			System.out.print("AGENDA ELECTRONICA - OPERACIONES DEL SISTEMA"+SEPARADOR+"1.- Agregar "+SEPARADOR+
				"2.- Buscar "+SEPARADOR+"3.- Modificar "+SEPARADOR+"4.- Eliminar "+SEPARADOR+
					"5.- Imprimir"+SEPARADOR+"6.- Salir "+SEPARADOR+"Elija una opcion:");
					
			opcion =scr.nextInt();
			switch (opcion)
			{
				case 1: //Registro de amigos en mi Agenda
						System.out.println("Ingrese Nombres y Apellidos:");
						nombres=scr.next();
						
						System.out.print("Ingrese Edad:");		
						edad=scr.nextInt();
						
						System.out.print("Ingrese Sexo:");
						sexo=scr.next().charAt(0);
						
						amigo = new Persona(nombres,edad,sexo);
						miAgenda.Agregar(amigo);					
						break;
				case 2: //Buscar un amigo
						System.out.println("Ingrese datos de la persona a buscar:");
						System.out.println("Ingrese Nombres y Apellidos:");
						nombres=scr.next();
						
						/*System.out.print("Ingrese Edad:");		
						edad=scr.nextInt();
						
						System.out.print("Ingrese Sexo:");
						sexo=scr.next().charAt(0);*/
						
						amigo = new Persona(nombres);
						if (miAgenda.Buscar(amigo))						
							System.out.println(nombres + " Se ubico en la lista");
						else 
							System.out.println(nombres + " No se ubico en la lista");
						break;
				case 3: System.out.println("Ingrese la ubicacion en la lista del amigo a modificar:");
						pos=scr.nextInt();
						
						System.out.println("Ingrese los datos correctos:");
						System.out.println("Nombres y Apellidos:");
						nombres=scr.next();
						
						System.out.print("Ingrese Edad:");		
						edad=scr.nextInt();
						
						System.out.print("Ingrese Sexo:");
						sexo=scr.next().charAt(0);
						
						amigo = new Persona(nombres,edad,sexo);
						miAgenda.Modificar(pos,amigo);					
						
						break;
				case 4:	System.out.println("Ingrese Datos de la persona a eliminar:");
						System.out.println("Nombres y Apellidos:");
						nombres=scr.next();
						
						System.out.print("Ingrese Edad:");		
						edad=scr.nextInt();
						
						System.out.print("Ingrese Sexo:");
						sexo=scr.next().charAt(0);
						
						amigo = new Persona(nombres,edad,sexo);
						miAgenda.Eliminar(amigo);					
						break;
						
				case 5: System.out.println(miAgenda.verLista());
						break;
				case 6: break;
				default: System.out.println(miAgenda.verLista());
						 break;				
			}
			
			System.out.print("Para continuar pulsa S; Para finalizar pulse N: ");
			Rpta=scr.next().toUpperCase();			
			i+=1;
			
			
		}while(Rpta.equals("S")==true);			
		
	}	
	
}
