/**
 * 
 */
package cap6;

/**
 * @author raphael
 *
 */
// ATENÇÃO ao executar essa classe!!
public class ErroLoopInfinito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  
		int i = 11;
		while (i > 10) {
			System.out.println("O valor de i é: " + i++);
		}
	}

}
