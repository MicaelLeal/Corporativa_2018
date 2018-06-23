package src;

public abstract class Promocao {
	
	public abstract boolean aplicavel(Venda venda);
	
	public abstract double cacularDesconto(Venda venda);
	
	public double desconto(Venda venda) {
		return this.aplicavel(venda) ? this.cacularDesconto(venda) : 0.0;
	}
	
}
