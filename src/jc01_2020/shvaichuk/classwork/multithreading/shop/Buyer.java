package jc01_2020.shvaichuk.classwork.multithreading.shop;

public class Buyer extends Thread {

    private String good;

    public Buyer(String good) {
        this.good = good;
    }

    public String getGood() {
        return good;
    }

    @Override
    public void run() {
        System.out.println("I bought " + good);
    }
}
