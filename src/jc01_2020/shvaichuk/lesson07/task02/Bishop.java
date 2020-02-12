package jc01_2020.shvaichuk.lesson07.task02;

public class Bishop extends Figure {
	
	public Bishop(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		int x = getVerticalAsInt(getVertical());
		int y = getHorizontal();
		int b1 = y + x; //свободный член для отрицательного наклона
		int b2 = y - x; //свободный для положительного наклона
		if (toHorizontal == getVerticalAsInt(toVertical) + b2 && getVerticalAsInt(toVertical) > x && getVerticalAsInt(toVertical) <= 8)
			return true;
		if (toHorizontal == -getVerticalAsInt(toVertical) + b1 && getVerticalAsInt(toVertical) >= 1 && getVerticalAsInt(toVertical) < x)
			return true;
		return false;
	}
	
	
}
