package jc01_2020.shvaichuk.classwork.multithreading.ships;

public class Ship {

    private Good good;
    private Capacity capacity;

    public Ship(Good good, Capacity capacity) {
        this.good = good;
        this.capacity = capacity;
    }

    public Good getGood() {
        return good;
    }

    public Capacity getCapacity() {
        return capacity;
    }
}
