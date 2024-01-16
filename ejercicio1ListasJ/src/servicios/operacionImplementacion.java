package servicios;

import java.util.List;
import java.util.Scanner;

public class operacionImplementacion implements operacionInterfaz
{

	public void pedirNumeros(List listaNumeros, Scanner scanner, boolean cerrarBucle) {
		
		while(!cerrarBucle) {
			String respuesta;
			System.out.println("Inserte un numero");
			listaNumeros.add(scanner.nextInt());
			
			
			System.out.println("Quieres seguir metiendo cosas s/n");
			respuesta = scanner.next();
			if(respuesta.equals("n")) {
				
				cerrarBucle = true;
				break;
			}
			
		}
	}
	
	public void mostrarListaForeach(List listaNumeros) {
		
		for(Object numeros : listaNumeros){
			System.out.println(numeros);
		}
	}
	
	
	public void intercambiarPosiciones(List<Integer> listaNumeros) {
		
		int auxiliar = listaNumeros.get(4);
		listaNumeros.set(4, listaNumeros.get(2));
		listaNumeros.set(2, auxiliar);
		
	}
	
	
	public void mostrarListaPosicionesFor (List<Integer> listaNumeros) {
		for (int i=0;i<listaNumeros.size();i++) {
			
			System.out.println(listaNumeros[i]);
		}
	}
}
