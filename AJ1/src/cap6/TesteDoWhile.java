/**
 * 
 */
package cap6;

/**
 * @author raphael
 *
 */
public class TesteDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A vari�vel i est� dentro das condi��es do while
		int i = 0;
		do {
			i++;
			System.out.println("i = " + i);
		} while (i < 2);
			
		// A vari�vel j est� fora das condi��es do while, no entanto,
		// o la�o ser� executado ao menos uma vez
		int j = 20;
		do {
			j++;
			System.out.println("j = " + j);
		} while(j < 20);
	}

}
