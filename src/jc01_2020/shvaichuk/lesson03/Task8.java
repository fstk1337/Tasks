package jc01_2020.shvaichuk.lesson03;

/*
 *
 * Вывести на экран таблицу умножения (от 1 до 9)
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

public class Task8 {
	public static void main(String[] args) {
	    for (int i = 1; i < 10; i++) {
	        for (int j = 1; j < 10; j++) {
                System.out.println(i + " " + "x" + " " + j + " = " + i * j);
            }
        }
	}
}
