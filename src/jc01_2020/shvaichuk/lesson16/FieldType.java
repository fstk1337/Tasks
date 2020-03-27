package jc01_2020.shvaichuk.lesson16;

public enum FieldType {
	EMPTY('⊡'),
	CROSS('⊠'),
	CIRCLE('⊙');

	private char caption;

	FieldType(char caption) {
		this.caption = caption;
	}

	public char getCaption() {
		return caption;
	}
}
