package jc01_2020.shvaichuk.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secret = (int) (Math.random() * 100 + 1);
		int attemptCount = 0;
		System.out.println("Угадай число от 0 до 100:");
		while (attemptCount < 10) {
			int playerNumber = scanner.nextInt();
			if (playerNumber == secret) {
				System.out.println("Число " + secret + " угадано!");
				break;
			} else {
				if (playerNumber > secret)
					System.out.println("Загаданное число меньше введенного.");
				else
					System.out.println("Загаданное число больше введенного.");
				attemptCount++;
				if (attemptCount < 10)
					System.out.println("Попробуй еще раз!");
				else
					System.out.println("Ты проиграл!");
			}
		}
	}
}
