package jc01_2020.shvaichuk.lesson09.task05;

/*
 *
 * Заполнить два списка целыми числами. Из первого списка удалить все отрицательные числа. Из второго - все положительные.
 * Создать третий список, состоящий из оставшихся элементов первых двух. Из третьего списка удалить все элементы со
 * значением 0. Вывести итоговый список в консоль. Максимально использовать готовые методы коллекций
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			String str = scanner.next();
			list1.add(Integer.parseInt(str));
		}

		for (int i = 0; i < 5; i++) {
			String str = scanner.next();
			list2.add(Integer.parseInt(str));
		}

		list1.removeIf(n -> n < 0);
		list2.removeIf(n -> n > 0);

		list3.addAll(list1);
		list3.addAll(list2);
		list3.removeIf(n -> n == 0);

		System.out.println(list3);
	}
}
