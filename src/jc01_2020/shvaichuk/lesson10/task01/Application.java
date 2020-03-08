package jc01_2020.shvaichuk.lesson10.task01;

/*
 *
 * Заполнить произвольное множество строками. Вывести в консоль размер множества. Добавить строку, которая уже есть во
 * множестве. Убедиться, что размер не изменился
 *
 */

import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("Nokia");
		set.add("Huawei");
		set.add("Apple");
		set.add("Samsung");
		set.add("ZTE");
		set.add("HTC");
		set.add("Xiaomi");

		System.out.println(set.size());

		set.add("Huawei");

		System.out.println(set.size());
	}

}
