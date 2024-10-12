package app;

import entidades.Alface;
import entidades.Bacon;
import entidades.Sanduiche;
import interfaces.ISanduiche;

public class programa {

	public static void main(String[] args) {
		
		ISanduiche sanduiche = new Sanduiche("Sanduiche Do Felipe: \n", 10);  // Na MEMORIA: sanduiche tem um obj do tipo Sanduiche
		
		sanduiche = new Alface(sanduiche); // Na Memoria: sanduiche agora tem um obj Alface, porém em alface tem um ponteiro para Sanduiche
		sanduiche = new Bacon(sanduiche); // Na Memoria: sanduiche agora tem um obj Bacon, porém em alface tem um ponteiro para Alface
		
		System.out.println(sanduiche.getDescricao());
		System.out.println("Valor total:" + sanduiche.getPreco());
	}

}
