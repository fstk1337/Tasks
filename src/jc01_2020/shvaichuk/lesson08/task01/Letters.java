package jc01_2020.shvaichuk.lesson08.task01;

public enum Letters {
	A,
	B,
	C,
	D,
	E,
	F,
	G,
	H,
	I,
	J,
	K,
	L,
	M,
	N,
	O,
	P,
	Q,
	R,
	S,
	T,
	U,
	V,
	W,
	X,
	Y,
	Z;

	public static int getLetterPosition(String letter) {
		return Letters.valueOf(letter).ordinal() + 1;
	}
}
