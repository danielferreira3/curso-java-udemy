package classe;

public class Data {

		int dia;
		int mes;
		int ano;
		
		
	public Data() {
			
		dia = 1;
		mes = 1;
		ano = 1970;
		
		}


	public Data(int diaInicial, int mesInicial, int anoInicial) {
			
			dia = diaInicial;
			mes = mesInicial;
			ano = anoInicial;
		}


	String obterDataFormatada () {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
}
