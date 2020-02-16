package jc01_2020.shvaichuk.lesson07.task02;

public class King extends Figure {
	
	public King(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		if (inputIsInvalid(toVertical, toHorizontal)) return false;
		
		if (getIntFromVertical(toVertical) <= getIntFromVertical(getVertical()) + 1 && getIntFromVertical(toVertical) >= getIntFromVertical(getVertical()) - 1 && toHorizontal <= getHorizontal() + 1 && toHorizontal >= getHorizontal() - 1) return true;		
		
		return false;
	}
}
