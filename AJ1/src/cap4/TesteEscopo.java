/**
 * 
 */
package cap4;

/**
 * @author raphael
 *
 */
public class TesteEscopo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			// as variáveis que forem declaradas dentro deste bloco
			// não serão acessíveis fora
			int quantidade = 23;
		}
		System.out.println("quantidade: " + quantidade);

	}

}
