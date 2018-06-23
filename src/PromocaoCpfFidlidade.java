package src;

public class PromocaoCpfFidlidade extends Promocao {

	@Override
	public boolean aplicavel(Venda venda) {
		return (venda.cliente.getCpf() != null) ? true : false;
	}

	@Override
	public double cacularDesconto(Venda venda) {
		double valorDesconto = 0;
		
		if (venda.valorTotal() > 99 && venda.valorTotal() < 1000) {
			valorDesconto = venda.valorTotal() * 0.05;
		}
		if (venda.valorTotal() > 999) {
			valorDesconto = venda.valorTotal() * 0.1;
		}
		return 0;
	}

}
