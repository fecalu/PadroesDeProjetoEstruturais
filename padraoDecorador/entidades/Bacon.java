package entidades;

import interfaces.ISanduiche;

public class Bacon extends SanduicheDecorador{

	public Bacon(ISanduiche sanduicheDecorado) {
		super(sanduicheDecorado);
		
	}

	@Override
	public String getDescricao() {
		
		return this.sanduicheDecorado.getDescricao() + "Bacon Adicionado\n";
	}

	@Override
	public int getPreco() {
		return this.sanduicheDecorado.getPreco() + 5;
	}

}
