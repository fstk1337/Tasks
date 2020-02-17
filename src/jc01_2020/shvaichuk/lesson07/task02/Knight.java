package jc01_2020.shvaichuk.lesson07.task02;

public class Knight extends Figure {
	
	public Knight(char vertical, int horizontal) {
		super(vertical, horizontal);
	}
	
	public boolean moveTo(char toVertical, int toHorizontal) {
		if (inputIsInvalid(toVertical, toHorizontal)) return false;
		
        int[][] allowedFields = {   {getIntFromVertical(getVertical()) - 2, getHorizontal() + 1},
                                    {getIntFromVertical(getVertical()) - 1, getHorizontal() + 2},
                                    {getIntFromVertical(getVertical()) + 1, getHorizontal() + 2},
                                    {getIntFromVertical(getVertical()) + 2, getHorizontal() + 1},
                                    {getIntFromVertical(getVertical()) - 2, getHorizontal() - 1},
                                    {getIntFromVertical(getVertical()) - 1, getHorizontal() - 2},
                                    {getIntFromVertical(getVertical()) + 1, getHorizontal() - 2},
                                    {getIntFromVertical(getVertical()) + 2, getHorizontal() - 1}
                                };
		for (int i = 0; i < allowedFields.length; i++) {
            if (allowedFields[i][0] == getIntFromVertical(toVertical) && allowedFields[i][1] == toHorizontal)
                return true;
        }
		return false;
	}
}
