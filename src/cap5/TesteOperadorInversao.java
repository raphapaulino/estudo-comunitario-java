/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteOperadorInversao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 38;
		System.out.println("38 invertido = " + ~i);
		
		i = -40;
		System.out.println("-40 invertido = " + ~i);
		
		short s = 12;
		
		// quando aplicamos inversão de bits o resultado é promovido a int
		int shortInvertido = ~s;
		System.out.println("12 invertido = " + shortInvertido);
		
		char c = 'a';
		// quando aplicamos inversão de bits o resultado é promovido a int, e 
		// neste caso, o caractere 'a' será promovida a int (97) antes da inversão
		
		int charInvertido = ~c;
		System.out.println("'a' invertido = " + charInvertido);
	}

}
