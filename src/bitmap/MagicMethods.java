package bitmap;

/**
 * Esta clase contiene métodos para calcular números mágicos, además de atributos 
 * con esos números mágicos guardados.
 * 
 * @author Eileen
 */
public class MagicMethods {

	/* Atributos */
	/**
	 * Valor del número mágico aureo
	 */
	final static double AU = 1.618;
	
	/* Métodos */
	/**
	 * Este método comprueba si dos números tiene proporciones aureas
	 * 
	 * @param a Valor a comprobar A
	 * @param b Valor a comprobar B
	 * @return res Valor a devolver, true si tiene proporciones aureas o false si no
	 */
	static boolean combrobarMagia(double a, double b) {
		
		/* Declaraciones */
			/* Valor a devolver por claridad de código */
		boolean res = false;
		
		if(a/b == AU || (a+b)/a == a/b) {
			
			res = true;
			
		}//Fin IF --> Comprobador
		
		/* Return */
		return res;
		
	}//Fin comprobarMagia()
	
	/**
	 * Este método calcula que valor tiene que tener el siguiente número para tener proporciones aureas
	 * 
	 * @param a Valor a comprobar
	 * @return b Valor a devolver
	 */
	static double buscaAU(double a) {
		
		/* Declaramos un número por claridad de código*/
		double b;
		
		/* Operacion */
		b = (AU*a)-a;
		
		/* Return */
		return b;
		
	}//Fin buscaAU()
	
}
