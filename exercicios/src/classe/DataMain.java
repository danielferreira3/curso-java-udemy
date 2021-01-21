package classe;


public class DataMain {
	public static void main(String[] args) {
		
	Data d1 = new Data(17,07,1997);
	Data d2 = new Data();
	
	
	System.out.println("Daniel nasceu em "+ d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
			
	}
	
}
