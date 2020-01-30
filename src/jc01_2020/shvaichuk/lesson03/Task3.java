package jc01_2020.shvaichuk.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		long signFix = input > 0 ? 1 : -1;
		long temp = input * signFix;
		long result = 0;
		int digitCounter = 1;
		while (temp >= 10) {
			temp = (temp - temp % 10) / 10;
			digitCounter++;
		}
		temp = input * signFix;
		for (int i = digitCounter; i > 0 ; i--) {
			long digit = temp % 10;
			temp = (temp - digit) / 10;
			result += digit * Math.pow(10, i - 1);
		}
		System.out.println(result * signFix);
	}
}
