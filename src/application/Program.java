package application;

import java.util.Scanner;

import mesa.Partida;
import mesa.Peca;
import mesa.PecaJogo;
import mesa.Posicao;
import mesa.TabuleiroException;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Partida part = new Partida();
	    UI.PrintBoard(part);
   
	    Posicao pos;
		Peca peca;
		
		int tipo = 1;
		String forma = null;
		
	
		try {
		do {
		if (tipo == 1) {
			forma = "X";
		} else { forma = "O";}	
			
	    System.out.println();
		System.out.println("Rodada de " + forma);
		System.out.println("Escolha uma posição 1 a 3 (Horizontal, esquerda para direita)\ne 1 a 3 (Vertical, cima para baixo)");
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
		pos = new Posicao(y-1, x-1);
		peca = new PecaJogo(pos,tipo,part.getTab());
		part.getTab().porPeca(peca,pos);
		
		if (tipo == 1) { tipo = 0;} else { tipo = 1;}
		
		UI.PrintBoard(part);
	
		
		} while (part.vitoria());
		}
		catch (TabuleiroException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
		
		
		
		
		
	}

}
