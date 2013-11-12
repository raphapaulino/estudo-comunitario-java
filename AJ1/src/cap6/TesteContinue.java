/**
 * 
 */
package cap6;

/**
 * @author raphael
 *
 */
public class TesteContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorTotal = 15000;
		System.out.println("valor total = " + valorTotal);
		for(int numeroParcelas = 10; numeroParcelas < 20; numeroParcelas++) {
			
			double parcela = valorTotal / numeroParcelas;
			
			if (parcela < 1000) {
				System.out.print("Não é possível parcelar em mais vezes, ");
				System.out.println("pois não é permitido parcelas < 1000");
				// vamos substituir o break pelo continue
				continue;
			}
			System.out.println(numeroParcelas + " parcelas de " + parcela);
		}
	}

}
