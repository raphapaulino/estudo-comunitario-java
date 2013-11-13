/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class ExemploMetodos {

	// void indica que o m�todo n�o retorna nada
	void imprime() {
		System.out.println("Este m�todo n�o retorna nada!");
	}
	// o m�todo deve retornar um int ou um tipo primitivo compat�vel, caso
	// contr�rio haver� um erro de compila��o
	int calculaFrete() {
		return 19;
	}
	// o m�todo deve retornar um objeto da classe String, ou seja, um tipo
	// reference
	String getNome() {
		return "Este m�todo retorna uma String!";
	}
}
