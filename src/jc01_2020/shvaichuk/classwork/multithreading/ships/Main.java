package jc01_2020.shvaichuk.classwork.multithreading.ships;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel(5);
        ShipGenerator sg = new ShipGenerator(tunnel, 7);
        Pier pier1 = new Pier(Good.BANANA, tunnel);
        Pier pier2 = new Pier(Good.COCONUT, tunnel);
        Pier pier3 = new Pier(Good.MANGO, tunnel);
        ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        es.execute(sg);
        es.execute(pier1);
        es.execute(pier2);
        es.execute(pier3);
    }
}
