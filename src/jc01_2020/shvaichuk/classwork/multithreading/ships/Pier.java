package jc01_2020.shvaichuk.classwork.multithreading.ships;

public class Pier implements Runnable {
    private Good good;
    private Tunnel tunnel;

    public Pier(Good good, Tunnel tunnel) {
        this.good = good;
        this.tunnel = tunnel;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Ship ship = tunnel.getShip(good);
                if (ship != null) {
                    load(ship);
                } else {
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void load(Ship ship) throws InterruptedException {
        int currentLoad = 0;
        while (ship.getCapacity().getSize() > currentLoad) {
            currentLoad += 10;
            Thread.sleep(1000);
            //System.out.println(String.format("Идет загрузка корабля товаром %s, загружено %s единиц.", ship.getGood(), currentLoad));
        }
        System.out.println(String.format("Корабль загружен %s единицами товара %s", currentLoad, ship.getGood()));
    }
}
