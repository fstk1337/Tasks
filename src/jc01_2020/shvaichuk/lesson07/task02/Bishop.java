package jc01_2020.shvaichuk.lesson07.task02;

public class Bishop extends Figure {
	
	public Bishop(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		if (toVertical == getVertical() && toHorizontal == getHorizontal()) return false;
		if (getIntFromVertical(toVertical) < 1 || getIntFromVertical(toVertical) > 8) return false;
		if (toHorizontal < 1 || toHorizontal > 8) return false;
		int x = getIntFromVertical(getVertical());
		int y = getHorizontal();
		int b1 = y - x; //for k = 1
		int b2 = y + x; //for k = -1
		if (toHorizontal == getIntFromVertical(toVertical) + b1 || toHorizontal == -getIntFromVertical(toVertical) + b2) return true;
		return false;
	}
}
