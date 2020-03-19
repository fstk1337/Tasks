package jc01_2020.shvaichuk.classwork.date.examples;

import jc01_2020.classwork.date.examples.Date;
import jc01_2020.classwork.date.examples.Employee;
import jc01_2020.classwork.date.examples.StartWork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DateExample {

    public static void main(String[] args) {
        ArrayList<jc01_2020.classwork.date.examples.Employee> employees = new ArrayList<>();
        StartWork startWork = jc01_2020.classwork.date.examples.Employee::new;
        employees.add(startWork.hire("Boris Johnson", LocalDate.of(2019, 3, 10), 1));

        Scanner scanner = new Scanner(System.in);

        jc01_2020.classwork.date.examples.Date now = new Date();

        while (true) {
            if (scanner.nextLine().equals("Exit")) {
                break;
            }
            List<jc01_2020.classwork.date.examples.Employee> fired = new ArrayList<>();

            String result = employees.stream()
                    .filter(employee -> employee.isFire(now.now))
                    .peek(fired::add)
                    .map(employee -> employee.checkTerm(now.now))
                    .filter(Objects::nonNull)
                    .collect(Collectors.joining("\n"));
            System.out.println(now.now);
            System.out.println(result);
            fired.forEach(Employee::notified);
            now.increment();
        }
    }

}
