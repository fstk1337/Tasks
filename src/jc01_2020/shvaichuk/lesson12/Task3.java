package jc01_2020.shvaichuk.lesson12;

/*
 *
 * Создать карту вида "фамилия"-"имя" из 20 элементов. Длина и фамилии, и имени от 5 до 10 символов
 * 1) Вывести в консоль все значения карты
 * 2) переписать все значения как имя + фамилия
 * 3) оставить в стриме все имена, которые не длиннее 16 символов
 * 4) Вывести в консоль самое длинное имя
 *
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		List<String> lastNames = Arrays.asList(
				"Верясова", "Якупов", "Рыжова", "Покалюк", "Мандрыкин", "Колвецкий", "Молочинский", "Азаренков", "Ягунов",
				"Кочерёжкина", "Орела", "Бармыкина", "Проскура", "Будаев", "Гусарова", "Тюлепова", "Яшина", "Ломоносова",
				"Долженко", "Кочкорбаева");
		List<String> firstNames = Arrays.asList(
				"Дарья", "Давид" , "Алиса" , "Анатолий", "Валентин", "Харитон", "Фадей", "Всеволод", "Гаврила", "Софья",
				"Виктория", "Полина", "Гавриил", "Анатолий", "Ираида", "Валентина", "Альбина", "Инна", "Изольда", "Вероника"
		);

		for (int i = 0; i < lastNames.size(); i++) {
			map.put(lastNames.get(i), firstNames.get(i));
		}

		System.out.println(map.values()); //1

		map.forEach((lastName, firstName) -> map.put(lastName, firstName + " " + lastName)); //2

		String longName = String.valueOf(map.values().stream()
				.filter(s -> s.length() <= 16) //3
				.reduce((s1, s2) -> {
					if (s2.length() > s1.length()) {
						return s2;
					} else {
						return s1;
					}
				})
		);

		System.out.println("longName = " + longName); //4

	}
}





















