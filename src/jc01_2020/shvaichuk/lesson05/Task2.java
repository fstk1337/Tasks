package jc01_2020.shvaichuk.lesson05;

/*
 *
 * Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца. Регистр букв не учитывать
 *
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder sb = new StringBuilder(str);
		while (sb.indexOf(" ") != -1) {
			sb.deleteCharAt(sb.indexOf(" "));
		}
		boolean isPalindrom = sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());
		String output = isPalindrom ? "Да" : "Нет";
		System.out.println(output);
	}
}
