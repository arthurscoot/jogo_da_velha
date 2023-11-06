package mesa;

public class Partida {

	protected Tabuleiro tab;

	public Partida() {
		tab = new Tabuleiro(3,3);
	}

	public Tabuleiro getTab() {
		return tab;
	}


	public boolean vitoriaV() {
		int x = 0;
		for (int i = 0; i < getTab().getCollumns(); i++) {
			for (int j = 0; j < getTab().getRows(); j++) {
				if (getTab().verPeca(j, i) != null) {
				if (getTab().verPeca(j, i).toString() == "X") {x +=1;} 
				if (getTab().verPeca(j, i).toString() == "O") {x -=1;}
				}
			}
			if (x == 3 || x == -3) {
			return true;
			} 
		x = 0;
			}	
		return false;
    }
	
	public boolean vitoriaH() {
		int x = 0;
		for (int i = 0; i < getTab().getCollumns(); i++) {
			for (int j = 0; j < getTab().getRows(); j++) {
				if (getTab().verPeca(i, j) != null) {
				if (getTab().verPeca(i, j).toString() == "X") {x +=1;} 
				if (getTab().verPeca(i, j).toString() == "O") {x -=1;}
				}
			}
			if (x == 3 || x == -3) {
			return true;
			} 
		x = 0;
			}	
		return false;
    }
	
	
	
	
	
	public boolean vitoria() {
		
		
		if (vitoriaV() == true) {
			return false;
		}
		
		if (vitoriaH() == true) {
			return false;
		}
		
		
		if (getTab().verPeca(0, 0) != null && getTab().verPeca(1, 1) != null && getTab().verPeca(2, 2) != null) {
			
		if (getTab().verPeca(0, 0).toString() == "X" && getTab().verPeca(1, 1).toString() == "X" && getTab().verPeca(2, 2).toString() == "X") {
			return false;
		}
		if (getTab().verPeca(0, 0).toString() == "O" && getTab().verPeca(1, 1).toString() == "O" && getTab().verPeca(2, 2).toString() == "O") {
			return false;
			}
		
		}
		
		if (getTab().verPeca(2, 0) != null && getTab().verPeca(1, 1) != null && getTab().verPeca(0, 2) != null) {
			
			if (getTab().verPeca(2, 0).toString() == "X" && getTab().verPeca(1, 1).toString() == "X" && getTab().verPeca(0, 2).toString() == "X") {
				return false;
			}
			if (getTab().verPeca(2, 0).toString() == "O" && getTab().verPeca(1, 1).toString() == "O" && getTab().verPeca(0, 2).toString() == "O") {
				return false;
				}
			
			}
		
		
		
		return true; 
	}
	
	
	
	
	
}
		