package jc01_2020.shvaichuk.lesson04;

/*
 *
 * Найти индекс минимального по модулю элемента массива.
 *
 * Пример: {10, -3, -5, 2, 5}. Минимальным по модулю элементом является число 2. Его индекс 3 (т.к. индексация массивов
 * начинается с нуля)
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		array[0] = scanner.nextInt();
		int sign = array[0] < 0 ? -1 : 1;
		array[0] *= sign;
		int minIndex = 0;
		for (int i = 1; i < array.length; i++) {
			array[i] = scanner.nextInt();
			sign = array[i] < 0 ? -1 : 1;
			array[i] *= sign;
			minIndex = array[i] < array[minIndex] ? i : minIndex;
		}
		System.out.println(minIndex);
	}
}
