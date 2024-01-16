package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicios.operacionImplementacion;
import servicios.operacionInterfaz;

public class inicio {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Objetos 
		operacionInterfaz op = new operacionImplementacion();
		
		//Variable
		boolean cerrarBucle = false;
		
		//Declaracion 
		List listaNumeros;
		
		//Creacion
		listaNumeros = new ArrayList<Integer>();
		
		op.pedirNumeros(listaNumeros, scanner, cerrarBucle);
		System.out.println(" ");
		op.mostrarListaForeach(listaNumeros);
		System.out.println(" ");
		op.intercambiarPosiciones(listaNumeros);
		System.out.println(" ");
		op.mostrarListaForeach(listaNumeros);

		
		
		
		
	}
}
