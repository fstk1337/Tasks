package jc01_2020.shvaichuk.lesson08.task03;

import static jc01_2020.shvaichuk.lesson08.task03.Months.getMonths;

public class Date {
	private Day day;
	private Month month;
	private Year year;
	private int daysFromStartDate;
	private static final Date START_DATE = new Date(1, 1, 1970);

	public Date(int day, int month, int year) {
		this.year = new Year(year);
		this.month = new Month(month);
		int leapFebCorrector = (this.year.isLeap() && this.month.getMonthNumber() == 2) ? 1 : 0;
		if (day <= getMonths(month).getDaysQuantity() + leapFebCorrector) {
			this.day = new Day(day);
		} else {
			throw new Error();
		}
		daysFromStartDate = getDaysFromStartDate();
	}

	private int getDaysFromStartDate() {
		int count = 0;



		return count;
	}

	public Date getStartDate() {
		return START_DATE;
	}

	public Year getYear() {
		return year;
	}

	public Month getMonth() {
		return month;
	}

	public Day getDay() {
		return day;
	}

	@Override
	public String toString() {
		return String.format("%02d.%02d.%04d", getDay().getDayNumber(), getMonth().getMonthNumber(), getYear().getYearNumber());
	}

	private int countLeapYears(Date startDate) {
		if (startDate.getYear().getYearNumber() > getYear().getYearNumber()) return 0;
		int count = 0;
		for (int i = startDate.getYear().getYearNumber(); i <= getYear().getYearNumber(); i++) {
			if (new Year(i).isLeap()) {
				System.out.println(new Year(i));
				count++;
			}
		}
		return count;
	}

	//inner classes

	class Year {
		private int yearNumber;
		private int daysQuantity;

		public Year(int year) {
			if (year >= 1970) {
				yearNumber = year;
			} else {
				throw new Error();
			}
			daysQuantity = isLeap() ? 366 : 365;
	}

		@Override
		public String toString() {
			return Integer.toString(yearNumber);
		}

		public int getYearNumber() {
			return yearNumber;
		}

		public int getDaysQuantity() {
			return daysQuantity;
		}

		public boolean isLeap() {
			if (yearNumber % 100 == 0) {
				return yearNumber % 400 == 0;
			} else {
				return yearNumber % 4 == 0;
			}
		}
	}



	class Month{
		private int monthNumber;

		public Month(int month) {
			monthNumber = getMonths(month).getMonthNumber();
		}

		public boolean isFebruary() {
			return monthNumber == 2;
		}

		public int getMonthNumber() {
			return monthNumber;
		}
	}



	class Day{
		private int dayNumber;

		public Day(int day) {
			if (day >= 1 & day <= 31) {
				dayNumber = day;
			} else {
				throw new Error();
			}
		}

		public int getDayNumber() {
			return dayNumber;
		}
	}

}
