/**
 * 
 */
package cap4;

/**
 * @author raphael
 *
 */
public class TesteTiposPrimitivosPontoFlutuante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 10F;
		System.out.println(" float f = 10F => f = " + f);

		// podemos utilizar o f ou F para indicar que o número é float
		float f2 = 10.45454f;
		System.out.println(" float f2 = 10.45454f => f2 = " + f2);
		
		// por default todo número é inteiro, por isto indicamos com o d 
		double d = 12565484546d;
		System.out.println(" double d = 12565484546 => d = " + d);
		
		double d2 = 12565484546.0;
		System.out.println(" double d2 = 12565484546.0 => d2 = " + d2);
	}

}
