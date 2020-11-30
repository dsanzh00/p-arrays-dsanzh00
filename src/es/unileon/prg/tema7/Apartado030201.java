package es.unileon.prg.tema7;
/**
 * Clase con los ejercicios correspondientes a arrays: arrays de tipos no
 * basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030201 extends Apartado {

	@Override
	protected String obtenerPractica(){
		return "P-ARR";
	}

	@Override
	protected String obtenerBloque() {
		return "Arrays de tipos no basicos";
	}

    private static int NUM_PERSONAS = 10;
    private Persona[] _personas;

	/**
	 * Arrays de tipos no basicos - Ejercicio1.
	 *
	 * Tomando como referencia la clase Persona, incluida en el directorio /src,
	 * se pide programar el codigo que permite disponer un vector de 10 posiciones
	 * con  el siguiente contenido:
	 *
     *    Posicion 0 = [Pedro, 913779900]
     *    Posicion 1 = null
     *    Posicion 2 = null
     *    Posicion 3 = null
     *    Posicion 4 = [Juan, 915453322]
     *    Posicion 5 = null
     *    Posicion 6 = null
     *    Posicion 7 = [Luis, 629674532]
     *    Posicion 8 = null
     *    Posicion 9 = [Pepe, 913778800]
	 */
	public void ejercicio01() {
		cabecera("01","Crear vector de tipos no basicos");

		// Inicio modificacion
		_personas = new Persona[10];
		_personas[0] = new Persona("Pedro", "913779900");
		_personas[4] = new Persona("Juan", "915453322");
		_personas[7] = new Persona("Luis", "629674532");
		_personas[9] = new Persona("Pepe", "913778800");
        	// Fin modificacion
	}

	/**
	 * Arrays de tipos no basicos - Ejercicio2.
	 *
	 * Se pide modificar el contenido de la clase Persona y del metodo ejercicio02()
	 * de la clase Apartado030201 a fin de mostrar por pantalla los NOMBRES contenidos
	 * en el vector creado en el ejercicio anterior. La informacion se mostrara utilizando
	 * una sentencia for
	 */
	public void ejercicio02() {
		cabecera("02", "Mostrar contenido de vector de tipos no basicos");

		ejercicio01();
		// Inicio modificacion
		for(int i=0; i < _personas.length; i++){
			System.out.print("Persona "+i+": ");
			if(_personas[i] == null){
				System.out.println(_personas[i]);
			}else{
				System.out.println(_personas[i].toString());
			}
		}
        	// Fin modificacion
	}

	/**
	 * Arrays de tipos no basicos - Ejercicio3.
	 *
	 * Tomando como referencia la clase Persona, incluida en el directorio /src, se
	 * pide programar el codigo que permite disponer un matriz de 2X2 el siguiente
	 * contenido:
	 *
     *    Posicion 0,0 = [Luis, 629674532]
     *    Posicion 0,1 = null
     *    Posicion 1,0 = null
     *    Posicion 1,1 = [Pepe, 913778800]
	 *
	 * La matriz debera crearse usando inicializadores. Una vez creada, se mostraran
	 * por pantalla los NOMBRES contenido en el mismo.
	 */
	public void ejercicio03() {
		cabecera("03", "Crear y mostrar contenido de matriz de tipos no basicos");

		// Inicio modificacion
		_personas = new Persona[2];
		String[][] matriz = new String[2][2];
		_personas[0] = new Persona("Luis", "629674532");
		_personas[1] = new Persona("Pepe", "913778800");
		matriz[0][0] = _personas[0].toString();
		matriz[1][1] = _personas[1].toString();
		for(int i = 0; i<matriz.length; i++){
			for(int j = 0; j<matriz[1].length; j++){
				System.out.println("Posicion "+i+", "+j+" => "+matriz[i][j]);
			}
		}
		// Fin modificacion
	}

}