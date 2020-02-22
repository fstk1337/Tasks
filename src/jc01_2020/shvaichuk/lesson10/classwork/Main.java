package jc01_2020.shvaichuk.lesson10.classwork;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        for(int i = 0; i < 50; i++) {
            cars.add(new Car(Model.values()[(int)(Math.random() * (Model.values().length))], (int) (Math.random() * 10)));
        }

        for (Car car: cars) {
            System.out.println("Model = " + car.getModel() + ", Size = " + car.getSize());
        }

        Map<Model, Integer> map = new TreeMap<>(new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        for (int i = 0; i < 50; i++) {
            Model model = cars.get(i).getModel();
            if (!map.containsKey(model)) {
                int count = 0;
                for (Car car: cars) {
                    if (car.getModel() == model) {
                        count += car.getSize();
                    }
                }
                map.put(model, count);
            }
        }
        System.out.println(map);
    }
}
