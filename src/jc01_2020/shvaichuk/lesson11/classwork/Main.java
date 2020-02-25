package jc01_2020.shvaichuk.lesson11.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Dog[] dogs = new Dog[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            sc.nextLine();
            try {
                addDog(createDog());
            } catch (NullPointerException e) {
                System.out.println("Случился NullPointerException");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Случился ArrayIndexOutOfBoundsException");
            }
        }
    }

    public static Dog createDog() {
        return new Random().nextBoolean() ? new Dog() : null;
    }

    public static void addDog(Dog dog) {
        dog.print();
        dogs[new Random().nextInt(20)] = dog;
    }
}
