package jc01_2020.shvaichuk.lesson06.task01;

public class Application {

    public static void main(String[] args) {
        Time time1 = new Time((byte) 5, (byte) 3, (byte) 1);
        Time time2 = new Time((byte) 3, (byte) 7, (byte) 4);
        Time time3 = new Time((byte) 5, (byte) 3, (byte) 1);
        Time time4 = new Time((byte) 5, (byte) 63, (byte) 0);
        Time time5 = new Time((byte) 5, (byte) 3, (byte) 0);

        System.out.println(time1.getFullSeconds());
        System.out.println(time2.getFullSeconds());
        System.out.println(time3.getFullSeconds());
        System.out.println(time4.getFullSeconds());
        System.out.println(time5.getFullSeconds());

        System.out.println(time1.compareTo(time2));
        System.out.println(time1.compareTo(time3));
        System.out.println(time2.compareTo(time3));
        System.out.println(time1.compareTo(time4));
        System.out.println(time1.compareTo(time5));

        Time time6 = new Time(3785);
        System.out.println(time6.seconds);
        System.out.println(time6.minutes);
        System.out.println(time6.hours);
    }

}
