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

		// A variável i está dentro das condições do while
		int i = 0;
		do {
			i++;
			System.out.println("i = " + i);
		} while (i < 2);
			
		// A variável j está fora das condições do while, no entanto,
		// o laço será executado ao menos uma vez
		int j = 20;
		do {
			j++;
			System.out.println("j = " + j);
		} while(j < 20);
	}

}
