package src;

public class ItemVenda {
	
	private Produto produto;
	private int quantidade;
	
	public ItemVenda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

}
