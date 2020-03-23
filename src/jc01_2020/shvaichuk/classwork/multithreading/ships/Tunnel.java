package jc01_2020.shvaichuk.classwork.multithreading.ships;

import java.util.ArrayList;
import java.util.List;


public class Tunnel {
    private int maxShips = 5;
    private List<Ship> ships;

    public synchronized void addShip(Ship ship) {
        if (ships.size() < maxShips) {
            ships.add(ship);
        } else {
            System.out.println("Тоннель заполнен.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Tunnel(int maxShips) {
        this.maxShips = maxShips;
        this.ships = new ArrayList<Ship>();
    }

    public int getMaxShips() {
        return maxShips;
    }

    public Ship getShip(Good good) {
        for (Ship ship : ships) {
            if (ship.getGood().equals(good)) {
                System.out.println(String.format("Возьмем корабль вместительностью %s, товаров %s", ship.getCapacity().getSize(), ship.getGood()));
                ships.remove(ship);
                //notifyAll();
                return ship;
            }
        }
        return null;
    }
}
