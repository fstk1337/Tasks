package jc01_2020.shvaichuk.lesson12;

/*
 *
 * Дан стрим целых чисел. Вывести в консоль 10 первых нечетных значений. Каждое с новой строки
 *
 * Формат вывода:
 * число
 * число
 * ...
 *
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
	public static void main(String[] args) {
		int start = new Random().nextInt(50);
		System.out.println("start = " + start);

		IntStream.range(start, start + 40)
				.filter(i -> i % 2 == 1)
				.limit(10)
				.forEach(System.out::println);
	}

}
