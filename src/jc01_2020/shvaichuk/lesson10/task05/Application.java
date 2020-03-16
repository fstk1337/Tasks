package jc01_2020.shvaichuk.lesson10.task05;

/*
 *
 * Считать из консоли информацию вида "Покупатель товар количество", где Покупатель — имя покупателя (строка без пробелов),
 * товар — название товара (строка без пробелов), количество — количество приобретенных единиц товара. Сохранить эти
 * данные в карту. Имена покупателей и товаров уникальные. Для каждого покупателя вывести в консоль следующую информацию:
 * "Имя:
 * товар - общее купленное количество этого товара"
 *
 * Вся выходная информация должна быть отсортирована в алфавитном порядке
 *
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		// Объявить список
        Map<String, Map<String, Integer>> map = new TreeMap<>();

        Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			// Заполнить список
            String input = sc.nextLine();
            String[] split = input.split(" ");
            String name = split[0];
            String good = split[1];
            int quantity = Integer.valueOf(split[2]);

            Map<String, Integer> goods = new TreeMap<>();
            goods.put(good, quantity);

            map.put(name, goods);
		}


	}

}
