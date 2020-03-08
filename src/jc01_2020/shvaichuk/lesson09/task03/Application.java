package jc01_2020.shvaichuk.lesson09.task03;

/*
 *
 * Заполнить список строками. 5 раз перенести последний элемент списка в начало. Вывести в консоль значения списка в
 * виде массива (["str1","str2","str3"...])
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(scanner.nextLine());
		}
		for (int i = 0; i < 5; i++) {
			list.add(0, list.get(4));
			list.remove(5);
		}
		System.out.println(Arrays.asList(list.toArray()));
	}
}
