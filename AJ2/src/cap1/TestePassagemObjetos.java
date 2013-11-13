/**
 * 
 */
package cap8;

/**
 * @author raphael
 *
 */
public class TestePassagemObjetos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data1 = new Data();
		System.out.println("Valores iniciais para data1:");
		System.out.println("Dia: " + data1.dia);
		System.out.println("Mês: " + data1.mes);
		System.out.println("Ano: " + data1.ano);
		TestePassagemObjetos testador = new TestePassagemObjetos();
		testador.alteraData(data1);
		System.out.println("Valores atuais para data1:");
		System.out.println("Dia: " + data1.dia);
		System.out.println("Mês: " + data1.mes);
		System.out.println("Ano: " + data1.ano);		
	}
	void alteraData(Data data2) {
		data2.dia = 10;
		data2.mes = 12;
		data2.ano = 2008;
	}
	

}
