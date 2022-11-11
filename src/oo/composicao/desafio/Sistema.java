package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem2("Caneta", 9.90, 100);
		compra1.adicionarItem(new Produto("Notebook", 1899.00), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem2("Caderno", 10.00, 10);
		compra2.adicionarItem(new Produto("Impressora", 949.90), 1);
		
		Cliente cliente = new Cliente("César Sampaio Lima");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		// cliente.compras.add(compra1); não é interessante utilizar essa relação com a lista e objeto.
		
		System.out.println(cliente.obterValorTotal());
	}
}