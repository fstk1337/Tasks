package jc01_2020.shvaichuk.lesson09.task02;

/*
 *
 * Заполнить список строками. Каждую новую строку вставлять в начало списка. Вывести в консоль строку, с которой
 * начинается список
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			list.add(0, str);
		}
		System.out.println(list.get(0));
	}
}
