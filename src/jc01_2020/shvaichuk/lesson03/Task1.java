package jc01_2020.shvaichuk.lesson03;

/*
 *
 * С клавиатуры вводится натуральное число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        input = input < 0 ? -input : input;
        long maxDigit = input % 10;
        while (input >= 10) {
            input /= 10;
            maxDigit = input % 10 > maxDigit ? input % 10 : maxDigit;
        }
        System.out.println(maxDigit);
    }
}
