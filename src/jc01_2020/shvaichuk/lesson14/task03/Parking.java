package jc01_2020.shvaichuk.lesson14.task03;

import java.io.Serializable;

public class Parking implements Serializable {
	private String address;
	private int capacity;
	private transient boolean hasEmptyParkingPlaces;

	public Parking(String address, int capacity, boolean hasEmptyParkingPlaces) {
		this.address = address;
		this.capacity = capacity;
		this.hasEmptyParkingPlaces = hasEmptyParkingPlaces;
	}
}
