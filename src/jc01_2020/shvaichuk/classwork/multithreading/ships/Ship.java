package jc01_2020.shvaichuk.classwork.multithreading.ships;

import java.util.concurrent.Semaphore;

public class Ship implements Runnable {
    public static final Semaphore SEMAPHORE = new Semaphore(5, true);
    private Capacity capacity;

    public Ship(Capacity capacity) {
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    private void load() throws InterruptedException {
        int currentLoad = 0;
        System.out.println("Идет загрузка корабля");
        while (capacity.getSize() > currentLoad) {
            currentLoad += 10;
            Thread.sleep(100);
        }
        System.out.println(String.format("Корабль загружен %s единицами товара", currentLoad));
    }

    @Override
    public void run() {
        try {
            SEMAPHORE.acquire();
            load();
            SEMAPHORE.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
