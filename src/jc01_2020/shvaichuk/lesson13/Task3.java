package jc01_2020.shvaichuk.lesson13;

/*
 *
 * Создать приложение-напоминалку о количестве дней до дней рождения. Использовать карту. Ключ - имя человека,
 * значение - дата рождения (в прошлом, LocalDate). Реализовать метод по добавлению записи в карту (входные параметры имя и дата
 * строкой в формате "дд/мм/гггг"). Реализовать метод, который выведет в консоль имена и оставшиеся дни до
 * ближайшего дня рождения всех ("имя - осталось дней", каждое с новой строки). Отдельно реализовать метод, который
 * вернет кол-во дней для одного конкретного человека (входной параметр - имя)
 *
 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) {
		BDayReminder reminder = new BDayReminder();
		reminder.addRecord("Виталий", "15/01/1990");
		reminder.addRecord("Галина", "12/12/1957");
		reminder.addRecord("Валерий", "14/04/1957");
		reminder.addRecord("Светлана", "20/03/2001");
		reminder.addRecord("Федор", "24/03/2005");

		reminder.printDaysLeft();
	}

	static class BDayReminder {
		private Map<String, LocalDate> bDays = new HashMap<>();

		public void addRecord(String name, String dateString) {
			int year = Integer.parseInt(dateString.substring(6, 10));
			int month = Integer.parseInt(dateString.substring(3, 5));
			int day = Integer.parseInt(dateString.substring(0, 2));

			LocalDate bDate = LocalDate.of(year, month, day);
			bDays.put(name, bDate);
		}

		public void printDaysLeft() {
			for (String name: bDays.keySet()) {
				System.out.println(String.format("%s - осталось %s дней", name, daysToBDay(name)));
			}
		}

		public int daysToBDay(String name) {
			if (!bDays.containsKey(name)) return -1;
			int result = 0;
			LocalDate today = LocalDate.now();
			LocalDate bDay = LocalDate.of(today.getYear(), bDays.get(name).getMonth(), bDays.get(name).getDayOfMonth());
			int todayInt = today.getDayOfYear();
			int bDayInt = bDay.getDayOfYear();

			if (bDay.isBefore(today)) {
				bDay = LocalDate.of(today.getYear() + 1, bDays.get(name).getMonth(), bDays.get(name).getDayOfMonth());
				bDayInt = bDay.getDayOfYear();
				result = (LocalDate.of(today.getYear(), 12, 31).getDayOfYear() - today.getDayOfYear()) + bDay.getDayOfYear();
			} else {
				result = bDay.getDayOfYear() - today.getDayOfYear();
			}
			return result;
		}
	}
}
