package jc01_2020.shvaichuk.lesson03;

/*
 *
 * Найти все совершенные числа до 10000. Совершенное число - это такое число, которое равно сумме всех своих делителей,
 * кроме себя самого.
 * Например, число 6 является совершенным, т.к. кроме себя самого делится на числа 1, 2 и 3, которые в сумме дают 6.
 *
 * Формат вывода (ошибки недопустимы):
 * каждое число в новой строке
 *
 */

public class Task5 {
	public static void main(String[] args) {
		for (int j = 1; j <= 10_000; j++) {
			int sumOfDividers = 0;
			for (int i = 1; i <= j / 2; i++) {
				if (j % i == 0)
					sumOfDividers += i;
			}
			if (sumOfDividers == j)
				System.out.println(sumOfDividers);
		}
	}
}
