package jc01_2020.shvaichuk.lesson09.task04;

/*
 *
 * Заполнить список натуральными числами (целые положительные). Вывести в консоль среднее арифметическое всех четных
 * значений
 *
 * N.B. Ноль не является натуральным числом
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		int countEven = 0;
		int sumOfEven = 0;
		for (int i = 0; i < 10; i++) {
			Integer numeric = scanner.nextInt();
			if (numeric <= 0) {
				continue;
			}
			numbers.add(numeric);
			if (numeric % 2 == 0) {
				countEven++;
				sumOfEven += numeric;
			}
		}
		System.out.println(sumOfEven * 1.0 / countEven);
	}

}
