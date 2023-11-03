package mesa;

public class PecaJogo extends Peca {

	protected int tipo;

	public PecaJogo(Posicao pos, int tipo, Tabuleiro tab) {
		super(pos,tab);
		this.tipo = tipo;
	}
	
	
	public int getTipo() {
		return tipo;
	}


	@Override
	public String toString() {
		if (tipo == 1) {
		return "X";
	} else return "O";
}
	
	
	
	
	
}







