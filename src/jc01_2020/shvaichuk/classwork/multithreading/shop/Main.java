package jc01_2020.shvaichuk.classwork.multithreading.shop;

public class Main {

    public static void main(String[] args) {

        Cashbox cashbox1 = new Cashbox();
        Cashbox cashbox2 = new Cashbox();
        Cashbox cashbox3 = new Cashbox();

        Buyer buyer1 = new Buyer("Pan");
        buyer1.start();

        Buyer buyer2 = new Buyer("Pen");
        buyer2.start();

        Buyer buyer3 = new Buyer("Milk");
        buyer3.start();

        Buyer buyer4 = new Buyer("Bread");
        buyer4.start();

        Buyer buyer5 = new Buyer("Meat");
        buyer5.start();

        Buyer buyer6 = new Buyer("Butter");
        buyer6.start();

    }
}
