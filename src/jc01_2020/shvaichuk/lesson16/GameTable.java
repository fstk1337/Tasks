package jc01_2020.shvaichuk.lesson16;

public class GameTable {
	private Field[][] table = new Field[3][3];
	private FieldType nextFieldType;

	public GameTable() {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				table[i][j] = new Field(FieldType.EMPTY);
			}
		}
		nextFieldType = FieldType.CROSS;
		System.out.println("Created an empty Game Table:");
		printTable();
	}

	public void printTable() {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				System.out.print(table[i][j].getType().getCaption() + " ");
			}
			System.out.println();
		}
	}
}
