package servicios;

import java.util.List;
import java.util.Scanner;

public interface operacionInterfaz 

{

	public void pedirNumeros(List listaNumeros, Scanner scanner, boolean cerrarBucle);
	
	public void mostrarListaForeach(List listaNumeros);
	
	public void intercambiarPosiciones(List<Integer> listaNumeros);
	
	public void mostrarListaPosicionesFor (List<Integer> listaNumeros);
}
