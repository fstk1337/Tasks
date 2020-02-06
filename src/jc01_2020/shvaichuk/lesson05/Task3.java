package jc01_2020.shvaichuk.lesson05;

/*
 *
 * Найти в строке указанную подстроку, заменить ее на новую и вывести в консоль результат. Строку, ее подстроку для
 * замены и новую подстроку вводит пользователь.
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subStr = scanner.nextLine();
        String newStr = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        while (sb.indexOf(subStr) != -1) {
            sb.replace(sb.indexOf(subStr), sb.indexOf(subStr) + subStr.length(), newStr);
        }
        System.out.println(sb);
    }
}
