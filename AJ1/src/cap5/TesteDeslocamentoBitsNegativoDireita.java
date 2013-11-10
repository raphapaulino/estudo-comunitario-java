/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteDeslocamentoBitsNegativoDireita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sem regras de deslocamneto!");
		
		int numero = -17;
		System.out.print(Integer.toBinaryString(numero));
		System.out.println(" = " + numero);
		
		int resultado = numero >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
		
		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);
	}

}
