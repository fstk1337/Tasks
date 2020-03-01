package jc01_2020.shvaichuk.lesson08.task03;

public enum Months {
	JANUARY(31),
	FEBRUARY(28),
	MARCH(31),
	APRIL(30),
	MAY(31),
	JUNE(30),
	JULY(31),
	AUGUST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVEMBER(30),
	DECEMBER(31);

	private int daysQuantity;
	private String shortName;

	Months(int daysQuantity) {
		this.daysQuantity = daysQuantity;
		shortName = this.name().substring(0, 3);
	}

	public int getDaysQuantity() {
		return daysQuantity;
	}

	public String getShortName() {
		return shortName;
	}

	public int getMonthNumber() {
		return this.ordinal() + 1;
	}

	public static Months getMonths(int month) {
		return Months.values()[month - 1];
	}
}
