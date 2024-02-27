package model;

public class Produto {

	public String nome;
	public String descricao;
	public double preco;
	public int quantidade;

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nDescrição: " + descricao + "\nValor initário: R$ " + preco
				+ "\nQuantidade em estoque: " + quantidade + "\nValor total em estoque: R$ " + valorTotalEmEstoque();
	}

}
