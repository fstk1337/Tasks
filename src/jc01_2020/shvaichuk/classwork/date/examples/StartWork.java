package jc01_2020.shvaichuk.classwork.date.examples;

import jc01_2020.classwork.date.examples.Employee;

import java.time.LocalDate;

public interface StartWork {
        Employee hire(String name, LocalDate startDate, int years);
    }

