package jc01_2020.shvaichuk.lesson08.task03;

public enum DaysOfWeek {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;

	private String shortName;

	DaysOfWeek() {
		shortName = this.name().substring(0, 3);
	}

	public static DaysOfWeek getDayOfWeek(int dayNumber) {
		return DaysOfWeek.values()[dayNumber - 1];
	}

	public int getDayOfWeekNumber() {
		return this.ordinal() + 1;
	}

	public String getShortName() {
		return shortName;
	}
}