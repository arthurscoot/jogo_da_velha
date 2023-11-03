package mesa;

public class Peca {

	private Posicao pos;
	private Tabuleiro tab;
	
	public Peca(Posicao pos, Tabuleiro tab) {
		this.setPos(null);
		this.tab = tab;
	}

	public Posicao getPos() {
		return pos;
	}

	public void setPos(Posicao pos) {
		this.pos = pos;
	}

	public Tabuleiro getTab() {
		return tab;
	}

	public void setTab(Tabuleiro tab) {
		this.tab = tab;
	}

	
}
