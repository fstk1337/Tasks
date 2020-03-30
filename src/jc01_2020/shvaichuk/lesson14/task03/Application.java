package jc01_2020.shvaichuk.lesson14.task03;

/*
 *
 * Создать объект любого пользовательского класса минимум с тремя полями с ненулевыми значениями.
 * Объявить любое поле несериализуемым.
 * Сериализовать этот объект в файл lesson14/resource/<userClassName>.dat.
 *
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Application {

	public static void main(String[] args) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/jc01_2020/shvaichuk/lesson14/resource/Parking.dat"))) {
			Parking parking = new Parking("Lenina, 89", 21, true);
			oos.writeObject(parking);
		} catch (Exception e) {

		}
	}
}
