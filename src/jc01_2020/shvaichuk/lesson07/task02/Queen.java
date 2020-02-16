package jc01_2020.shvaichuk.lesson07.task02;

public class Queen extends Figure {
	
	public Queen(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		if (inputIsInvalid(toVertical, toHorizontal)) return false;
		
		if (new Bishop(getVertical(), getHorizontal()).moveTo(toVertical, toHorizontal) || new Rook(getVertical(), getHorizontal()).moveTo(toVertical, toHorizontal)) return true;
		
		return false;
	}
}
