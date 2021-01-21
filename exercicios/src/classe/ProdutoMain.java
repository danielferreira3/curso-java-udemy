package classe;

public class ProdutoMain {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.99);
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.99;
		
		Produto.desconto = 0.20;
		
		System.out.println(p1.nome + " " + "Preço com desconto = " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + "Preço com desconto = " + p2.precoComDesconto());
		
	}
}
