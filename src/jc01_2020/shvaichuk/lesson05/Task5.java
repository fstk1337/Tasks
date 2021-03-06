package jc01_2020.shvaichuk.lesson05;

/*
 *
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 1; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				sb.replace(i, i + 1, "");
				i = i - 1;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.replace(i, i + 1, "");
					i = i - 1;
				}
			}
		}
		System.out.println(sb);
	}
}
