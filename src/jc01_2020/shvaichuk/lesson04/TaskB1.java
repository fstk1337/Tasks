package jc01_2020.shvaichuk.lesson04;

/*
 *
 * Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b] (квадратные скобки означают,
 * что крайние значения так же включаются в интервал).
 * Освободившиеся в конце массива элементы заполнить нулями.
 *
 * Пример: {4, 10, 18, 5, 11, 22, 13}. Интервал [10, 18].
 * Ответ:
 * 4
 * 5
 * 22
 * 0
 * 0
 * 0
 * 0
 *
 * Формат вывода:
 * значение каждой ячейки массива с новой строки
 *
 */

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int freeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= start && array[i] <= end) {
                array[i] = 0;
                freeIndex = array[freeIndex] != 0 ? i : freeIndex;
            } else {
                int temp = array[i];
                array[i] = 0;
                array[freeIndex] = temp;
                freeIndex++;
            }
        }
        for (int element : array) {
            System.out.println(element);
        }
    }
}
