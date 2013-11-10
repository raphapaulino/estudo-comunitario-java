/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteDeslocamentoBitsImpar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("REGRA a cada deslocamento: (numero - 1)/2");
		
		int numero = 15;
		System.out.print(Integer.toBinaryString(numero));
		System.out.println(" = " + numero);
		
		int resultado = numero >> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
	}

}
