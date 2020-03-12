package jc01_2020.shvaichuk.lesson10.task04;

/*
 *
 * Заполнить карту записями вида "фамилия" - "имя". Вывести в консоль все пары значений. Удалить из карты все записи с
 * одинаковыми "именами" (если 2 и более человек имеют одинаковое имя, то удалить всех) и вывести в консоль оставшиеся записи.
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, String> persons = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			String surname = scanner.nextLine();
			String firstName = scanner.nextLine();
			persons.put(surname, firstName);
		}
		System.out.println(persons);
	}

}
