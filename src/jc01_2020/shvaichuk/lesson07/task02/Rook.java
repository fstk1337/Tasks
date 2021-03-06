package jc01_2020.shvaichuk.lesson07.task02;

public class Rook extends Figure {
	
	public Rook(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		if (inputIsInvalid(toVertical, toHorizontal)) return false;
		
		if (toVertical == getVertical() || toHorizontal == getHorizontal()) return true;
		
		return false;
	}
}
