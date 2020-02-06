package jc01_2020.shvaichuk.lesson05;

/*
 *
 * Определить, является ли введенное слово идентификатором, т.е. начинается ли оно с английской буквы в любом регистре
 * или знака подчеркивания и не содержит других символов, кроме букв английского алфавита (в любом регистре), цифр и
 * знака подчеркивания.
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		Pattern pattern = Pattern.compile("[a-zA-Z_]{1}[a-zA-Z0-9_]+");
		Matcher matcher = pattern.matcher(str);
		String output = matcher.matches() ? "Да" : "Нет";
		System.out.println(output);
    }
}
