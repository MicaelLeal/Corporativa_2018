package src;

import java.util.List;

public class Venda {
	
	private Cliente cliente;
	private List<ItemVenda> itens;
	
	public Venda(Cliente cliente, List<ItemVenda> itens) {
		this.cliente = cliente;
		this.itens = itens;
	}
	
	public double valorTotal() {
		double valor = 0;
		
		for (ItemVenda item : itens) {
			valor += item.getProduto().getValor() * item.getQuantidade();
		}
		
		return valor;
	}

}
