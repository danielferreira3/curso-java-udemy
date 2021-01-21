package desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida ("arroz", 0.200);
		Comida c2 = new Comida ("Feijao", 0.300 );
		
		Pessoa p1 = new Pessoa("Daniel", 86.0);
		
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
	}
}
