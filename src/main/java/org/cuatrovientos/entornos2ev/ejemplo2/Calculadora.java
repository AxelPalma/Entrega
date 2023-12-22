package org.cuatrovientos.entornos2ev.ejemplo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */

public class Calculadora 
{
	private static Logger logger = LogManager.getLogger();
	
	private String operacionEnCurso;
	
	/**
	 * Metodo Main de ejecucion, escribe un log y hace una suma
	 * @param args el nombre a pintar en ek log, ojo que tiene que tener un solo valor en el array 
	 */
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        logger.error("otro hello world " + args[0]);
        
        Calculadora miCalculadora = new Calculadora();
        
        switch (args [0]) {
		case "sumar":
			int resultado = miCalculadora.sumar(args[1], args[2]);
			break;

		default:
			break;
		}
    
    }
    public int sumar(String numero1, String numero2) {
    	int numero1Int=Integer.valueOf(numero1);
    	int numero2Int=Integer.valueOf(numero2);
    	if (true) {
    		logger.error("Aqui Entra");
    	
    }else{
    		logger.error("Aqui no entra");
    	}
    	return numero1Int + numero2Int;
    }

	/**
	 * @return the operacionEnCurso
	 */
	public String getOperacionEnCurso() {
		return operacionEnCurso;
	}

	/**
	 * @param operacionEnCurso the operacionEnCurso to set
	 */
	public void setOperacionEnCurso(String operacionEnCurso) {
		this.operacionEnCurso = operacionEnCurso;
	}
}
