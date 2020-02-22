package jc01_2020.shvaichuk.lesson07.task01;

public class Box extends Shape {
	private double volume;
	
	public Box(double volume) {
		this.setVolume(volume);
		printVolume();
	}
	
	@Override
	public void calculateVolume() {}
	
	@Override
	public void printVolume() {
		System.out.println("Size = " + getVolume());
	}
	
	public boolean add(Shape shape) {
		System.out.println("Trying to put a " + shape.getClass().getSimpleName() + " into the box...");
		if (this.getVolume() >= shape.getVolume()) {
			setVolume(this.getVolume() - shape.getVolume());
			System.out.println(shape.getClass().getSimpleName() + " was successfully put into the box");
			System.out.println(String.format("Current size of the Box = %.2f", getVolume()));
			return true;
		} else {
			System.out.println(shape.getClass().getSimpleName() + "'s size exceeds the amount of empty space in the box.");
			System.out.println("Adding failed!");
			return false;
		}
	}		
}
