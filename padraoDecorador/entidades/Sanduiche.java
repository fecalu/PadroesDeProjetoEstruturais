package entidades;

import interfaces.ISanduiche;

public class Sanduiche implements ISanduiche {
	
	private String descricao;
	private int preco;

	
	public Sanduiche(String descricao, int preco) {
		this.descricao = descricao;
		this.preco = preco;
	}



	@Override
	public String getDescricao() {
		return this.descricao ;
	}

	@Override
	public int getPreco() {
		return this.preco;
	}

}