package jc01_2020.shvaichuk.test02;


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
    List<Reward> getRewards();
    void setRewards(List<Reward> rewards);

    default String print() {
        String str1 = "Встречайте работника по имени " + getName() + " из отдела " + getDepartment().getValue() + "\n";
        String str2 = "Работает с " + getStartDate().toString() + " уже " + getWorkPeriod() + " дней" + "\n";
        List<Reward> rewards = getRewards();
        String str3 = "Награды: \n";
        String str4 = "";
        for (Reward reward: rewards) {
            str4 += reward.getName() + "\n";
        }
        return str1 + str2 + str3 + str4;
    }
}
