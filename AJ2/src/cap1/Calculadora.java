/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class Calculadora {

	// a passagem de dois valores do tipo int (ou tipo compat�vel) � orbigat�ria
	int soma(int x, int y) {
		return x + y;
	}
	
	// a passagem de dois valores do tipo double (ou tipo compat�vel) � obrigat�ria
	double multiplicacao(double d1, double d2) {
		double resultado = d1 * d2;
		return resultado;
	}
	
	// a passagem de dois valores do tipo int (ou tipo compativel) � obrigat�ria
	boolean maior(int num1, int num2) {
		if(num1 > num2) 
			return true;
		else
			return false;
	}

	// a passagem de um par�metro do tipo String � obrigat�ria
	void print(String texto) {
		System.out.println("Texto: " + texto);
	}
}
