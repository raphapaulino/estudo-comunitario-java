/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class Produto {

	double preco;
	String descricao;
	String marca;
	
	void incializaValores(double umPreco, String umDescricao, String umaMarca) {
		preco = umPreco;
		descricao = umDescricao;
		marca = umaMarca;
	}
	void imprime() {
		System.out.println("--------------------------");
		System.out.println("Produto : " + descricao);
		System.out.println("Marca : " + marca);
		System.out.println("Preço : " + preco);
		System.out.println("--------------------------");
	}
}
