/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class TestePessoa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cria-se uma inst�ncia da classe Pessoa
		Pessoa p = new Pessoa();
		
		// Acessando os atributos da classe Pessoa para definir seus valores
		p.nome = "Rodrigo";
		p.sobrenome = "Monteiro";
		p.dataNasc = "25/12/1975";
		p.rg = 11111;
		String osTelefones[] = {"16 3636-1515", "16 99145-7891" };
		p.telefones = osTelefones;
		
		// Acessando os atributos para leitura
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data Nasc.: " + p.dataNasc);
		System.out.println("RG: " + p.rg);
		System.out.println("Telefones:");
		for (int i = 0; i < p.telefones.length; i++) {
			System.out.println(p.telefones[i]);
		}
	}

}
