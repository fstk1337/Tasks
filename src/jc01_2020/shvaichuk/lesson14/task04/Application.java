package jc01_2020.shvaichuk.lesson14.task04;

/*
 *
 * Десериализовать объект из предыдущей задачи. Вывести в консоль значения всех полей
 *
 */

import jc01_2020.shvaichuk.lesson14.task03.Parking;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;

public class Application {

	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/jc01_2020/shvaichuk/lesson14/resource/Parking.dat"))) {
			Parking parking	= (Parking) ois.readObject();
			System.out.println(parking.getAddress());
			System.out.println(parking.getCapacity());
		} catch (Exception e) {
		}
	}

}
