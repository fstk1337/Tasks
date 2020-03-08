package jc01_2020.shvaichuk.lesson10.task03;

/*
 *
 * Считать из консоли строку (в строке латинские буквы в разном регистре и пробелы). Вывести в консоль 5 первых уникальных
 * букв, отсортированных по алфавиту. Буквы в разных регистрах считаются одинаковыми. Решить задачу за наименьшее
 * количество действий
 *
 */


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toLowerCase();
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				set.add(String.valueOf(str.charAt(i)));
			}
		}
		ArrayList<String> collect = set.stream().sorted()
												.collect(Collectors.toCollection(ArrayList::new));
		for (int i = 0; i < 5; i++) {
			System.out.println(collect.get(i));
		}
	}

}
