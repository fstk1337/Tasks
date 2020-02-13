package jc01_2020.shvaichuk.lesson07.task02;

public class Knight extends Figure {
	
	public Knight(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		if (toVertical == getVertical() && toHorizontal == getHorizontal()) return false;
		if (getIntFromVertical(toVertical) < 1 || getIntFromVertical(toVertical) > 8) return false;
		if (toHorizontal < 1 || toHorizontal > 8) return false;
		

		
		return false;
	}
}
