package jc01_2020.shvaichuk.lesson11.task03;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Random;

/*
 *
 * В методе invoke при возникновении исключения пробросить в метод main исключение его родительского класса (Exception
 * или RuntimeException). В методе main вывести в консоль фразу "Произошло непроверяемое исключение" для RuntimeException
 * или "Произошло проверяемое исключение" для Exception
 *
 */

public class Application {

	public static void main(String[] args) {
		try {
			invoke();
		} catch (RuntimeException e) {
			System.out.println("Произошло непроверяемое исключение");
		} catch (Exception e) {
			System.out.println("Произошло проверяемое исключение");
		}
	}

	public static void invoke() throws Exception {
		try {
			invokeMethodWithException();
		} catch (Exception e) {
			throw e;
		}
	}

	private static void invokeMethodWithException() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
		int i = new Random().nextInt(4);
		if (i == 0) {
			throw new NullPointerException();
		} else if (i == 1) {
			throw new ArithmeticException();
		} else if (i == 2) {
			throw new FileNotFoundException();
		} else if (i == 3) {
			throw new URISyntaxException("", "");
		}
	}

}
