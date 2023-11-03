package mesa;

public class Tabuleiro {

	private int rows;
	private int collumns;
	private Peca[][] pecas;
	
	public Tabuleiro(int rows, int collumns) {
		this.rows = rows;
		this.collumns = collumns;
		pecas = new Peca[rows][collumns];
	}


	public int getRows() {
		return rows;
	}


	public int getCollumns() {
		return collumns;
	}


	public Peca verPeca(int row, int collumn) {
		return pecas[row][collumn];
	}
    
	public Peca verPeca(Posicao pos) {
		return pecas[pos.getRow()][pos.getCollumn()];
	}

	
	public void porPeca(Peca pecajogo, Posicao pos) {
		if (!existePosicao(pos)) {
			throw new TabuleiroException("Posição inexistente");
		}
		if (existePeca(pos)) {
			throw new TabuleiroException("Já há uma peça nessa posição");
		}
		pecas[pos.getRow()][pos.getCollumn()] = pecajogo;
	}
	
	
	public boolean existePosicao(int row, int collumn) {
		return row >= 0 && row < rows && collumn >= 0 && collumn < collumns;
	}

	public boolean existePosicao(Posicao pos) {
		return existePosicao(pos.getRow(), pos.getCollumn());
	}
	
	public boolean existePeca(Posicao pos) {
		return pecas[pos.getRow()][pos.getCollumn()] != null;
	}
	
	
	
	
	
	
			
}
