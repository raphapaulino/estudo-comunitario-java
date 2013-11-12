/**
 * 
 */
package cap7;

/**
 * @author raphael
 *
 */

// Para testar este exemplo, utilize o terminal passando como parâmetros
// os argumentos param1 param2 param3 
public class TesteParametros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < args.length; i++){
			System.out.println("args[" + i + "]=" + args[i]);			
		}
	}
	
}

