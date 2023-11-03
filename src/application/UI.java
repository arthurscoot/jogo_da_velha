package application;

import mesa.Partida;
import mesa.Peca;

public class UI {

	public static void PrintBoard(Partida part ) {
		for (int i = 0; i < part.getTab().getRows(); i++) {
			for (int j = 0; j < part.getTab().getCollumns(); j++) {
				ImprimirPeca(part.getTab().verPeca(i,j));
				}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void ImprimirPeca(Peca peca) {
		if(peca == null) {
			System.out.print("_"); } else { System.out.print(peca.toString()); }
		    System.out.print(" ");
	}
	
	
	
	
	
	
	
	
	
	
}
