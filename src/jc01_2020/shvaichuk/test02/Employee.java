package jc01_2020.shvaichuk.test02;

import jc01_2020.test02.Department;
import jc01_2020.test02.Reward;

import java.time.LocalDate;
import java.util.List;

public interface Employee {

    String getName();
    void setName(String name);
    Department getDepartment();
    void setDepartment(Department department);
    LocalDate getStartDate();
    void setStartDate(LocalDate startDate);
    LocalDate getEndDate();
    void setEndDate(LocalDate endDate);
    int getWorkPeriod();
    void setWorkPeriod(int workPeriod);
    List<jc01_2020.test02.Reward> getRewards();
    void setRewards(List<Reward> rewards);

}
