/**
 * 
 */
package cap6;

/**
 * @author raphael
 * 
 */
public class TesteSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaSemana = 1;
		switch (diaSemana) {
			case 1:
				System.out.println("Segunda-feira");
				break;
			case 2:
				System.out.println("Ter�a-feira");
				break;
			case 3:
				System.out.println("Quarta-feira");
				break;
			case 4:
				System.out.println("Quinta-feira");
				break;
			// neste caso as opera��es s�o executadas sequencialmente at� que seja
			// encontrado um break
			case 5:
				System.out.println("Sexta-feira");
				System.out.println("Hoje � dia de balada");
				break;
			case 6:
				System.out.println("S�bado-feira");
				System.out.println("Hoje ainda � dia de balada");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Dia inv�lido");
				break;
		}
	}

}
