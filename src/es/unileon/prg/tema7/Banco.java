package es.unileon.prg.tema7;
/**
 * Clase que representa un banco
 *
 * @author PRG
 * @version 3.0
 */
public class Banco{

	/**
	 * Numero maximo de titulares de la cuenta
	 */
	private static int NUM_MAX_CUENTAS = 50;

    /**
     * Nombre del banco
     */
    private String nombre;
    /**
     * Cuentas bancaria del banco
     */
    private CuentaBancaria[] cuentas;

    /**
     * Constructor que recibe por parametro el nombre del banco
     *
     * @param nombre Nomre del banco
     */
    public Banco(String nombre){
		// Inicio modificacion
		this.nombre = nombre;
		// Fin modificacion
    }

    /**
     * Se aniade una cuenta al banco
     *
     * @param cuenta cuenta que se desea incluir en el banco
     * @return <code> true </code> Proceso correcto <code> false </code> En caso contrario
     */
    public boolean anyadir(CuentaBancaria cuenta) {
		// Inicio modificacion
		cuentas = new CuentaBancaria[this.NUM_MAX_CUENTAS];
		for(int i = 0; i<NUM_MAX_CUENTAS; i++){
			if(cuenta.obtenerSaldo() > 0){
				cuentas[i+1] = cuenta;
				return true;
			}else{
    				return false;
			}
		}
		return false;
		// Fin modificacion
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
    @Override
	public String toString(){
		// Inicio modificacion
    		StringBuffer salida = new StringBuffer();

		salida.append("\n");
		salida.append("Cuentas  : " + cuentas + "\n");

		int contador = 0;
		while ((contador < cuentas.length) && (cuentas[contador] != null)) {
			salida.append(cuentas[contador]);
			contador++;
		}

		return salida.toString();
		// Fin modificacion
    }
}