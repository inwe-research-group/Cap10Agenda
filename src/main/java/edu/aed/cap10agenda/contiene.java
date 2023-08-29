package edu.aed.cap10agenda;
import java.util.*;

public class contiene {

    public static void main(String args[]) {
    	List<Persona> list = new LinkedList();
        Persona per1, per2,per3;
       	per1=new Persona("Katia Santiago",2,"F".charAt(0));
       	list.add(per1);
       	per2=new Persona("Thomas Wu",50,"M".charAt(0));
		list.add(per2);
		
        per3=new Persona("Katia Santiago",2,"F".charAt(0));
        //per3=per1;
        System.out.println("list = " + list);
        
        //Returns true if this list contains the specified element.
        System.out.println("LinkedList contains India "+list.contains(per3));
        
        /*List list = new LinkedList();
        int i = 0;
        String str = "Rose";

        //Add the specified element to the end of this list.
        list.add(i);
        list.add(str);
        list.add("India");
        System.out.println("list = " + list);
        
        //Returns true if this list contains the specified element.
        System.out.println("LinkedList contains India "+list.contains("India"));*/
        
    }
}