/**
 * 
 */
package cap6;

/**
 * @author raphael
 *
 */
public class TesteControleFluxoIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 6;
		
		// estrutura if else sem a utiliza��o de {}
		if((x > 0) && (x % 2 == 0))
			System.out.println("x � positivo e divis�vel por 2");
		else
			System.out.println("x � negativo ou n�o � divis�vel por 2");
		
		// estrutura de ifs aninhados utilizando {}
		if(x % 2 == 0) {
			System.out.println(x + " � divis�vel por 3");
			if (x % 3 == 0)
				System.out.println(x + " tamb�m � divis�vel por 3");
		}
		
		// Utilizando if-else
		if(x > 0) {
			System.out.println("x � POSITIVO");
		} else if(x < 0) {
			System.out.println("x � NEGATIVO");
		} else {
			System.out.println("x � igual a ZERO");
		}
	}

}
