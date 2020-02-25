package jc01_2020.shvaichuk.lesson08.task01;

/*
 *
 * Написать программу, которая получает на вход латинскую букву в любом регистре и выводит в консоль номер этой буквы
 * в алфавите. Использовать enum
 *
 */

import java.util.Scanner;
import static jc01_2020.shvaichuk.lesson08.task01.Letters.getLetterPosition;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String letter = scanner.next().toUpperCase();
		System.out.println(getLetterPosition(letter));
	}
}
