package Objetos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List listArray = new ArrayList();
		List listLink = new LinkedList();
		
		Set setHash = new HashSet(); //No almacena elementos repetidos - Es una solución para evitar elementos repetidos. 
		Set serOrdenado = new TreeSet();
		
		Map<String,Integer> mapa = new HashMap(); //Esto es un diccionario de datos ¡¡Los puedo usar para hacer que un método me retorne dos valores!!
		
		listArray.add("hola");
		listArray.add("chao");
		
		System.out.println(listArray.getClass().getSimpleName());
		for ( Object o : listArray) {
			System.out.println(o);
		}
		
		System.out.println("\n");
		
		listLink.add("hola");
		listLink.add("chao");
		
		System.out.println(listLink.getClass().getSimpleName());
		for ( Object o : listLink) {
			System.out.println(o);
		}
		
		System.out.println("\n");
		
		setHash.add("hola");
		setHash.add("hola");
		setHash.add("hola");
		setHash.add("chao");
		
		System.out.println(setHash.getClass().getSimpleName());
		for ( Object o : setHash) {
			System.out.println(o);
		}
	}

}
