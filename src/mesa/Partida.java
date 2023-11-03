package mesa;

public class Partida {

	protected Tabuleiro tab;

	public Partida() {
		tab = new Tabuleiro(3,3);
	}

	public Tabuleiro getTab() {
		return tab;
	}


	public boolean vitoria() {
		int x = 0;
		
		
		for (int j = 0; j < getTab().getCollumns(); j++) {
		for (int i = 0; i < getTab().getRows(); i++) {
			if (getTab().verPeca(i, j) != null && getTab().verPeca(i, j).toString() == "X") {x +=1;} 
			if (getTab().verPeca(i, j) != null && getTab().verPeca(i, j).toString() == "O") {x -=1;}
		}
		if (x == 3 || x == -3) {
		return false;
		} 
		x = 0;
		}
		
		for (int i = 0; i < getTab().getCollumns(); i++) {
			for (int j = 0; j < getTab().getRows(); j++) {
				if (getTab().verPeca(i, j) != null && getTab().verPeca(i, j).toString() == "X") {x +=1;} 
				if (getTab().verPeca(i, j) != null && getTab().verPeca(i, j).toString() == "O") {x -=1;}
		}
		if (x == 3 || x == -3) {
		return false;
		} 
		x = 0;
		}
	
		if (getTab().verPeca(0, 0) != null && getTab().verPeca(1, 1) != null && getTab().verPeca(2, 2) != null) {
		if (getTab().verPeca(0, 0).toString() == "X" && getTab().verPeca(1, 1).toString() == "X" && getTab().verPeca(2, 2).toString() == "X") {
			return false;
		}
		if (getTab().verPeca(0, 0).toString() == "O" && getTab().verPeca(1, 1).toString() == "O" && getTab().verPeca(2, 2).toString() == "O") {
			return false;
		}
		}
		
		return true; 
	}
	
	
	
	
	
}
		