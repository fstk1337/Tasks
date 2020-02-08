package jc01_2020.shvaichuk.lesson05;

/*
 *
 * Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все числа, которые
 * встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана строка
 * "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0. Каждый эдемент массива вывести
 * в консоль с новой строки
 *
 * Формат вывода:
 * число
 * число
 * число
 * ...
 *
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
        String numsString = "";
        int numsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			if (chr >= '0' && chr <= '9' || chr == ' ') {
                numsString += chr;
				if (i == str.length() - 1 && chr != ' ' || chr != ' ' && str.charAt(i + 1) < '0' || chr != ' ' && str.charAt(i + 1) > '9') {
					numsCount++;
					numsString += ' ';
				}
			}
		}
		int[] numbers = new int[numsCount];
		String numToAdd = "";
		numsCount = 0;
		for (int i = 0; i < numsString.length(); i++) {
			char chr = numsString.charAt(i);
			if (chr != ' ') {
                numToAdd += chr;
				if (i == numsString.length() - 1 || numsString.charAt(i + 1) == ' ') {
					numbers[numsCount++] = Integer.parseInt(numToAdd);
					numToAdd = "";
				}
			} else if (!numToAdd.equals("")) {
				numbers[numsCount++] = Integer.parseInt(numToAdd);
				numToAdd = "";
			}
		}
		
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
