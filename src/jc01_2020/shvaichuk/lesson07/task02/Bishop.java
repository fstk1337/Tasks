package jc01_2020.shvaichuk.lesson07.task02;

public class Bishop extends Figure {
	
	public Bishop(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		int x = getVerticalAsInt(getVertical());
		int y = getHorizontal();
		int b1 = x + y; //свободный член для отрицательного наклона
		int b2 = x - y; //свободный для положительного наклона
		if (getVerticalAsInt(toVertical) == toHorizontal + b2 && toHorizontal > x && toHorizontal <= 8)
			return true;
		if (getVerticalAsInt(toVertical) == -toHorizontal + b1 && toHorizontal >= 1 && toHorizontal < x)
			return true;
		return false;
	}
	
	
}
