package jc01_2020.shvaichuk.lesson03;

/*
 *
 * Вычислить факториал введенного числа. n >= 0 (0! = 1)
 * n! = 1 * 2 * 3 * 4 * ... * n
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();
		if (numeric < 0)
			System.out.println("Вы ввели неверное число.");
		else {
			long factorial = 1;
			for (int i = 1; i <= numeric; i++) {
				factorial *= i;
			}
			System.out.println(factorial);
		}
	}}
