/**
 * 
 */
package cap7;

/**
 * @author raphael
 *
 */
public class TesteArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaração de um Array e inicialização
		float[] teste = {1F, 2.5F, 3F, 4.12F, 5.6F};
		
		System.out.println("--- Imprimindo os elementos do Array ---");
		for(int i=0; i < teste.length; i++) {
			// Para acessarmos as linhas da matriz, utilizamos: teste[posicao]
			System.out.println(teste[i]);
		}
		
		// número de caracteres do alfabeto
		int numeroCaracteres = 26;
		// caractere ASC da letra 'A'
		int ascCaractereA = 65;
		// criamos um array de char com 26 posições
		char[] arrayCaractere = new char[numeroCaracteres];
		// vamos inicializar o array com as letras do alfabeto
		for(int i=0; i < numeroCaracteres; i++) {
			arrayCaractere[i] = (char) (ascCaractereA + i);
		}
		System.out.println(arrayCaractere);
	}

}
