package jc01_2020.shvaichuk.lesson13;

/*
 *
 * Сгенерировать случайную дату в интервале с 1 по 4 марта 2020 (включительно). Вывести в консоль каждую дату и
 * результат сравнения этих дат (дата1 больше/меньше/равна дата2)
 *
 */

import java.time.LocalDate;
import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
		Random rnd = new Random();
		LocalDate date1 = LocalDate.of(2020, 3, rnd.nextInt(4) + 1);
		LocalDate date2 = LocalDate.of(2020, 3, rnd.nextInt(4) + 1);

		System.out.println("дата1: " + date1);
		System.out.println("дата2: " + date2);

		String comparingResult = new String();

		if (date1.isBefore(date2)) {
			comparingResult = " меньше ";
		} else if (date1.isAfter(date2)) {
			comparingResult = " больше ";
		} else {
			comparingResult = " равна ";
		}

		System.out.println("дата1" + comparingResult + "дата2");
	}

}
