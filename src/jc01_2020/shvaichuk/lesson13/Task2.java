package jc01_2020.shvaichuk.lesson13;

/*
 *
 * Сгенерировать текущую дату с учетом временной зоны. Вывести в консоль эту дату в исходном виде и для 10 случайных
 * предустановленных временных зон. Каждую с новой строки с указанием временной зоны
 *
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		ZonedDateTime currentDate = ZonedDateTime.now();
		System.out.println(currentDate);

		List<String> timeZones = new ArrayList<>(ZoneId.getAvailableZoneIds());

		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			int randomZoneNumber = rnd.nextInt(timeZones.size());
			currentDate = currentDate.withZoneSameInstant(ZoneId.of(timeZones.get(randomZoneNumber)));
			System.out.println(currentDate);
		}
	}
}
