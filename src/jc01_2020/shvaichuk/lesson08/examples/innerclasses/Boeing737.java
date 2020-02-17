package jc01_2020.shvaichuk.lesson08.examples.innerclasses;

public class Boeing737 {

    private int manufactureYear;
    private static int maxPassengersCount = 300;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {

        public static int getMaxPassengersCount() {
            return maxPassengersCount;
        }
    }
}
