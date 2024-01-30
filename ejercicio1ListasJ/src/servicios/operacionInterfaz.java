package servicios;

import java.util.List;
import java.util.Scanner;

/**
 * Almacena la cabezera de los metodos
 * msm - 300123
 */

public interface operacionInterfaz 

{
	/**
	 * Pide numeros al usuario hasta que el usuario lo decida y los introduce en una list tipo LIST
	 * msm - 300123
	 * @param listaNumeros
	 * @param scanner
	 * @param cerrarBucle
	 */

	public void pedirNumeros(List listaNumeros, Scanner scanner, boolean cerrarBucle);
	
	/**
	 * Muestra los numeros anteriormente introducidos con un foreach
	 * msm - 300123
	 * @param listaNumeros
	 */
	
	public void mostrarListaForeach(List listaNumeros);
	/**
	 * Intercambia las posiciones 2 y 4 de la lista
	 * msm - 300123
	 * @param listaNumeros
	 */
	
	public void intercambiarPosiciones(List<Integer> listaNumeros);
	/**
	 * Muestra la lista con un for
	 * msm - 300123
	 * @param listaNumeros
	 */
	
	public void mostrarListaPosicionesFor (List<Integer> listaNumeros);
}
