/**
 * 
 */
package cap5;

/**
 * @author raphael
 *
 */
public class TesteOperadoresAritmeticos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =  12345, b = 222222;
		int meuInt;
		long meuLong;
		long meuLongComCast;
		int mod;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		meuInt = a + b;
		System.out.println(" a+b (como inteiro) = " + meuInt);
		
		meuInt = b - a;
		System.out.println(" b-a (como inteiro) = " + meuInt);
		
		meuInt = a * b;
		System.out.println(" b*a (como inteiro) = " + meuInt);
		
		//a*b é promovido a int antes de ser atribuido a meuLong
		meuLong = a * b;
		System.out.println(" a*b (armazenados em um long) = " + meuLong);
		
		// como a variável a é explicitamente convertida para um long,
		// o resultado do produto torna-se um long
		meuLongComCast = (long) a * b;
		System.out.println(" a*b (como long) = " + meuLongComCast);
		
		// o resultado da operação a*b é feita como um long
		meuLongComCast = (long) a / b;
		System.out.println(" a/b (como long) = " + meuLongComCast);

		// operador mod => resto da divisão de a por b
		mod = 12 % 4;
		System.out.println(" 12%4 = " + mod);
		
		// operador mod => resto da divisão de b por a
		mod = 15 % 2;
		System.out.println(" 15%2 = " + mod);
	}

}
