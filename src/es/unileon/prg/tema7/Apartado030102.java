package es.unileon.prg.tema7;
import java.util.ArrayList;
/**
 * Clase con los ejercicios correspondientes a arrays de tipos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Arrays de tipos basicos";
	}

	/**
	 * Arrays de tipos basicos - Ejercicio1.
	 *
	 * Completar el metodo para crear y rellenar un vector de cien posiciones
	 * que contenga los primeros cien numeros pares. Una vez creada, se debera
	 * mostrar el contenido del vector por pantalla.
	 */
	public void ejercicio01() {
		cabecera("01", "Generar vector con los 100 primeros numeros pares");

		// Inicio modificacion
		ArrayList<Integer> listaNumPares = new ArrayList<Integer>(100);
		int busqueda = 200;
		for(int i = 1; i<=busqueda; i++){
			if(i%2 == 0){
				listaNumPares.add(i);
			}
		}
		for(int numero: listaNumPares){
			System.out.println(numero);
		}
        	// Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio2.
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.TXT el porque de los resultados
	 * <li> Modificar el codigo a fin de evitar la excepcion producida
	 * </ul>
	 */
	public void ejercicio02() {
		cabecera("02","Mostrar vector por pantalla");

		// Inicio modificacion
		int[] arrayEnteros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(" { ");
		for(int i=1 ; i <= 9; i++) {
			System.out.print(" "+arrayEnteros[i]+",");
		}
		System.out.println("\n } ");
        	// Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio3.
	 *
	 * Completar el metodo para crear una matriz que contenga la tabla de
	 * multiplicar del numero 8. Una vez creada, se debera mostrar el
	 * contenido del vector por pantalla.
	 */
	public void ejercicio03() {
		cabecera("03", "Tabla de multiplicar del ocho");

		// Inicio modificacion
		int[] diezNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] ochos = { 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
		int[] soluc = new int[10];
		for(int i = 0; i <10; i++){
			soluc[i] = diezNum[i]*ochos[i];
			System.out.println("[ "+ochos[i]+" ]");
			System.out.println("[ "+diezNum[i]+" ]");
			System.out.println("[ "+soluc[i]+" ]");
		}
        	// Fin modificacion
	}

	/**
	 * Arrays de tipos basicos - Ejercicio4.
	 *
	 * Se pide completar el metodo para mostrar por pantalla el tablero
	 * indicado en el enunciado de la practica.
	 */
	public void ejercicio04() {
		cabecera("04", "BonoLotoADA");

		// Inicio modificacion
		int numApuestas = 3;
		int contador = 0;
		int[][] tabla = new int[5][10];
		System.out.println("Loterías y Apuestas del Estado –BonoLoto");
		for(int i = 0; i<numApuestas; i++){
			System.out.println("Apuesta: "+(i+1));
			for(int j=0; j<5; j++){
				for(int k = 0; k<10; k++){
					tabla[i][j] = contador;
					System.out.print("["+tabla[i][j]+"]");
					contador++;
				}
				System.out.println("");
			}
			contador = 0;
		}
		// Fin modificacion

	}
}