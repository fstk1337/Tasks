package jc01_2020.shvaichuk.lesson02;

/*
 *
 * Какое из чисел 1, 2 или 3 введено
 * С клавиатуры вводится число. Вывести на экран какое число введено в соответствии с форматом вывода
 *
 * Формат вывода (ошибки недопустимы):
 * "Число 1"
 * "Число 2"
 * "Число 3"
 * "Другое число"
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();
		if (numeric == 1 || numeric == 2 || numeric == 3)
			System.out.println("Число " + numeric);
		else
			System.out.println("Другое число");
	}
}
