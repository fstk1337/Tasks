package jc01_2020.shvaichuk.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.*;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/jc01_2020/shvaichuk/lesson14/resource/lesson14-01.txt");
		FileInputStream fis = new FileInputStream("src/jc01_2020/shvaichuk/lesson14/resource/lesson14-01.txt");


		String content1 = "";
		Scanner sc = new Scanner(fr);
		content1 += sc.nextLine();
		while (sc.hasNextLine()) {
			content1 += "\n";
			content1 += sc.nextLine();
		}
		fr.close();
		sc.close();


		byte[] buffer = new byte[fis.available()];
		fis.read(buffer, 0, buffer.length);
		String content2 = new String(buffer);

		System.out.println(content1);
		System.out.println(content2);

		System.out.println(content1.equals(content2));
	}

}
