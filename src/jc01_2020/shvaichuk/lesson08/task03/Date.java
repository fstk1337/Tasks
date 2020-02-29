package jc01_2020.shvaichuk.lesson08.task03;

public class Date {
	private int day;
	private int month;
	private int year;
	private int daysFromStartDate;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		daysFromStartDate = 1;
	}

	public DayOfWeek getDayOfWeek() {

		return null;
	}

	public int getDayOfYear() {
		return 0;
	}

	public int daysBetween(Date startDate,  Date endDate) {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("%02d.%02d.%04d", day, month, year);
	}

	class Year {

	}

	class Month{

	}

	class Day{

	}

}
