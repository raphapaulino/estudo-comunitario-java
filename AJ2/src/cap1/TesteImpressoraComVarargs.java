/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class TesteImpressoraComVarargs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImpressoraComVarargs imp = new ImpressoraComVarargs();
		imp.listaNomes("Marcos da Silva", "Roberto da Costa", "Ana Maria Soares");
		// método que recebe uma String e varargs do tipo double
		imp.listaNotas("Lista de notas recebidas:", 7.5, 8.75, 5.5);
	}

}
