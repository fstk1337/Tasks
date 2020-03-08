package jc01_2020.shvaichuk.lesson09.task06;

/*
 *
 * Создать и заполнить любыми числами два списка: обычный и связанный. Размер списков - 1 млн элементов.
 * В каждый список добавить 100_000 раз в нулевую позицию значение 0. Вывести в консоль длительности вставки 100_000
 * элементов для обычного и связанного списков.
 *
 * N.B. Поищите сами как засечь время.
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < 1_000_000; i++) {
			arrayList.add(new Random().nextInt(100));
			linkedList.add(new Random().nextInt(100));
		}

		long startTime = System.nanoTime();
		for (int i = 0; i < 100_00; i++) {
			arrayList.add(0, 0);
		}
		long endTime = System.nanoTime();
		System.out.println("Duration for ArrayList: " + (endTime - startTime) + " nanosecs.");

		startTime = System.nanoTime();
		for (int i = 0; i < 100_00; i++) {
			linkedList.add(0, 0);
		}
		endTime = System.nanoTime();
		System.out.println("Duration for LinkedList: " + (endTime - startTime) + " nanosecs.");
	}

}
