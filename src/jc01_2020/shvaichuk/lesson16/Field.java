package jc01_2020.shvaichuk.lesson16;

public class Field {
	private FieldType type;
	private boolean isEmpty;

	public Field(FieldType type) {
		this.type = type;
		isEmpty = (type.getCaption() == '⊡');
	}

	public FieldType getType() {
		return type;
	}
}
