package jc01_2020.shvaichuk.test01;

/*
 *
 * Считать из консоли строку, состоящую из цифр.
 * Вычислить firstSum как сумму каждого четвертого элемента. В сумму включать только те цифры, которые больше 5
 * Вычислить secondSum как сумму каждого второго элемента. В сумму включать только те цифры, которые меньше 5
 * Вывести в консоль большее из значений firstSum и secondSum или слово "равны", если они совпадают
 *
 */

import java.util.Scanner;

public class Comparision {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int firstSum = 0;
		int secondSum = 0;

		for (int i = 3; i < input.length(); i += 4) {
		    int currentNumber = input.charAt(i) - 48;
            if (currentNumber > 5) {
                firstSum += currentNumber;
            }
        }

		for (int i = 1; i < input.length(); i += 2) {
		    int currentNumber = input.charAt(i) - 48;
		    if (currentNumber < 5) {
		        secondSum += currentNumber;
            }
        }

		if (firstSum > secondSum) {
            System.out.println(firstSum);
        } else if (firstSum < secondSum) {
            System.out.println(secondSum);
        } else {
            System.out.println("равны");
        }
	}
}
