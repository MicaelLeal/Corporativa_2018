package src;

public class CalculadorDeFrete {
	
	public double calcularEnvio(Venda venda) {
		if (venda.valorTotal() > 199) {
			return 0.0;
		} else if (venda.valorTotal() > 99) {
			if (venda.frete.destino == Destino.S || venda.frete.destino == Destino.SE) {
				return 0.0;
			}
		}
		return venda.frete.valor;
	}
	
}