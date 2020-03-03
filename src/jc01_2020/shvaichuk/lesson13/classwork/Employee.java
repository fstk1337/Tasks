package jc01_2020.shvaichuk.lesson13.classwork;

import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isNotified;

    public Employee(String name, LocalDate startDate, int years) {
        this.name = name;
        this.startDate = startDate;
        endDate = startDate.plusYears(years);
    }

    public void fire() {
        endDate = LocalDate.now();
    }

    public void notifyMe() {
        isNotified = true;
    }

    public String checkTerm(LocalDate now) {
        if (!isNotified && !now.isAfter(endDate) && !now.plusDays(60).isBefore(endDate)) {
            return name + ", you will be fired soon!";
        }
        return null;
    }

    public boolean beFired(LocalDate now) {
        return !isNotified && !now.isAfter(endDate) && !now.plusDays(60).isBefore(endDate);
    }
}