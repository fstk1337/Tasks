package jc01_2020.shvaichuk.lesson13.classwork;

import java.time.LocalDate;

public class Date {

    private LocalDate now;

    public Date() {
        now = LocalDate.now();
    }

    public void increment() {
        now = now.plusDays(1);
    }

    public LocalDate getNow() {
        return now;
    }
}
