package src;

import java.util.List;

public class Venda {
	
	protected Cliente cliente;
	protected List<ItemVenda> itens;
	protected Frete frete;
	
	public Venda(Cliente cliente, List<ItemVenda> itens) {
		this.cliente = cliente;
		this.itens = itens;
	}
	
	public double valorTotal() {
		double valor = 0;
		
		for (ItemVenda item : itens) {
			valor += item.produto.valor* item.quantidade;
		}
		
		return valor;
	}

}
