package src;

import java.util.ArrayList;
import java.util.List;

public class PromocaoLeve3Pague2 extends Promocao {

	@Override
	public boolean aplicavel(Venda venda) {
		for (ItemVenda i : venda.itens) {
			if (i.quantidade > 3 && i.produto.categoria.equals(Categoria.LIMPEZA)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double cacularDesconto(Venda venda) {
		List<ItemVenda> itensAplicaveis = pegarItens(venda);
		double valorDesconto = 0.0;
		for (ItemVenda i : itensAplicaveis) {
			valorDesconto += i.quantidade /3 * i.produto.valor;
		}
		return valorDesconto;
	}
	
	private List<ItemVenda> pegarItens(Venda venda) {
		List<ItemVenda> itensAplicaveis = new ArrayList<>();
		for (ItemVenda i : venda.itens) {
			if (i.quantidade > 3 && i.produto.categoria.equals(Categoria.LIMPEZA)) {
				itensAplicaveis.add(i);
			}
		}
		return itensAplicaveis;
	}
	
}
