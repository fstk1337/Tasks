package jc01_2020.shvaichuk.lesson10.task02;

/*
 *
 * Заполнить множество случайными числами от 0 до 100. Удалить все числа, которые больше 50. Результат вывести в консоль.
 * Используйте Iterator
 *
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < 20; i++) {
			set.add(new Random().nextInt(100));
		}

		set.removeIf(n -> n > 50);

		System.out.println(set);
	}
}
