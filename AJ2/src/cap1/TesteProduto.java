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
		// aumento de 10% no pre�o do produto
		p.preco *= 1.1;
		p.descricao = " Nova descri��o";
		p.marca = "Sem-marca";
		p.imprime();
	}

}
