/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class ExemploMetodos {

	// void indica que o método não retorna nada
	void imprime() {
		System.out.println("Este método não retorna nada!");
	}
	// o método deve retornar um int ou um tipo primitivo compatível, caso
	// contrário haverá um erro de compilação
	int calculaFrete() {
		return 19;
	}
	// o método deve retornar um objeto da classe String, ou seja, um tipo
	// reference
	String getNome() {
		return "Este método retorna uma String!";
	}
}
