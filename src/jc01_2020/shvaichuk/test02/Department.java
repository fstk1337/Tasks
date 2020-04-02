package jc01_2020.shvaichuk.test02;

public enum  Department {

    A1("Кухня"),
    A2("Рентген кабинет"),
    A3("МАЗ");

    private String value;

    Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Department getDepartment(Employee employee) {
        if (employee instanceof Водитель) return Department.A3;
        if (employee instanceof Доктор) return Department.A2;
        return Department.A1;
    }
}
