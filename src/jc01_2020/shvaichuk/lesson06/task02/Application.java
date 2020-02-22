package jc01_2020.shvaichuk.lesson06.task02;

public class Application {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.addCash(100, 20, 10);
        bankomat.withdrawCash(4200);
        bankomat.printCurrentAmount();
        bankomat.withdrawCash(3500);
        bankomat.printCurrentAmount();
        bankomat.withdrawCash(1000);
        bankomat.addCash(5, 10, 2);
        bankomat.printCurrentAmount();
        bankomat.withdrawCash(1000);
        bankomat.printCurrentAmount();
    }
}
