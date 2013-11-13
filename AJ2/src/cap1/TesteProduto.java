/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class TesteProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto p = new Produto();
		p.incializaValores(9.0, "Produto X", "Marca Y");
		p.imprime();
		// aumento de 10% no preço do produto
		p.preco *= 1.1;
		p.descricao = " Nova descrição";
		p.marca = "Sem-marca";
		p.imprime();
	}

}
