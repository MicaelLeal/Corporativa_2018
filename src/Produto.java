package src;

public class Produto {
	
	private String nome;
	private double valor;
	private Categoria categoria;
	
	public Produto(String nome, double valor, Categoria categoria) {
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
	}
	
	public double getValor() {
		return valor;
	}
	
}
