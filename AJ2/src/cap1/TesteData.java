/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class TesteData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d = new Data();
		d.dia = 12;
		d.mes = 1;
		d.ano = 2004;
		d.imprime();
		
		String bi = d.isAnoBissexto() ? " " : " n�o ";
		System.out.println("O ano " + d.ano + " " + bi + "� bissexto ");
		
		Data d2 = new Data();
		d.imprime();
		
		d2.dia = -20;
		d2.mes = 23;
		d2.ano = 9;
		d2.imprime();
		
		String bi2 = d2.isAnoBissexto() ? " " : " n�o ";
		System.out.println("O ano " + d2.ano + " " + bi2 + "� bissexto ");
		
		
	}

}
