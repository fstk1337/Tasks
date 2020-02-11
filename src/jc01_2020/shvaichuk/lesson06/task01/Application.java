package jc01_2020.shvaichuk.lesson06.task01;

public class Application {

    public static void main(String[] args) {
        Time time1 = new Time((byte) 5, (byte) 3, (byte) 1);
        Time time2 = new Time((byte) 7, (byte) 7, (byte) 4);
        Time time3 = new Time((byte) 2, (byte) 4, (byte) 0);
        Time time4 = new Time(3785);

        time1.printTime();
        time2.printTime();
        time3.printTime();
        time4.printTime();
	
		System.out.println(time1.compareTo(time2));
		System.out.println(time1.compareTo(time3));
		System.out.println(time1.compareTo(time4));
    }

}
