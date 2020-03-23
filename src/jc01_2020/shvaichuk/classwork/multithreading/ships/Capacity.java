package jc01_2020.shvaichuk.classwork.multithreading.ships;

public enum Capacity {
    TEN(10),
    FIFTY(50),
    HUNDRED(100);

    private int size;

    Capacity(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
