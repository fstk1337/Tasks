package jc01_2020.shvaichuk.classwork.multithreading.ships;

import java.util.Random;

public class ShipGenerator implements Runnable {

    private int shipCount;
    private Tunnel tunnel;

    public Ship generateShip() {
        int good = new Random().nextInt(Good.values().length);
        int capacity = new Random().nextInt(Capacity.values().length);
        return new Ship(Good.values()[good], Capacity.values()[capacity]);
    }

    public ShipGenerator(Tunnel tunnel, int shipCount) {
        this.tunnel = tunnel;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < shipCount; i++) {
            Ship ship = generateShip();
            tunnel.addShip(ship);
            System.out.println(String.format("Добавлен корабль. Вместимость %s, везет %s", ship.getCapacity().getSize(), ship.getGood()));
        }
    }
}
