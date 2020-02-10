package jc01_2020.shvaichuk.lesson05;

/*
 *
 * Найти в строке указанную подстроку, заменить ее на новую и вывести в консоль результат. Строку, ее подстроку для
 * замены и новую подстроку вводит пользователь.
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String subStr = scanner.nextLine();
		String newStr = scanner.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length() - subStr.length() + 1; i++) {
			if (sb.indexOf(subStr) == -1)
				break;
			else if (sb.substring(i, i + subStr.length()).equals(subStr)) {
				sb.replace(i, i + subStr.length(), newStr);
				i += newStr.length() - 1;
			}
		}
		System.out.println(sb);
	}
}
