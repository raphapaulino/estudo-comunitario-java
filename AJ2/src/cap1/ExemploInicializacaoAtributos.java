/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class ExemploInicializacaoAtributos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cria-se uma inst�ncia da classe Pessoa
		Pessoa p = new Pessoa();
		
		// Acessando os atributos para leitura
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data Nasc.: " + p.dataNasc);
		System.out.println("RG: " + p.rg);
		System.out.println("Telefones:" + p.telefones);
	}

}
