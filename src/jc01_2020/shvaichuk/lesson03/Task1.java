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
        long temp;
        long maxDigit = 0;
        while (input >= 10) {
            temp = input % 10;
            input = (input - temp) / 10;
            if (temp >= maxDigit)
                maxDigit = temp;
        }
        if (input > maxDigit)
            maxDigit = input;
        System.out.println(maxDigit);
    }
}
