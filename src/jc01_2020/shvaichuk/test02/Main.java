package jc01_2020.shvaichuk.test02;

/*
 *
 * 1) Десериализовать из файла secret.dat объект одной из реализаций интерфейса Employee.
 * 2) Установить значение поля Department в соответствии с реальной профессией (реализовать в классе Department
 * статический метод, который вернет значение перечисления).
 * 3) Установить endDate сегодняшним числом.
 * 4) Установить в поле workPeriod общее время работы в днях ( [startDate, endDate) )
 * 5) В стриме для каждой награды изменить ее имя в соответствии с шаблоном: "дата - имя". Дата в формате дд-мм-гггг
 * 6) В том же стриме отсортировать все награды в прямом хронологическом порядке. Сохранить их в объект
 * 7) Реализовать в интерфейсе Employee метод по умолчанию print(), чтобы вывести значения всех полей (в том числе
 * коллекций) в любом удобно читаемом виде
 * 8) Сохранить в файл resource/result.txt результат выполнения метода employee.print()
 *
 * Работать только через интерфейс Employee
 *
 * Обработать возможные ошибки таким образом, чтобы в консоль записывался текст ошибки и после этого был выброшен
 * RuntimeException.
 *
 */

import java.io.*;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    // Изменить на реальный путь после копирования файлов
    public static final String PATH_FROM = "src/jc01_2020/shvaichuk/test02/resource/secret.dat";
    public static final String PATH_TO = "src/jc01_2020/shvaichuk/test02/resource/result.txt";

    public static void main(String[] args) {
        Employee employee = Helper.getEmployee(); //1
        employee.setDepartment(Department.getDepartment(employee)); //2
        employee.setEndDate(LocalDate.now()); //3
        LocalDate start = employee.getStartDate();
        LocalDate end = employee.getEndDate();
        int days = 0;
        while (!start.isEqual(end)) {
            start = start.plusDays(1);
            days++;
        }
        employee.setWorkPeriod(days); //4

        List<Reward> rewards = employee.getRewards().stream()
                .peek(r -> r.setName(String.format("%s - %s", r.getDate().toString(), r.getName())))
                .sorted(Comparator.comparing(Reward::getDate))
                .collect(Collectors.toList());

        employee.setRewards(rewards);

        try {
            FileWriter writer = new FileWriter(PATH_TO);
            writer.write(employee.print());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    public static Employee getEmployee() {
        Employee result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH_FROM))) {
            result = (Employee) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return result;
    }

}
