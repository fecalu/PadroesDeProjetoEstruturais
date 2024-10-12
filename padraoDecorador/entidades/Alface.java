package entidades;

import interfaces.ISanduiche;

public class Alface extends SanduicheDecorador{

	public Alface(ISanduiche sanduicheDecorado) {
		super(sanduicheDecorado);
	}

	@Override
	public String getDescricao() {
		
		return this.sanduicheDecorado.getDescricao() + "Alface Adicionado\n" ;
	}

	@Override
	public int getPreco() {
		
		return this.sanduicheDecorado.getPreco() + 1;
	}
	
}
