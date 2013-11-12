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
		
		// estrutura if else sem a utilização de {}
		if((x > 0) && (x % 2 == 0))
			System.out.println("x é positivo e divisível por 2");
		else
			System.out.println("x é negativo ou não é divisível por 2");
		
		// estrutura de ifs aninhados utilizando {}
		if(x % 2 == 0) {
			System.out.println(x + " é divisível por 3");
			if (x % 3 == 0)
				System.out.println(x + " também é divisível por 3");
		}
		
		// Utilizando if-else
		if(x > 0) {
			System.out.println("x é POSITIVO");
		} else if(x < 0) {
			System.out.println("x é NEGATIVO");
		} else {
			System.out.println("x é igual a ZERO");
		}
	}

}
