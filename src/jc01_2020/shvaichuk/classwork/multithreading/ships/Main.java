package jc01_2020.shvaichuk.classwork.multithreading.ships;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ShipGenerator sg = new ShipGenerator();
        ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        es.execute(sg);
    }
}
