package entidades;

import interfaces.ISanduiche;

public abstract class SanduicheDecorador implements ISanduiche {
	
	protected ISanduiche sanduicheDecorado;   //Deixar protected aumenta a flexibilidade do código, private não deixaria flexivel 
	
	

	public SanduicheDecorador(ISanduiche sanduicheDecorado) {
		this.sanduicheDecorado = sanduicheDecorado;
	}


	
	
}
