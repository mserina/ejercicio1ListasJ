package controladores;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import servicios.operacionImplementacion;
import servicios.operacionInterfaz;

/**
 * Clase principal del programa
 * msm - 300123
 */
public class inicio {

	/** 
	 * Metodo que almacena el orden de la ejecucion
	 * msm - 300123
	 * @param args
	 */
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
		op.mostrarListaPosicionesFor(listaNumeros);
		

		
		
		
		
	}
}
