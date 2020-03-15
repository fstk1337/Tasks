package jc01_2020.shvaichuk.lesson12;

/*
 *
 * Создать класс Car с полем enum Color (определите в нем хотя бы 5 цветов) и строковым полем, которое будет хранить
 * текстовое представление цвета. Конструктор принимает и инициализирует только поле-перечисление. Создаем 50 автомобилей
 * случайного цвета. В стриме:
 * 1) заполняем второе поле текущим значением цвета
 * 2) оставляем в стриме первые 10 автомобилей
 * 3) оставляем в стриме все автомобили, значение цвета которых равно цвету последнего элемента перечисления (не задавать
 * цвет в явном виде! я могу менять значения и количество элементов перечисления)
 * 4) вывести в консоль буленовское значение есть ли такой автомобиль
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			int rnd = new Random().nextInt(8);
			cars.add(new Car(Color.getColor(rnd)));
		}

		boolean carExists = cars.stream()
				.peek(Car::setColorText)	//1
				.limit(10)					//2
				.filter(car -> car.getColor().equals(Color.getColor(Color.values().length - 1))) //3
				.anyMatch(car -> car.getColor().equals(Color.getColor(Color.values().length - 1)));

		System.out.println(carExists); //4
	}

	static class Car {
		private Color color;
		private String colorText;

		public Car(Color color) {
			this.color = color;
		}

		public Color getColor() {
			return color;
		}

		public void setColorText() {
			colorText = color.toString();
		}
	}

	enum Color {
		WHITE,
		RED,
		ORANGE,
		YELLOW,
		GREEN,
		BLUE,
		VIOLET,
		BLACK;

		public static Color getColor(int number) {
			return Color.values()[number];
		}
	}
}