package jc01_2020.shvaichuk.lesson09.task01;

/*
 *
 * Заполнить список строками. Вывести в консоль самую длинную строку
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int longestStringIndex = 0;

		for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
			if (list.get(i).length() > list.get(longestStringIndex).length()) {
			    longestStringIndex = i;
            }
		}

        System.out.println(list.get(longestStringIndex));
	}

}
