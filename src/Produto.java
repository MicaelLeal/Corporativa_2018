package src;

public class Produto {
	
	protected String nome;
	protected double valor;
	protected Categoria categoria;
	
	public Produto(String nome, double valor, Categoria categoria) {
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
	}
	
}
