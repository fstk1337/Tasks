package jc01_2020.shvaichuk.lesson07.task02;

public class Pawn extends Figure {
	
	public Pawn(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		if (toVertical == getVertical() && toHorizontal == getHorizontal()) return false;
		if (getIntFromVertical(toVertical) < 1 || getIntFromVertical(toVertical) > 8) return false;
		if (toHorizontal < 1 || toHorizontal > 8) return false;
		
		if (getHorizontal() == 2) {
			if (toVertical == getVertical() && toHorizontal == getHorizontal() + 1 || toVertical == getVertical() && toHorizontal == getHorizontal() + 2) return true;
			else return false;
		} else {
			if (toVertical == getVertical() && toHorizontal == getHorizontal() + 1) return true;
			else return false;
		}
	}
}
