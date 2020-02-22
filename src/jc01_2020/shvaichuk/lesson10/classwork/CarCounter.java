package jc01_2020.shvaichuk.lesson10.classwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarCounter {

    public static void main(String[] args) {
        List<String> cars = Arrays.asList("VW", "BMW", "Audi", "Ford", "VW", "BMW", "Ford", "Ford", "Audi", "VW");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);

            if (!map.containsKey(car)) {
                int carCount = 0;
                for (String auto : cars) {
                    if (auto.equals(car)) carCount++;
                }
                map.put(car, carCount);
            }
        }
        System.out.println(map);
    }

}
