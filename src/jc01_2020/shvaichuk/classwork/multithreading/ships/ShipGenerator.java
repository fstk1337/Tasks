package jc01_2020.shvaichuk.classwork.multithreading.ships;

import java.util.Random;

public class ShipGenerator implements Runnable {

    public Ship generateShip() {
        int capacity = new Random().nextInt(Capacity.values().length);
        return new Ship(Capacity.values()[capacity]);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Ship newShip = generateShip();
            newShip.run();
        }
    }
}
