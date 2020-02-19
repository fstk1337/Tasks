package jc01_2020.shvaichuk.lesson06.task02;

public class Application {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.addCash(100, 20, 10);
        System.out.println(bankomat.withdrawCash(4200));
        System.out.println("Current amount is " + bankomat.getTotalAmount());
        System.out.println(bankomat.withdrawCash(3500));
        System.out.println("Current amount is " + bankomat.getTotalAmount());
        System.out.println(bankomat.withdrawCash(1000));
        bankomat.addCash(5, 10, 2);
        System.out.println("Current amount is " + bankomat.getTotalAmount());
        System.out.println(bankomat.withdrawCash(1000));
        System.out.println("Current amount is " + bankomat.getTotalAmount());
    }
}
