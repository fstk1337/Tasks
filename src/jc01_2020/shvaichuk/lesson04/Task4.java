package jc01_2020.shvaichuk.lesson04;

/*
 *
 * В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами (их порядок не важен).
 * Сами минимальный и максимальный элементы в сумму не включать.
 *
 * Пример: {10, 30, 20, 15, 8, 21, 14}. max = 30, min 8. В сумму должны пойти значения 20 и 15. Ответ: 35
 *
 * Формат вывода:
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			minIndex = array[i] < array[minIndex] ? i : minIndex;
			maxIndex = array[i] > array[maxIndex] ? i : maxIndex;
		}
		int direction = minIndex < maxIndex ? 1 : -1;
		int result = 0;
		for (int i = minIndex + direction; i * direction < maxIndex * direction; i = i + direction) {
			result += array[i];
		}
		System.out.println(result);
	}
}
