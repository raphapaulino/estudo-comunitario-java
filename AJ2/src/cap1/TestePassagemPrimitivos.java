/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class TestePassagemPrimitivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 4;
		int num2 = 2;
		CalculadoraMaluca calculadora = new CalculadoraMaluca();
		System.out.println("O valor do num1 antes do m�todo multiplica: " + num1);
		System.out.println("O valor do num2 antes do m�todo multiplica: " + num2);
		
		// o m�todo multiplica atribui 0 aos dois par�metros recebidos
		calculadora.mutliplicaValores(num1, num2);
		System.out.println("O valor do num1 ap�s do m�todo multiplica: " + num1);
		System.out.println("O valor do num2 ap�s do m�todo multiplica: " + num2);
	}

}
